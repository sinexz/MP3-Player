package mp3player.view;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Bounds;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;
import mp3player.MainApp;
import mp3player.model.*;
import mp3player.util.*;
import javafx.beans.value.ChangeListener;

import java.io.IOException;
import java.io.InputStream;

public class PlayerController
{
    /**
     * Alle benötigten Variablen und Objekte
     */
    //Playlist list
    public static ListView<Playlist> playlistView;
    public static ObservableList<Playlist> observablePlaylistView;

    //Tracks
    private static ObservableList<Track> observableTracksView;
    private static TableColumn<Track, String> title;
    private static TableColumn<Track, String> artist;
    private static TableColumn<Track, String> album;

    //Player info
    static ChangeListener<Duration> progressChangeListener;

    //Reference to main application
    private static MainApp mainApp;

    //Initialize playerModel and current media
    private static Track currentTrack;
    private static Track prevTrack;
    private static Track nextTrack;
    private static Mp3File mp3File;
    private static Player playerModel;

    private static Boolean playlistViewEnabled = false;
    private static Boolean soundMuted = false;
    private static Boolean songPaused = false;
    private static Boolean shuffleActivated = false;
    private static Boolean repeatActivated = false;

    public PlayerController(Player playerModel) { this.playerModel = playerModel; }

    public static void intitialize()
    {
        PlayerView.buttonPlay.setOnAction(e -> handlePlayTrigger() );
        PlayerView.buttonNext.setOnAction(e -> handleNextTrack() );
        PlayerView.buttonPrev.setOnAction(e -> handlePrevTrack() );
        PlayerView.buttonReplay.setOnAction(e -> handleReplayTrack() );
        PlayerView.buttonShuffle.setOnAction(e -> handleShuffleTrigger() );
        PlayerView.buttonSound.setOnAction(e -> handleMuteButton() );
        //setupPlaylistView();
        //setupTrackTableView();
    }

    private static void handleReplayTrack() {
    }

    private static void handleShuffleTrigger() {
    }

    private static void handleMuteButton() {
    }

    public void setMainApp(MainApp mainApp) { this.mainApp = mainApp; }

    public static void handlePlayTrigger()
    {
            if (playerModel != null)
            {
                songPaused = !songPaused;
                if(!songPaused)
                {
                    playerModel.pause();
                }
                else if (songPaused)
                {
                    playerModel.play();
                }
            }
    }

    private static void handleNextTrack()
    {
        if (nextTrack != null) playTrack(nextTrack);
    }

    private static void handlePrevTrack()
    {
        if (nextTrack != null) playTrack(prevTrack);
    }

