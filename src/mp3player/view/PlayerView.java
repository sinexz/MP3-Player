package mp3player.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import mp3player.model.Player;

public class PlayerView extends SplitPane
{

    //Erstellung der benötigten Variable

    protected final SplitPane view;
    protected final AnchorPane anchorPaneTop;
    protected final AnchorPane anchorPaneBot;
    protected final VBox VBoxBot;
    protected final VBox vBoxSong;
    protected final Label labelSong;
    protected final Label labelInterpret;
    protected final HBox hBoxTimeBar;
    protected final Label labelTimeLeft;
    protected final ProgressBar progressBar;
    protected final Label labelTimeRight;
    protected final HBox hBoxPlayerMenu;
    protected final HBox hBoxPlaylist;
    protected final Button buttonPlaylist;
    protected final HBox hBoxPlayer;
    protected final Button buttonRewind;
    protected final Button buttonBack;
    protected final Button buttonPlay;
    protected final Button buttonNext;
    protected final Button buttonShuffle;
    protected final HBox hBoxAudio;
    protected final Button buttonSound;
    protected final Slider sliderAudio;
    protected PlayerViewController playerViewController;
    protected Player playerModel;
    protected PlaylistView playlistView;
    protected CoverView coverView;
    protected Boolean playlistViewEnabled = false;
    protected Boolean soundMuted = false;
    protected Boolean songPaused = false;
    protected Boolean shuffleActivated = false;
    protected Boolean repeatActivated = false;

