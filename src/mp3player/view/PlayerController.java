package mp3player.view;

import com.mpatric.mp3agic.Mp3File;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import mp3player.MainApp;
import mp3player.model.*;
import mp3player.util.*;
import javafx.beans.value.ChangeListener;
import java.time.Duration;

public class PlayerController
{
    /**
     * Alle benötigten Variablen und Objekte
     */
    //Playlist list
    private ListView<Playlist> playlistView;
    private ObservableList<Playlist> observablePlaylistsView;

    //Tracks
    private ObservableList<Track> observableTracksView;

    //Reference to main application
    private MainApp mainApp;

    //Initialize playerModel and current media
    private Track currentTrack;
    private Track prevTrack;
    private Track nextTrack;
    private Mp3File mp3File;
    private Player playerModel;

    private static Boolean playlistViewEnabled = false;
    private static Boolean soundMuted = false;
    private static Boolean songPaused = false;
    private static Boolean shuffleActivated = false;
    private static Boolean repeatActivated = false;

    public PlayerController(Player playerModel) { this.playerModel = playerModel; }

    private void intitialize()
    {
        //setupPlaylistView();
        //setupTrackTableView();
    }

    public void setMainApp(MainApp mainApp) { this.mainApp = mainApp; }

    public static void handlePlayTrigger(Button buttonPlay)
    {
        songPaused = !songPaused;
        if(!songPaused)
        {
            System.out.println("pause");
            buttonPlay.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/playButton.png",
                    buttonPlay.getPrefWidth(),buttonPlay.getPrefHeight(),true,true)));
            buttonPlay.setContentDisplay(ContentDisplay.CENTER);
            buttonPlay.setStyle("-fx-background-color: transparent;");
            //pause
        }
        else if (songPaused)
        {
            System.out.println("play");
            buttonPlay.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/pauseButton.png",
                    buttonPlay.getPrefWidth(),buttonPlay.getPrefHeight(),true,true)));
            buttonPlay.setContentDisplay(ContentDisplay.CENTER);
            buttonPlay.setStyle("-fx-background-color: transparent;");
            //play
        }
    }

    private void handleNextTrack() { if (nextTrack != null) playTrack(nextTrack); }

    private void playTrack(Track track)
    {
        currentTrack = track;
        int totalTracks = observablePlaylistsView.size();
        int currentTrackNumber = observablePlaylistsView.indexOf(currentTrack);
        int nextTrackNumber = currentTrackNumber++;
        int prevTrackNumber = currentTrackNumber--;
        if (prevTrackNumber >= 0) prevTrack = observableTracksView.get(prevTrackNumber);
        else prevTrack = observableTracksView.get(totalTracks--);
        if (nextTrackNumber < totalTracks) nextTrack = observableTracksView.get(nextTrackNumber);
        else nextTrack = observableTracksView.get(0);

        PlaylistView.selectTrackTableView(currentTrack);
    }
}
