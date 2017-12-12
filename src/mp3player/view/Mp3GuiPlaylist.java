package mp3player.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Mp3GuiPlaylist extends SplitPane {

    protected final AnchorPane anchorPane;
    protected final SplitPane splitPane;
    protected final VBox VBoxPlaylist;
    protected final TableView tableView;
    protected final TableColumn tableColumnPlaylists;
    protected final HBox HBoxPlaylist;
    protected final Label labelAddPlaylist;
    protected final Button buttonAddPlaylist;
    protected final ImageView imageView;
    protected final HBox hBox0;
    protected final TableView tableView0;
    protected final TableColumn tableColumn0;
    protected final TableColumn tableColumn1;
    protected final TableColumn tableColumn2;
    protected final AnchorPane anchorPane0;
    protected final VBox vBox0;
    protected final VBox vBox1;
    protected final Label label0;
    protected final Label label1;
    protected final HBox hBox1;
    protected final Label label2;
    protected final ProgressBar progressBar;
    protected final Label label3;
    protected final HBox hBox2;
    protected final HBox hBox3;
    protected final Button button0;
    protected final HBox hBox4;
    protected final Button buttonRewind;
    protected final Button buttonBack;
    protected final Button buttonPlay;
    protected final Button buttonNext;
    protected final Button buttonShuffle;
    protected final HBox HBoxAudioBox;
    protected final Slider sliderAudio;

    public Mp3GuiPlaylist() {

        anchorPane = new AnchorPane();
        splitPane = new SplitPane();
        VBoxPlaylist = new VBox();
        tableView = new TableView();
        tableColumnPlaylists = new TableColumn();
        HBoxPlaylist = new HBox();
        labelAddPlaylist = new Label();
        buttonAddPlaylist = new Button();
        imageView = new ImageView();
        hBox0 = new HBox();
        tableView0 = new TableView();
        tableColumn0 = new TableColumn();
        tableColumn1 = new TableColumn();
        tableColumn2 = new TableColumn();
        anchorPane0 = new AnchorPane();
        vBox0 = new VBox();
        vBox1 = new VBox();
        label0 = new Label();
        label1 = new Label();
        hBox1 = new HBox();
        label2 = new Label();
        progressBar = new ProgressBar();
        label3 = new Label();
        hBox2 = new HBox();
        hBox3 = new HBox();
        button0 = new Button();
        hBox4 = new HBox();
        buttonRewind = new Button();
        buttonBack = new Button();
        buttonPlay = new Button();
        buttonNext = new Button();
        buttonShuffle = new Button();
        HBoxAudioBox = new HBox();
        sliderAudio = new Slider();

        setDividerPositions(0.6, 0.5);
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setOrientation(javafx.geometry.Orientation.VERTICAL);
        setPrefHeight(425.0);
        setPrefWidth(500.0);

        anchorPane.setMaxHeight(USE_PREF_SIZE);
        anchorPane.setMaxWidth(USE_PREF_SIZE);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(275.0);
        anchorPane.setPrefWidth(500.0);

        splitPane.setDividerPositions(0.33);
        splitPane.setMaxHeight(USE_PREF_SIZE);
        splitPane.setMaxWidth(USE_PREF_SIZE);
        splitPane.setMinHeight(USE_PREF_SIZE);
        splitPane.setMinWidth(USE_PREF_SIZE);
        splitPane.setPrefHeight(275.0);
        splitPane.setPrefWidth(500.0);

        VBoxPlaylist.setMaxHeight(USE_PREF_SIZE);
        VBoxPlaylist.setMaxWidth(USE_PREF_SIZE);
        VBoxPlaylist.setMinHeight(USE_PREF_SIZE);
        VBoxPlaylist.setMinWidth(USE_PREF_SIZE);
        VBoxPlaylist.setPrefHeight(275.0);
        VBoxPlaylist.setPrefWidth(150.0);

        tableView.setMaxHeight(USE_PREF_SIZE);
        tableView.setMaxWidth(USE_PREF_SIZE);
        tableView.setMinHeight(USE_PREF_SIZE);
        tableView.setMinWidth(USE_PREF_SIZE);
        tableView.setPrefHeight(225.0);
        tableView.setPrefWidth(150.0);

        tableColumnPlaylists.setPrefWidth(150.0);
        tableColumnPlaylists.setText("Playlists");

        HBoxPlaylist.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        HBoxPlaylist.setPrefHeight(100.0);
        HBoxPlaylist.setPrefWidth(200.0);

        labelAddPlaylist.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        labelAddPlaylist.setMaxHeight(USE_PREF_SIZE);
        labelAddPlaylist.setMaxWidth(USE_PREF_SIZE);
        labelAddPlaylist.setMinHeight(USE_PREF_SIZE);
        labelAddPlaylist.setMinWidth(USE_PREF_SIZE);
        labelAddPlaylist.setPrefWidth(80.0);
        labelAddPlaylist.setText("Hinzuf�gen");
        labelAddPlaylist.setFont(new Font(13.0));
        labelAddPlaylist.setPadding(new Insets(0.0, 0.0, 0.0, 5.0));

        buttonAddPlaylist.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        buttonAddPlaylist.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
        buttonAddPlaylist.setMaxHeight(USE_PREF_SIZE);
        buttonAddPlaylist.setMaxWidth(USE_PREF_SIZE);
        buttonAddPlaylist.setMinHeight(USE_PREF_SIZE);
        buttonAddPlaylist.setMinWidth(USE_PREF_SIZE);
        buttonAddPlaylist.setMnemonicParsing(false);
        buttonAddPlaylist.setPrefHeight(25.0);
        buttonAddPlaylist.setPrefWidth(40.0);
        buttonAddPlaylist.setText("+");
        buttonAddPlaylist.setFont(new Font(14.0));

        imageView.setFitHeight(25.0);
        imageView.setFitWidth(45.0);
        imageView.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        buttonAddPlaylist.setGraphic(imageView);
        buttonAddPlaylist.setPadding(new Insets(0.0, 0.0, 0.0, 10.0));

        hBox0.setAlignment(javafx.geometry.Pos.CENTER);
        hBox0.setMaxHeight(USE_PREF_SIZE);
        hBox0.setMaxWidth(USE_PREF_SIZE);
        hBox0.setMinHeight(USE_PREF_SIZE);
        hBox0.setMinWidth(USE_PREF_SIZE);
        hBox0.setPrefHeight(275.0);
        hBox0.setPrefWidth(350.0);

        tableView0.setMaxHeight(USE_PREF_SIZE);
        tableView0.setMaxWidth(USE_PREF_SIZE);
        tableView0.setMinHeight(USE_PREF_SIZE);
        tableView0.setMinWidth(USE_PREF_SIZE);
        tableView0.setPrefHeight(275.0);
        tableView0.setPrefWidth(350.0);

        tableColumn0.setMinWidth(100.0);
        tableColumn0.setPrefWidth(115.3);
        tableColumn0.setText("Titel");

        tableColumn1.setMinWidth(110.0);
        tableColumn1.setPrefWidth(115.33);
        tableColumn1.setText("Album");

        tableColumn2.setPrefWidth(115.33);
        tableColumn2.setText("Interpret");

        anchorPane0.setMaxHeight(USE_PREF_SIZE);
        anchorPane0.setMaxWidth(USE_PREF_SIZE);
        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(150.0);
        anchorPane0.setPrefWidth(500.0);

        vBox0.setMaxHeight(USE_PREF_SIZE);
        vBox0.setMaxWidth(USE_PREF_SIZE);
        vBox0.setMinHeight(USE_PREF_SIZE);
        vBox0.setMinWidth(USE_PREF_SIZE);
        vBox0.setPrefHeight(150.0);
        vBox0.setPrefWidth(500.0);

        vBox1.setAlignment(javafx.geometry.Pos.CENTER);
        vBox1.setMaxHeight(USE_PREF_SIZE);
        vBox1.setMaxWidth(USE_PREF_SIZE);
        vBox1.setMinHeight(USE_PREF_SIZE);
        vBox1.setMinWidth(USE_PREF_SIZE);
        vBox1.setPrefHeight(50.0);
        vBox1.setPrefWidth(500.0);

        label0.setMaxHeight(USE_PREF_SIZE);
        label0.setMaxWidth(USE_PREF_SIZE);
        label0.setMinHeight(USE_PREF_SIZE);
        label0.setMinWidth(USE_PREF_SIZE);
        label0.setPrefHeight(27.0);
        label0.setPrefWidth(200.0);
        label0.setText("Titel der Playlist");
        label0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label0.setFont(new Font(18.0));

        label1.setMaxHeight(USE_PREF_SIZE);
        label1.setMaxWidth(USE_PREF_SIZE);
        label1.setMinHeight(USE_PREF_SIZE);
        label1.setMinWidth(USE_PREF_SIZE);
        label1.setPrefHeight(27.0);
        label1.setPrefWidth(200.0);
        label1.setText("Interpet");
        label1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label1.setFont(new Font(18.0));

        hBox1.setAlignment(javafx.geometry.Pos.CENTER);
        hBox1.setMaxHeight(USE_PREF_SIZE);
        hBox1.setMaxWidth(USE_PREF_SIZE);
        hBox1.setMinHeight(USE_PREF_SIZE);
        hBox1.setMinWidth(USE_PREF_SIZE);
        hBox1.setPrefHeight(40.0);
        hBox1.setPrefWidth(500.0);

        label2.setMaxHeight(USE_PREF_SIZE);
        label2.setMaxWidth(USE_PREF_SIZE);
        label2.setMinHeight(USE_PREF_SIZE);
        label2.setMinWidth(USE_PREF_SIZE);
        label2.setPrefHeight(20.0);
        label2.setPrefWidth(20.0);
        label2.setText("0");

        progressBar.setMaxHeight(USE_PREF_SIZE);
        progressBar.setMaxWidth(USE_PREF_SIZE);
        progressBar.setMinHeight(USE_PREF_SIZE);
        progressBar.setMinWidth(USE_PREF_SIZE);
        progressBar.setPrefHeight(20.0);
        progressBar.setPrefWidth(200.0);
        progressBar.setProgress(0.0);
        HBox.setMargin(progressBar, new Insets(0.0, 10.0, 0.0, 10.0));

        label3.setMaxHeight(USE_PREF_SIZE);
        label3.setMaxWidth(USE_PREF_SIZE);
        label3.setMinHeight(USE_PREF_SIZE);
        label3.setMinWidth(USE_PREF_SIZE);
        label3.setPrefHeight(20.0);
        label3.setPrefWidth(20.0);
        label3.setText("100");

        hBox2.setMaxHeight(USE_PREF_SIZE);
        hBox2.setMaxWidth(USE_PREF_SIZE);
        hBox2.setMinHeight(USE_PREF_SIZE);
        hBox2.setMinWidth(USE_PREF_SIZE);
        hBox2.setPrefHeight(70.0);
        hBox2.setPrefWidth(500.0);

        hBox3.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox3.setMaxHeight(USE_PREF_SIZE);
        hBox3.setMaxWidth(USE_PREF_SIZE);
        hBox3.setMinHeight(USE_PREF_SIZE);
        hBox3.setMinWidth(USE_PREF_SIZE);
        hBox3.setPrefHeight(80.0);
        hBox3.setPrefWidth(100.0);

        button0.setMaxHeight(USE_PREF_SIZE);
        button0.setMaxWidth(USE_PREF_SIZE);
        button0.setMinHeight(USE_PREF_SIZE);
        button0.setMinWidth(USE_PREF_SIZE);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(30.0);
        button0.setPrefWidth(80.0);
        button0.setText("Playlist");
        HBox.setMargin(button0, new Insets(0.0, 0.0, 0.0, 10.0));

        hBox4.setAlignment(javafx.geometry.Pos.CENTER);
        hBox4.setMaxHeight(USE_PREF_SIZE);
        hBox4.setMaxWidth(USE_PREF_SIZE);
        hBox4.setMinHeight(USE_PREF_SIZE);
        hBox4.setMinWidth(USE_PREF_SIZE);
        hBox4.setPrefHeight(80.0);
        hBox4.setPrefWidth(300.0);
        hBox4.setSpacing(10.0);

        buttonRewind.setMaxHeight(USE_PREF_SIZE);
        buttonRewind.setMaxWidth(USE_PREF_SIZE);
        buttonRewind.setMinHeight(USE_PREF_SIZE);
        buttonRewind.setMinWidth(USE_PREF_SIZE);
        buttonRewind.setMnemonicParsing(false);
        buttonRewind.setPrefHeight(25.0);
        buttonRewind.setPrefWidth(50.0);
        buttonRewind.setText("Rewind");
        buttonRewind.setFont(new Font(10.0));

        buttonBack.setMaxHeight(USE_PREF_SIZE);
        buttonBack.setMaxWidth(USE_PREF_SIZE);
        buttonBack.setMinHeight(USE_PREF_SIZE);
        buttonBack.setMinWidth(USE_PREF_SIZE);
        buttonBack.setMnemonicParsing(false);
        buttonBack.setPrefHeight(25.0);
        buttonBack.setPrefWidth(50.0);
        buttonBack.setText("Back");
        buttonBack.setFont(new Font(10.0));

        buttonPlay.setMaxHeight(USE_PREF_SIZE);
        buttonPlay.setMaxWidth(USE_PREF_SIZE);
        buttonPlay.setMinHeight(USE_PREF_SIZE);
        buttonPlay.setMinWidth(USE_PREF_SIZE);
        buttonPlay.setMnemonicParsing(false);
        buttonPlay.setPrefHeight(45.0);
        buttonPlay.setPrefWidth(50.0);
        buttonPlay.setText("Play");
        buttonPlay.setFont(new Font(10.0));

        buttonNext.setMaxHeight(USE_PREF_SIZE);
        buttonNext.setMaxWidth(USE_PREF_SIZE);
        buttonNext.setMinHeight(USE_PREF_SIZE);
        buttonNext.setMinWidth(USE_PREF_SIZE);
        buttonNext.setMnemonicParsing(false);
        buttonNext.setPrefHeight(25.0);
        buttonNext.setPrefWidth(50.0);
        buttonNext.setText("Next");
        buttonNext.setFont(new Font(10.0));

        buttonShuffle.setMaxHeight(USE_PREF_SIZE);
        buttonShuffle.setMaxWidth(USE_PREF_SIZE);
        buttonShuffle.setMinHeight(USE_PREF_SIZE);
        buttonShuffle.setMinWidth(USE_PREF_SIZE);
        buttonShuffle.setMnemonicParsing(false);
        buttonShuffle.setPrefHeight(25.0);
        buttonShuffle.setPrefWidth(50.0);
        buttonShuffle.setText("Shuffle");
        buttonShuffle.setFont(new Font(10.0));
        HBox.setMargin(hBox4, new Insets(0.0));

        HBoxAudioBox.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        HBoxAudioBox.setMaxHeight(USE_PREF_SIZE);
        HBoxAudioBox.setMaxWidth(USE_PREF_SIZE);
        HBoxAudioBox.setMinHeight(USE_PREF_SIZE);
        HBoxAudioBox.setMinWidth(USE_PREF_SIZE);
        HBoxAudioBox.setPrefHeight(80.0);
        HBoxAudioBox.setPrefWidth(100.0);

        sliderAudio.setMaxHeight(USE_PREF_SIZE);
        sliderAudio.setMaxWidth(USE_PREF_SIZE);
        sliderAudio.setMinHeight(USE_PREF_SIZE);
        sliderAudio.setMinWidth(USE_PREF_SIZE);
        sliderAudio.setPrefHeight(20.0);
        sliderAudio.setPrefWidth(80.0);

        tableView.getColumns().add(tableColumnPlaylists);
        VBoxPlaylist.getChildren().add(tableView);
        HBoxPlaylist.getChildren().add(labelAddPlaylist);
        HBoxPlaylist.getChildren().add(buttonAddPlaylist);
        VBoxPlaylist.getChildren().add(HBoxPlaylist);
        splitPane.getItems().add(VBoxPlaylist);
        tableView0.getColumns().add(tableColumn0);
        tableView0.getColumns().add(tableColumn1);
        tableView0.getColumns().add(tableColumn2);
        hBox0.getChildren().add(tableView0);
        splitPane.getItems().add(hBox0);
        anchorPane.getChildren().add(splitPane);
        getItems().add(anchorPane);
        getItems().add(anchorPane0);
        vBox1.getChildren().add(label0);
        vBox1.getChildren().add(label1);
        vBox0.getChildren().add(vBox1);
        hBox1.getChildren().add(label2);
        hBox1.getChildren().add(progressBar);
        hBox1.getChildren().add(label3);
        vBox0.getChildren().add(hBox1);
        hBox3.getChildren().add(button0);
        hBox2.getChildren().add(hBox3);
        hBox4.getChildren().add(buttonRewind);
        hBox4.getChildren().add(buttonBack);
        hBox4.getChildren().add(buttonPlay);
        hBox4.getChildren().add(buttonNext);
        hBox4.getChildren().add(buttonShuffle);
        hBox2.getChildren().add(hBox4);
        HBoxAudioBox.getChildren().add(sliderAudio);
        hBox2.getChildren().add(HBoxAudioBox);
        vBox0.getChildren().add(hBox2);
        getItems().add(vBox0);

    }
}