    public PlayerView(PlayerViewController playerViewController, Player playerModel) {
        this.playerViewController = playerViewController;
        this.playerModel = playerModel;
        playlistView = new PlaylistView(playerViewController, playerModel);
        coverView = new CoverView(playerViewController, playerModel);
        view = new SplitPane();
        anchorPaneTop = new AnchorPane();
        anchorPaneBot = new AnchorPane();
        VBoxBot = new VBox();
        vBoxSong = new VBox();
        labelSong = new Label();
        labelInterpret = new Label();
        hBoxTimeBar = new HBox();
        labelTimeLeft = new Label();
        progressBar = new ProgressBar();
        labelTimeRight = new Label();
        hBoxPlayerMenu = new HBox();
        hBoxPlaylist = new HBox();
        buttonPlaylist = new Button();
        hBoxPlayer = new HBox();
        buttonRewind = new Button();
        buttonBack = new Button();
        buttonPlay = new Button();
        buttonNext = new Button();
        buttonShuffle = new Button();
        hBoxAudio = new HBox();
        buttonSound = new Button();
        sliderAudio = new Slider();

        //SplitPane
        view.setDividerPositions(0.6);
        view.setPrefHeight(425.0);
        view.setPrefWidth(480.0);
        view.setMaxHeight(USE_PREF_SIZE);
        view.setMaxWidth(USE_PREF_SIZE);
        view.setMinHeight(USE_PREF_SIZE);
        view.setMinWidth(USE_PREF_SIZE);
        view.setOrientation(javafx.geometry.Orientation.VERTICAL);

        //SplitPane Oben - Bild
        anchorPaneTop.setPrefHeight(500.0);
        anchorPaneTop.setPrefWidth(500.0);
        anchorPaneTop.setMaxHeight(USE_PREF_SIZE);
        anchorPaneTop.setMaxWidth(USE_PREF_SIZE);
        anchorPaneTop.setMinHeight(USE_PREF_SIZE);
        anchorPaneTop.setMinWidth(USE_PREF_SIZE);
        anchorPaneTop.setBackground(new Background(new BackgroundFill(Color
                .rgb(17, 119, 255), CornerRadii.EMPTY, Insets.EMPTY)));

        //AnchorPane für den Unteren Splitbereich
        anchorPaneBot.setPrefHeight(130.0);
        anchorPaneBot.setPrefWidth(500.0);
        anchorPaneBot.setMaxHeight(USE_PREF_SIZE);
        anchorPaneBot.setMaxWidth(USE_PREF_SIZE);
        anchorPaneBot.setMinHeight(USE_PREF_SIZE);
        anchorPaneBot.setMinWidth(USE_PREF_SIZE);

        //Vbox für den Player-Controller
        VBoxBot.setPrefHeight(150.0);
        VBoxBot.setPrefWidth(480.0);
        VBoxBot.setMaxHeight(USE_PREF_SIZE);
        VBoxBot.setMaxWidth(USE_PREF_SIZE);
        VBoxBot.setMinHeight(USE_PREF_SIZE);
        VBoxBot.setMinWidth(USE_PREF_SIZE);
        VBoxBot.setPadding(new Insets(5,0,0,0));

        // Die Vbox für die Labels, songname und interpret
        vBoxSong.setPrefHeight(50.0);
        vBoxSong.setPrefWidth(480.0);
        vBoxSong.setAlignment(Pos.CENTER);
        vBoxSong.setMaxHeight(USE_PREF_SIZE);
        vBoxSong.setMaxWidth(USE_PREF_SIZE);
        vBoxSong.setMinHeight(USE_PREF_SIZE);
        vBoxSong.setMinWidth(USE_PREF_SIZE);

        //Label für den Songnamen
        labelSong.setPrefHeight(27.0);
        labelSong.setPrefWidth(200.0);
        labelSong.setMaxHeight(USE_PREF_SIZE);
        labelSong.setMaxWidth(USE_PREF_SIZE);
        labelSong.setMinHeight(USE_PREF_SIZE);
        labelSong.setMinWidth(USE_PREF_SIZE);
        labelSong.setText("Titel der Playlist");
        labelSong.setAlignment(Pos.CENTER);
        labelSong.setFont(new Font(18.0));

        //Label für den Interpreten
        labelInterpret.setPrefHeight(27.0);
        labelInterpret.setPrefWidth(200.0);
        labelInterpret.setMaxHeight(USE_PREF_SIZE);
        labelInterpret.setMaxWidth(USE_PREF_SIZE);
        labelInterpret.setMinHeight(USE_PREF_SIZE);
        labelInterpret.setMinWidth(USE_PREF_SIZE);
        labelInterpret.setText("Interpet");
        labelInterpret.setAlignment(Pos.CENTER);
        labelInterpret.setFont(new Font(18.0));

        //die Hbox für die Zeitleiste
        hBoxTimeBar.setPrefHeight(20.0);
        hBoxTimeBar.setPrefWidth(480.0);
        hBoxTimeBar.setAlignment(Pos.BOTTOM_CENTER);
        hBoxTimeBar.setMaxHeight(USE_PREF_SIZE);
        hBoxTimeBar.setMaxWidth(USE_PREF_SIZE);
        hBoxTimeBar.setMinHeight(USE_PREF_SIZE);
        hBoxTimeBar.setMinWidth(USE_PREF_SIZE);

        //Label für den Anfang des Songs
        labelTimeLeft.setPrefHeight(14.0);
        labelTimeLeft.setPrefWidth(30.0);
        labelTimeLeft.setAlignment(Pos.CENTER_RIGHT);
        labelTimeLeft.setMaxHeight(USE_PREF_SIZE);
        labelTimeLeft.setMaxWidth(USE_PREF_SIZE);
        labelTimeLeft.setMinHeight(USE_PREF_SIZE);
        labelTimeLeft.setMinWidth(USE_PREF_SIZE);
        labelTimeLeft.setText("00:00");
        HBox.setMargin(labelTimeLeft, new Insets(10.0, 5.0, 0.0, 0.0));

        //Zeitleiste
        progressBar.setPrefHeight(10.0);
        progressBar.setPrefWidth(370.0);
        progressBar.setMaxHeight(USE_PREF_SIZE);
        progressBar.setMaxWidth(USE_PREF_SIZE);
        progressBar.setMinHeight(USE_PREF_SIZE);
        progressBar.setMinWidth(USE_PREF_SIZE);
        progressBar.setProgress(0.0);
        HBox.setMargin(progressBar, new Insets(20.0, 0.0, 0.0, 0.0));

        //Label für die restliche Zeit
        labelTimeRight.setPrefHeight(14.0);
        labelTimeRight.setPrefWidth(30.0);
        labelTimeRight.setMaxHeight(USE_PREF_SIZE);
        labelTimeRight.setMaxWidth(USE_PREF_SIZE);
        labelTimeRight.setMinHeight(USE_PREF_SIZE);
        labelTimeRight.setMinWidth(USE_PREF_SIZE);
        labelTimeRight.setText("00:00");
        HBox.setMargin(labelTimeRight, new Insets(10.0, 0.0, 0.0, 5.0));

        // Hbox für die 3 Hboxen, die den Player steuern.
        hBoxPlayerMenu.setPrefHeight(40.0);
        hBoxPlayerMenu.setPrefWidth(480.0);
        hBoxPlayerMenu.setAlignment(Pos.TOP_CENTER);
        hBoxPlayerMenu.setMaxHeight(USE_PREF_SIZE);
        hBoxPlayerMenu.setMaxWidth(USE_PREF_SIZE);
        hBoxPlayerMenu.setMinHeight(USE_PREF_SIZE);
        hBoxPlayerMenu.setMinWidth(USE_PREF_SIZE);


        //Die Hbox für den Playlistbutton
        hBoxPlaylist.setPrefHeight(50.0);
        hBoxPlaylist.setPrefWidth(50.0);
        hBoxPlaylist.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBoxPlaylist.setMaxHeight(USE_PREF_SIZE);
        hBoxPlaylist.setMaxWidth(USE_PREF_SIZE);
        hBoxPlaylist.setMinHeight(USE_PREF_SIZE);
        hBoxPlaylist.setMinWidth(USE_PREF_SIZE);

        //Knopf für das Wechseln auf die Playlist
        buttonPlaylist.setPrefHeight(55.0);
        buttonPlaylist.setPrefWidth(55.0);
        buttonPlaylist.setMaxHeight(USE_PREF_SIZE);
        buttonPlaylist.setMaxWidth(USE_PREF_SIZE);
        buttonPlaylist.setMinHeight(USE_PREF_SIZE);
        buttonPlaylist.setMinWidth(USE_PREF_SIZE);
        buttonPlaylist.setMnemonicParsing(false);
        //buttonPlaylist.setText("Playlist");
        HBox.setMargin(buttonPlaylist, new Insets(0.0, 0.0, 0.0, 10.0));
        buttonPlaylist.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/playlistButton.png",
                buttonPlaylist.getPrefWidth(),buttonPlaylist.getPrefHeight(),true,true)));
        buttonPlaylist.setContentDisplay(ContentDisplay.CENTER);
        buttonPlaylist.setStyle("-fx-background-color: transparent;");
        buttonPlaylist.setOnAction(e ->
        {
            System.out.println("jude");
            playlistViewEnabled = !playlistViewEnabled;
            if(playlistViewEnabled == false)
            {
                anchorPaneTop.getChildren().remove(playlistView.splitPane);
                anchorPaneTop.getChildren().addAll(coverView.anchorPaneTop);
            }
            else if (playlistViewEnabled == true)
            {
                anchorPaneTop.getChildren().remove(coverView.anchorPaneTop);
                anchorPaneTop.getChildren().addAll(playlistView.splitPane);
            }
        });

        // Hbox für den Player unten + Buttons
        hBoxPlayer.setPrefHeight(50.0);
        hBoxPlayer.setPrefWidth(370.0);
        hBoxPlayer.setSpacing(10.0);
        hBoxPlayer.setAlignment(Pos.BOTTOM_CENTER);
        hBoxPlayer.setMaxHeight(USE_PREF_SIZE);
        hBoxPlayer.setMaxWidth(USE_PREF_SIZE);
        hBoxPlayer.setMinHeight(USE_PREF_SIZE);
        hBoxPlayer.setMinWidth(USE_PREF_SIZE);

        // Knopf für "Wiederholen"
        buttonRewind.setPrefHeight(30.0);
        buttonRewind.setPrefWidth(30.0);
        //buttonRewind.setText("Rewind");
        buttonRewind.setFont(new Font(10.0));
        buttonRewind.setMaxHeight(USE_PREF_SIZE);
        buttonRewind.setMaxWidth(USE_PREF_SIZE);
        buttonRewind.setMinHeight(USE_PREF_SIZE);
        buttonRewind.setMinWidth(USE_PREF_SIZE);
        buttonRewind.setMnemonicParsing(false);
        buttonRewind.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/repeatButton.png",
                buttonRewind.getPrefWidth(),buttonRewind.getPrefHeight(),true,true)));
        buttonRewind.setContentDisplay(ContentDisplay.CENTER);
        buttonRewind.setStyle("-fx-background-color: transparent;");
        buttonRewind.setOnAction(e ->
        {
            System.out.println("repeat");
            repeatActivated = !repeatActivated;
            if(repeatActivated == false)
            {
                buttonRewind.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/repeatButton.png",
                        buttonRewind.getPrefWidth(),buttonRewind.getPrefHeight(),true,true)));
                buttonRewind.setContentDisplay(ContentDisplay.CENTER);
                buttonRewind.setStyle("-fx-background-color: transparent;");
            }
            else if (repeatActivated == true)
            {
                buttonRewind.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/repeatButtonPressed.png",
                        buttonRewind.getPrefWidth(),buttonRewind.getPrefHeight(),true,true)));
                buttonRewind.setContentDisplay(ContentDisplay.CENTER);
                buttonRewind.setStyle("-fx-background-color: transparent;");
            }
        });

        buttonBack.setPrefHeight(30.0);
        buttonBack.setPrefWidth(30.0);
        //buttonBack.setText("Back");
        buttonBack.setFont(new Font(10.0));
        buttonBack.setMaxHeight(USE_PREF_SIZE);
        buttonBack.setMaxWidth(USE_PREF_SIZE);
        buttonBack.setMinHeight(USE_PREF_SIZE);
        buttonBack.setMinWidth(USE_PREF_SIZE);
        buttonBack.setMnemonicParsing(false);
        buttonBack.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/rewindButton.png",
                buttonBack.getPrefWidth(),buttonBack.getPrefHeight(),true,true)));
        buttonBack.setContentDisplay(ContentDisplay.CENTER);
        buttonBack.setStyle("-fx-background-color: transparent;");

        //Knopf für spielen/pause
        buttonPlay.setPrefHeight(35.0);
        buttonPlay.setPrefWidth(35.0);
        //buttonPlay.setText("Play");
        buttonPlay.setFont(new Font(10.0));
        buttonPlay.setMaxHeight(USE_PREF_SIZE);
        buttonPlay.setMaxWidth(USE_PREF_SIZE);
        buttonPlay.setMinHeight(USE_PREF_SIZE);
        buttonPlay.setMinWidth(USE_PREF_SIZE);
        buttonPlay.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/playButton.png",
                buttonPlay.getPrefWidth(),buttonPlay.getPrefHeight(),true,true)));
        buttonPlay.setContentDisplay(ContentDisplay.CENTER);
        buttonPlay.setStyle("-fx-background-color: transparent;");
        buttonPlay.setOnAction(e ->
        {
            System.out.println("play");
            songPaused = !songPaused;
            if(songPaused == false)
            {
                buttonPlay.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/playButton.png",
                        buttonPlay.getPrefWidth(),buttonPlay.getPrefHeight(),true,true)));
                buttonPlay.setContentDisplay(ContentDisplay.CENTER);
                buttonPlay.setStyle("-fx-background-color: transparent;");
            }
            else if (songPaused == true)
            {
                buttonPlay.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/pauseButton.png",
                        buttonPlay.getPrefWidth(),buttonPlay.getPrefHeight(),true,true)));
                buttonPlay.setContentDisplay(ContentDisplay.CENTER);
                buttonPlay.setStyle("-fx-background-color: transparent;");
            }
        });

        //Knopf für nächstes Lied
        buttonNext.setPrefHeight(30.0);
        buttonNext.setPrefWidth(30.0);
        //buttonNext.setText("Next");
        buttonNext.setFont(new Font(10.0));
        buttonNext.setMaxHeight(USE_PREF_SIZE);
        buttonNext.setMaxWidth(USE_PREF_SIZE);
        buttonNext.setMinHeight(USE_PREF_SIZE);
        buttonNext.setMinWidth(USE_PREF_SIZE);
        buttonNext.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/forwardButton.png",
                buttonNext.getPrefWidth(),buttonNext.getPrefHeight(),true,true)));
        buttonNext.setContentDisplay(ContentDisplay.CENTER);
        buttonNext.setStyle("-fx-background-color: transparent;");

        //Knopf für "Shuffle"
        buttonShuffle.setPrefHeight(30.0);
        buttonShuffle.setPrefWidth(30.0);
        //buttonShuffle.setText("Shuffle");
        buttonShuffle.setFont(new Font(10.0));
        buttonShuffle.setMaxHeight(USE_PREF_SIZE);
        buttonShuffle.setMaxWidth(USE_PREF_SIZE);
        buttonShuffle.setMinHeight(USE_PREF_SIZE);
        buttonShuffle.setMinWidth(USE_PREF_SIZE);
        buttonShuffle.setMnemonicParsing(false);
        buttonShuffle.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/shuffleButton.png",
                buttonShuffle.getPrefWidth(),buttonShuffle.getPrefHeight(),true,true)));
        buttonShuffle.setContentDisplay(ContentDisplay.CENTER);
        buttonShuffle.setStyle("-fx-background-color: transparent;");
        HBox.setMargin(hBoxPlayer, new Insets(0.0));
        buttonShuffle.setOnAction(e ->
        {
            System.out.println("shuffle");
            shuffleActivated = !shuffleActivated;
            if(shuffleActivated == false)
            {
                buttonShuffle.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/shuffleButton.png",
                        buttonShuffle.getPrefWidth(),buttonShuffle.getPrefHeight(),true,true)));
                buttonShuffle.setContentDisplay(ContentDisplay.CENTER);
                buttonShuffle.setStyle("-fx-background-color: transparent;");
            }
            else if (shuffleActivated == true)
            {
                buttonShuffle.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/shuffleButtonPressed.png",
                        buttonShuffle.getPrefWidth(),buttonShuffle.getPrefHeight(),true,true)));
                buttonShuffle.setContentDisplay(ContentDisplay.CENTER);
                buttonShuffle.setStyle("-fx-background-color: transparent;");
            }
        });

        //Die 3te Hbox für den Player unten
        hBoxAudio.setPrefHeight(50.0);
        hBoxAudio.setPrefWidth(60.0);
        hBoxAudio.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBoxAudio.setMaxHeight(USE_PREF_SIZE);
        hBoxAudio.setMaxWidth(USE_PREF_SIZE);
        hBoxAudio.setMinHeight(USE_PREF_SIZE);
        hBoxAudio.setMinWidth(USE_PREF_SIZE);

        buttonSound.setPrefHeight(30.0);
        buttonSound.setPrefWidth(30.0);
        //buttonShuffle.setText("Shuffle");
        buttonSound.setFont(new Font(10.0));
        buttonSound.setMaxHeight(USE_PREF_SIZE);
        buttonSound.setMaxWidth(USE_PREF_SIZE);
        buttonSound.setMinHeight(USE_PREF_SIZE);
        buttonSound.setMinWidth(USE_PREF_SIZE);
        buttonSound.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/volumeButton.png",
                buttonSound.getPrefWidth(),buttonSound.getPrefHeight(),true,true)));
        buttonSound.setContentDisplay(ContentDisplay.CENTER);
        buttonSound.setStyle("-fx-background-color: transparent;");
        buttonSound.setOnAction(e ->
        {
            System.out.println("mute");
            soundMuted = !soundMuted;
            if(soundMuted == false)
            {
                buttonSound.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/volumeButton.png",
                        buttonSound.getPrefWidth(),buttonSound.getPrefHeight(),true,true)));
                buttonSound.setContentDisplay(ContentDisplay.CENTER);
                buttonSound.setStyle("-fx-background-color: transparent;");
            }
            else if (soundMuted == true)
            {
                buttonSound.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/volumeMuteButton.png",
                        buttonSound.getPrefWidth(),buttonSound.getPrefHeight(),true,true)));
                buttonSound.setContentDisplay(ContentDisplay.CENTER);
                buttonSound.setStyle("-fx-background-color: transparent;");
            }
        });
        //Audioregler
        sliderAudio.setPrefHeight(20.0);
        sliderAudio.setPrefWidth(80.0);
        sliderAudio.setMaxHeight(USE_PREF_SIZE);
        sliderAudio.setMaxWidth(USE_PREF_SIZE);
        sliderAudio.setMinHeight(USE_PREF_SIZE);
        sliderAudio.setMinWidth(USE_PREF_SIZE);

        //Alle "Kinder" hinzufügen

        //Scene -
        view.getItems().add(anchorPaneTop);
        vBoxSong.getChildren().add(labelSong);
        vBoxSong.getChildren().add(labelInterpret);
        VBoxBot.getChildren().add(vBoxSong);
        hBoxTimeBar.getChildren().add(labelTimeLeft);
        hBoxTimeBar.getChildren().add(progressBar);
        hBoxTimeBar.getChildren().add(labelTimeRight);
        VBoxBot.getChildren().add(hBoxTimeBar);
        hBoxPlaylist.getChildren().add(buttonPlaylist);
        hBoxPlayerMenu.getChildren().add(hBoxPlaylist);
        hBoxPlayer.getChildren().add(buttonRewind);
        hBoxPlayer.getChildren().add(buttonBack);
        hBoxPlayer.getChildren().add(buttonPlay);
        hBoxPlayer.getChildren().add(buttonNext);
        hBoxPlayer.getChildren().add(buttonShuffle);
        hBoxPlayerMenu.getChildren().add(hBoxPlayer);
        hBoxAudio.getChildren().add(buttonSound);
        hBoxAudio.getChildren().add(sliderAudio);
        hBoxPlayerMenu.getChildren().add(hBoxAudio);
        VBoxBot.getChildren().add(hBoxPlayerMenu);
        anchorPaneBot.getChildren().add(VBoxBot);
        view.getItems().add(anchorPaneBot);
    }

    public PlayerViewController getController()
    {
        return playerViewController;
    }

    public Parent asParent()
    {
        return view;
    }
}