    private static void setupPlaylistView()
    {
        observablePlaylistView = PlayListUtil.getAll();
        playlistView.setItems(observablePlaylistView);

        playlistView.setCellFactory((ListView<Playlist> p) ->
        {
            ListCell<Playlist> cell = new ListCell<Playlist>()
            {
                @Override
                protected void updateItem(Playlist playlist, boolean bln) {
                    super.updateItem(playlist, bln);
                    if (playlist != null)
                    {
                        setText("" + playlist.getName().getValue());
                    }
                }
            };
            return cell;
        });

        PlaylistView.trackTableView.setOnMouseClicked((MouseEvent click) ->
        {
            if (click.getClickCount() == 2)
            {
                Playlist selectedPlaylist = playlistView.getSelectionModel().getSelectedItem();
                if (selectedPlaylist != null)
                {
                    boolean okClicked = mainApp.showPlaylistDialog(selectedPlaylist);
                    if(okClicked)
                    {
                        PlayListUtil.savePlaylist(selectedPlaylist);
                        observablePlaylistView.add(selectedPlaylist);
                    }
                    Platform.runLater(() ->
                    {
                        PlayListUtil.refreshList(playlistView);
                        TrackUtil.refreshTable(PlaylistView.trackTableView);
                    });
                }
            }
        });

        playlistView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showPlaylistDetails(newValue));
    }

    private static void setupTrackTableView()
    {
        title = PlaylistView.title;
        artist = PlaylistView.artist;
        album = PlaylistView.album;

        title.setCellValueFactory(
                cellData -> cellData.getValue().getTitle());
        artist.setCellValueFactory(
                cellData -> cellData.getValue().getArtist());
        album.setCellValueFactory(
                cellData -> cellData.getValue().getAlbum());

        PlaylistView.trackTableView.setRowFactory( tv ->
        {
            TableRow<Track> row = new TableRow<>();
            row.setOnMouseClicked(event ->
            {
                if (event.getClickCount() == 2 && (! row.isEmpty()))
                {
                    Track track = row.getItem();
                    playTrack(track);
                }
            });
            return row;
        });
    }

    private static void showPlaylistDetails(Playlist playlist)
    {
        Platform.runLater(() ->
        {
            try {
                observableTracksView = TrackUtil.getAll(playlist, PlaylistView.trackTableView);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (UnsupportedTagException e) {
                e.printStackTrace();
            } catch (InvalidDataException e) {
                e.printStackTrace();
            }
            PlaylistView.trackTableView.setItems(observableTracksView);
        });

        Platform.runLater(() ->
        {
            TrackUtil.refreshTable(PlaylistView.trackTableView);
        });
    }

    private static void playTrack(Track track)
    {
        currentTrack = track;
        int totalTracks = observablePlaylistView.size();
        int currentTrackNumber = observablePlaylistView.indexOf(currentTrack);
        int nextTrackNumber = currentTrackNumber++;
        int prevTrackNumber = currentTrackNumber--;
        if (prevTrackNumber >= 0) prevTrack = observableTracksView.get(prevTrackNumber);
        else prevTrack = observableTracksView.get(totalTracks--);
        if (nextTrackNumber < totalTracks) nextTrack = observableTracksView.get(nextTrackNumber);
        else nextTrack = observableTracksView.get(0);

        PlaylistView.trackTableView.getSelectionModel().select(currentTrack);

        if (playerModel != null)
        {
            playerModel.pause();
            playerModel = null;
        }
        playerModel = new Player(currentTrack);
        playerModel.play();
        setCurrentlyPlaying(playerModel);
        setMediaInfo(currentTrack) ;
    }

    private static void setCurrentlyPlaying(Player player)
    {
        player.seek(0);
        PlayerView.progressBar.setProgress(0);

        PlayerView.progressBar.setOnMouseClicked((MouseEvent event) ->
        {
            if (event.getButton() == MouseButton.PRIMARY)
            {
                Bounds bl = PlayerView.progressBar.getLayoutBounds();
                double mouseX = event.getSceneX();
                double percent = (((bl.getMinX() + mouseX) * 100) / bl.getMaxX());
                percent -= 2;
                double totalDurationMillis = player.getTotalTime() * 1000;
                double seek = (totalDurationMillis * percent) / 100;
                player.seek((int) seek);
            }
        });

        progressChangeListener = (ObservableValue<? extends  Duration> observableValue,
            Duration oldValue, Duration newValue) ->
        {
            double currentTimeMillis = player.getActTime() * 1000;
            double totalDurationMillis = player.getTotalTime() * 1000;
            PlayerView.progressBar.setProgress(1.0 * currentTimeMillis / totalDurationMillis);

            double currentTimeSeconds = player.getActTime();
            int minutes = (int) (currentTimeSeconds % 3600) / 60;
            int seconds = (int) currentTimeSeconds % 60;
            String formattedMinutes = String.format("%02d", minutes);
            String formattedSeconds = String.format("%02d", seconds);
            PlayerView.labelTimeLeft.setText(formattedMinutes + ":" + formattedSeconds);
        };

        player.getPlayingStatus().addListener(new ChangeListener<Boolean>()
        {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue)
            {
                if (!newValue &&
                        (player.getTotalTime() >= currentTrack.getMp3File().getId3v2Tag().getLength() -2
                                || currentTrack.getMp3File().getId3v2Tag().getLength() >= player.getTotalTime() - 2))
                {
                    player.getPlayingStatus().removeListener(this::changed);
                    handleNextTrack();
                }
                else if(!newValue)
                {
                    System.out.println("pause");
                    PlayerView.buttonPlay.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/playButton.png",
                            PlayerView.buttonPlay.getPrefWidth(),PlayerView.buttonPlay.getPrefHeight(),true,true)));
                    PlayerView.buttonPlay.setContentDisplay(ContentDisplay.CENTER);
                    PlayerView.buttonPlay.setStyle("-fx-background-color: transparent;");
                }
                if(newValue)
                {
                    System.out.println("play");
                    PlayerView.buttonPlay.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/pauseButton.png",
                            PlayerView.buttonPlay.getPrefWidth(),PlayerView.buttonPlay.getPrefHeight(),true,true)));
                    PlayerView.buttonPlay.setContentDisplay(ContentDisplay.CENTER);
                    PlayerView.buttonPlay.setStyle("-fx-background-color: transparent;");
                }

            }
        });
    }

    private static void setMediaInfo(Track track)
    {
        PlayerView.labelSong.setText(track.getTitle().getValue());
        Tooltip titleTooltip = new Tooltip(track.getTitle().getValue() + "\r" + track.getArtist().getValue());
        titleTooltip.setTextAlignment(TextAlignment.CENTER);
        PlayerView.labelSong.setTooltip(titleTooltip);
        PlayerView.labelInterpret.setText(track.getArtist().getValue());

        InputStream defaultAlbumStream = PlayerController.class.getResourceAsStream("img/defaultAlbumCover.png");
        Image defaultAlbumImage = new Image(defaultAlbumStream);

        if(track.getImage() == null)
        {
            CoverView.hBoxImg.setBackground(new Background(new BackgroundImage(defaultAlbumImage,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT)));
        }
        else
        {
            CoverView.hBoxImg.setBackground(new Background(new BackgroundImage(track.getImage(),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT)));
        }
    }
}
