package mp3player.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class PlayerView extends SplitPane {

    //Erstellung der benötigten Variable

    protected final AnchorPane anchorPaneTop;
    protected final HBox hBoxTop;
    protected final HBox hBoxImg;
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
    protected final Slider sliderAudio;

    public PlayerView() {

        anchorPaneTop = new AnchorPane();
        hBoxTop = new HBox();
        hBoxImg = new HBox();
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
        sliderAudio = new Slider();

        //SplitPane
        setDividerPositions(0.6);
        setPrefHeight(425.0);
        setPrefWidth(500.0);
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setOrientation(javafx.geometry.Orientation.VERTICAL);

        //SplitPane Oben - Bild
        anchorPaneTop.setPrefHeight(275.0);
        anchorPaneTop.setPrefWidth(500.0);
        anchorPaneTop.setMaxHeight(USE_PREF_SIZE);
        anchorPaneTop.setMaxWidth(USE_PREF_SIZE);
        anchorPaneTop.setMinHeight(USE_PREF_SIZE);
        anchorPaneTop.setMinWidth(USE_PREF_SIZE);

        //Hbox als Parent, um HboxImg zu positionieren
        hBoxTop.setPrefHeight(275.0);
        hBoxTop.setPrefWidth(500.0);
        hBoxTop.setAlignment(javafx.geometry.Pos.CENTER);
        hBoxTop.setMaxHeight(USE_PREF_SIZE);
        hBoxTop.setMaxWidth(USE_PREF_SIZE);
        hBoxTop.setMinHeight(USE_PREF_SIZE);
        hBoxTop.setMinWidth(USE_PREF_SIZE);

        //HBox für das Bild
        hBoxImg.setPrefHeight(175.0);
        hBoxImg.setPrefWidth(175.0);
        hBoxImg.setMaxHeight(USE_PREF_SIZE);
        hBoxImg.setMaxWidth(USE_PREF_SIZE);
        hBoxImg.setMinHeight(USE_PREF_SIZE);
        hBoxImg.setMinWidth(USE_PREF_SIZE);

        //AnchorPane für den Unteren Splitbereich
        anchorPaneBot.setPrefHeight(150.0);
        anchorPaneBot.setPrefWidth(500.0);
        anchorPaneBot.setMaxHeight(USE_PREF_SIZE);
        anchorPaneBot.setMaxWidth(USE_PREF_SIZE);
        anchorPaneBot.setMinHeight(USE_PREF_SIZE);
        anchorPaneBot.setMinWidth(USE_PREF_SIZE);

        //Vbox für den Player-Controller
        VBoxBot.setPrefHeight(150.0);
        VBoxBot.setPrefWidth(500.0);
        VBoxBot.setMaxHeight(USE_PREF_SIZE);
        VBoxBot.setMaxWidth(USE_PREF_SIZE);
        VBoxBot.setMinHeight(USE_PREF_SIZE);
        VBoxBot.setMinWidth(USE_PREF_SIZE);

        // Die Vbox für die Labels, songname und interpret
        vBoxSong.setPrefHeight(50.0);
        vBoxSong.setPrefWidth(500.0);
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
        hBoxTimeBar.setPrefHeight(40.0);
        hBoxTimeBar.setPrefWidth(500.0);
        hBoxTimeBar.setAlignment(javafx.geometry.Pos.CENTER);
        hBoxTimeBar.setMaxHeight(USE_PREF_SIZE);
        hBoxTimeBar.setMaxWidth(USE_PREF_SIZE);
        hBoxTimeBar.setMinHeight(USE_PREF_SIZE);
        hBoxTimeBar.setMinWidth(USE_PREF_SIZE);

        //Label für den Anfang des Songs
        labelTimeLeft.setPrefHeight(20.0);
        labelTimeLeft.setPrefWidth(20.0);
        labelTimeLeft.setMaxHeight(USE_PREF_SIZE);
        labelTimeLeft.setMaxWidth(USE_PREF_SIZE);
        labelTimeLeft.setMinHeight(USE_PREF_SIZE);
        labelTimeLeft.setMinWidth(USE_PREF_SIZE);
        labelTimeLeft.setText("0");

        //Zeitleiste
        progressBar.setPrefHeight(20.0);
        progressBar.setPrefWidth(200.0);
        progressBar.setMaxHeight(USE_PREF_SIZE);
        progressBar.setMaxWidth(USE_PREF_SIZE);
        progressBar.setMinHeight(USE_PREF_SIZE);
        progressBar.setMinWidth(USE_PREF_SIZE);
        progressBar.setProgress(0.0);
        HBox.setMargin(progressBar, new Insets(0.0, 10.0, 0.0, 10.0));

        //Label für die restliche Zeit
        labelTimeRight.setPrefHeight(20.0);
        labelTimeRight.setPrefWidth(20.0);
        labelTimeRight.setMaxHeight(USE_PREF_SIZE);
        labelTimeRight.setMaxWidth(USE_PREF_SIZE);
        labelTimeRight.setMinHeight(USE_PREF_SIZE);
        labelTimeRight.setMinWidth(USE_PREF_SIZE);
        labelTimeRight.setText("100");

        // Hbox für die 3Hboxen, die den Player steuern.
        hBoxPlayerMenu.setPrefHeight(70.0);
        hBoxPlayerMenu.setPrefWidth(500.0);
        hBoxPlayerMenu.setMaxHeight(USE_PREF_SIZE);
        hBoxPlayerMenu.setMaxWidth(USE_PREF_SIZE);
        hBoxPlayerMenu.setMinHeight(USE_PREF_SIZE);
        hBoxPlayerMenu.setMinWidth(USE_PREF_SIZE);

        //Die Hbox für den Playlistbutton
        hBoxPlaylist.setPrefHeight(80.0);
        hBoxPlaylist.setPrefWidth(100.0);
        hBoxPlaylist.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBoxPlaylist.setMaxHeight(USE_PREF_SIZE);
        hBoxPlaylist.setMaxWidth(USE_PREF_SIZE);
        hBoxPlaylist.setMinHeight(USE_PREF_SIZE);
        hBoxPlaylist.setMinWidth(USE_PREF_SIZE);

        //Knopf für das Wechseln auf die Playlist
        buttonPlaylist.setPrefHeight(30.0);
        buttonPlaylist.setPrefWidth(80.0);
        buttonPlaylist.setMaxHeight(USE_PREF_SIZE);
        buttonPlaylist.setMaxWidth(USE_PREF_SIZE);
        buttonPlaylist.setMinHeight(USE_PREF_SIZE);
        buttonPlaylist.setMinWidth(USE_PREF_SIZE);
        buttonPlaylist.setMnemonicParsing(false);
        buttonPlaylist.setText("Playlist");
        HBox.setMargin(buttonPlaylist, new Insets(0.0, 0.0, 0.0, 10.0));

        // Hbox für den Player unten + Buttons
        hBoxPlayer.setPrefHeight(80.0);
        hBoxPlayer.setPrefWidth(300.0);
        hBoxPlayer.setSpacing(10.0);
        hBoxPlayer.setAlignment(javafx.geometry.Pos.CENTER);
        hBoxPlayer.setMaxHeight(USE_PREF_SIZE);
        hBoxPlayer.setMaxWidth(USE_PREF_SIZE);
        hBoxPlayer.setMinHeight(USE_PREF_SIZE);
        hBoxPlayer.setMinWidth(USE_PREF_SIZE);

        // Knopf für "Wiederholen"
        buttonRewind.setPrefHeight(25.0);
        buttonRewind.setPrefWidth(50.0);
        buttonRewind.setText("Rewind");
        buttonRewind.setFont(new Font(10.0));
        buttonRewind.setMaxHeight(USE_PREF_SIZE);
        buttonRewind.setMaxWidth(USE_PREF_SIZE);
        buttonRewind.setMinHeight(USE_PREF_SIZE);
        buttonRewind.setMinWidth(USE_PREF_SIZE);
        buttonRewind.setMnemonicParsing(false);

        buttonBack.setPrefHeight(25.0);
        buttonBack.setPrefWidth(50.0);
        buttonBack.setText("Back");
        buttonBack.setFont(new Font(10.0));
        buttonBack.setMaxHeight(USE_PREF_SIZE);
        buttonBack.setMaxWidth(USE_PREF_SIZE);
        buttonBack.setMinHeight(USE_PREF_SIZE);
        buttonBack.setMinWidth(USE_PREF_SIZE);
        buttonBack.setMnemonicParsing(false);

        //Knopf für spielen/pause
        buttonPlay.setPrefHeight(45.0);
        buttonPlay.setPrefWidth(50.0);
        buttonPlay.setText("Play");
        buttonPlay.setFont(new Font(10.0));
        buttonPlay.setMaxHeight(USE_PREF_SIZE);
        buttonPlay.setMaxWidth(USE_PREF_SIZE);
        buttonPlay.setMinHeight(USE_PREF_SIZE);
        buttonPlay.setMinWidth(USE_PREF_SIZE);
        buttonPlay.setMnemonicParsing(false);

        //Knopf für nächstes Lied
        buttonNext.setPrefHeight(25.0);
        buttonNext.setPrefWidth(50.0);
        buttonNext.setText("Next");
        buttonNext.setFont(new Font(10.0));
        buttonNext.setMaxHeight(USE_PREF_SIZE);
        buttonNext.setMaxWidth(USE_PREF_SIZE);
        buttonNext.setMinHeight(USE_PREF_SIZE);
        buttonNext.setMinWidth(USE_PREF_SIZE);
        buttonNext.setMnemonicParsing(false);

        //Knopf für "Shuffle"
        buttonShuffle.setPrefHeight(25.0);
        buttonShuffle.setPrefWidth(50.0);
        buttonShuffle.setText("Shuffle");
        buttonShuffle.setFont(new Font(10.0));
        buttonShuffle.setMaxHeight(USE_PREF_SIZE);
        buttonShuffle.setMaxWidth(USE_PREF_SIZE);
        buttonShuffle.setMinHeight(USE_PREF_SIZE);
        buttonShuffle.setMinWidth(USE_PREF_SIZE);
        buttonShuffle.setMnemonicParsing(false);
        HBox.setMargin(hBoxPlayer, new Insets(0.0));

        //Die 3te Hbox für den Player unten
        hBoxAudio.setPrefHeight(80.0);
        hBoxAudio.setPrefWidth(100.0);
        hBoxAudio.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBoxAudio.setMaxHeight(USE_PREF_SIZE);
        hBoxAudio.setMaxWidth(USE_PREF_SIZE);
        hBoxAudio.setMinHeight(USE_PREF_SIZE);
        hBoxAudio.setMinWidth(USE_PREF_SIZE);

        //Audioregler
        sliderAudio.setPrefHeight(20.0);
        sliderAudio.setPrefWidth(80.0);
        sliderAudio.setMaxHeight(USE_PREF_SIZE);
        sliderAudio.setMaxWidth(USE_PREF_SIZE);
        sliderAudio.setMinHeight(USE_PREF_SIZE);
        sliderAudio.setMinWidth(USE_PREF_SIZE);

        //Alle "Kinder" hinzufügen
        hBoxTop.getChildren().add(hBoxImg);
        anchorPaneTop.getChildren().add(hBoxTop);
        getItems().add(anchorPaneTop);
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
        hBoxAudio.getChildren().add(sliderAudio);
        hBoxPlayerMenu.getChildren().add(hBoxAudio);
        VBoxBot.getChildren().add(hBoxPlayerMenu);
        anchorPaneBot.getChildren().add(VBoxBot);
        getItems().add(anchorPaneBot);

    }
}
