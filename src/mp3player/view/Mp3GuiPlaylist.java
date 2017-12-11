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

public abstract class Mp3GuiPlaylist extends SplitPane {

    protected final AnchorPane anchorPane;
    protected final SplitPane splitPane;
    protected final VBox vBox;
    protected final TableView tableView;
    protected final TableColumn tableColumn;
    protected final HBox hBox;
    protected final Label label;
    protected final Button button;
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
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final HBox hBox5;
    protected final Slider slider;

    public Mp3GuiPlaylist() {

        anchorPane = new AnchorPane();
        splitPane = new SplitPane();
        vBox = new VBox();
        tableView = new TableView();
        tableColumn = new TableColumn();
        hBox = new HBox();
        label = new Label();
        button = new Button();
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
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        hBox5 = new HBox();
        slider = new Slider();

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

        vBox.setMaxHeight(USE_PREF_SIZE);
        vBox.setMaxWidth(USE_PREF_SIZE);
        vBox.setMinHeight(USE_PREF_SIZE);
        vBox.setMinWidth(USE_PREF_SIZE);
        vBox.setPrefHeight(275.0);
        vBox.setPrefWidth(150.0);

        tableView.setMaxHeight(USE_PREF_SIZE);
        tableView.setMaxWidth(USE_PREF_SIZE);
        tableView.setMinHeight(USE_PREF_SIZE);
        tableView.setMinWidth(USE_PREF_SIZE);
        tableView.setPrefHeight(225.0);
        tableView.setPrefWidth(150.0);

        tableColumn.setPrefWidth(150.0);
        tableColumn.setText("Playlists");

        hBox.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox.setPrefHeight(100.0);
        hBox.setPrefWidth(200.0);

        label.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        label.setMaxHeight(USE_PREF_SIZE);
        label.setMaxWidth(USE_PREF_SIZE);
        label.setMinHeight(USE_PREF_SIZE);
        label.setMinWidth(USE_PREF_SIZE);
        label.setPrefWidth(80.0);
        label.setText("Hinzuf�gen");
        label.setFont(new Font(13.0));
        label.setPadding(new Insets(0.0, 0.0, 0.0, 5.0));

        button.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        button.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
        button.setMaxHeight(USE_PREF_SIZE);
        button.setMaxWidth(USE_PREF_SIZE);
        button.setMinHeight(USE_PREF_SIZE);
        button.setMinWidth(USE_PREF_SIZE);
        button.setMnemonicParsing(false);
        button.setPrefHeight(25.0);
        button.setPrefWidth(40.0);
        button.setText("+");
        button.setFont(new Font(14.0));

        imageView.setFitHeight(25.0);
        imageView.setFitWidth(45.0);
        imageView.setNodeOrientation(javafx.geometry.NodeOrientation.INHERIT);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        button.setGraphic(imageView);
        button.setPadding(new Insets(0.0, 0.0, 0.0, 10.0));

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

        button1.setMaxHeight(USE_PREF_SIZE);
        button1.setMaxWidth(USE_PREF_SIZE);
        button1.setMinHeight(USE_PREF_SIZE);
        button1.setMinWidth(USE_PREF_SIZE);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(25.0);
        button1.setPrefWidth(50.0);
        button1.setText("Rewind");
        button1.setFont(new Font(10.0));

        button2.setMaxHeight(USE_PREF_SIZE);
        button2.setMaxWidth(USE_PREF_SIZE);
        button2.setMinHeight(USE_PREF_SIZE);
        button2.setMinWidth(USE_PREF_SIZE);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(25.0);
        button2.setPrefWidth(50.0);
        button2.setText("Back");
        button2.setFont(new Font(10.0));

        button3.setMaxHeight(USE_PREF_SIZE);
        button3.setMaxWidth(USE_PREF_SIZE);
        button3.setMinHeight(USE_PREF_SIZE);
        button3.setMinWidth(USE_PREF_SIZE);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(45.0);
        button3.setPrefWidth(50.0);
        button3.setText("Play");
        button3.setFont(new Font(10.0));

        button4.setMaxHeight(USE_PREF_SIZE);
        button4.setMaxWidth(USE_PREF_SIZE);
        button4.setMinHeight(USE_PREF_SIZE);
        button4.setMinWidth(USE_PREF_SIZE);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(25.0);
        button4.setPrefWidth(50.0);
        button4.setText("Next");
        button4.setFont(new Font(10.0));

        button5.setMaxHeight(USE_PREF_SIZE);
        button5.setMaxWidth(USE_PREF_SIZE);
        button5.setMinHeight(USE_PREF_SIZE);
        button5.setMinWidth(USE_PREF_SIZE);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(25.0);
        button5.setPrefWidth(50.0);
        button5.setText("Shuffle");
        button5.setFont(new Font(10.0));
        HBox.setMargin(hBox4, new Insets(0.0));

        hBox5.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox5.setMaxHeight(USE_PREF_SIZE);
        hBox5.setMaxWidth(USE_PREF_SIZE);
        hBox5.setMinHeight(USE_PREF_SIZE);
        hBox5.setMinWidth(USE_PREF_SIZE);
        hBox5.setPrefHeight(80.0);
        hBox5.setPrefWidth(100.0);

        slider.setMaxHeight(USE_PREF_SIZE);
        slider.setMaxWidth(USE_PREF_SIZE);
        slider.setMinHeight(USE_PREF_SIZE);
        slider.setMinWidth(USE_PREF_SIZE);
        slider.setPrefHeight(20.0);
        slider.setPrefWidth(80.0);

        tableView.getColumns().add(tableColumn);
        vBox.getChildren().add(tableView);
        hBox.getChildren().add(label);
        hBox.getChildren().add(button);
        vBox.getChildren().add(hBox);
        splitPane.getItems().add(vBox);
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
        hBox4.getChildren().add(button1);
        hBox4.getChildren().add(button2);
        hBox4.getChildren().add(button3);
        hBox4.getChildren().add(button4);
        hBox4.getChildren().add(button5);
        hBox2.getChildren().add(hBox4);
        hBox5.getChildren().add(slider);
        hBox2.getChildren().add(hBox5);
        vBox0.getChildren().add(hBox2);
        getItems().add(vBox0);

    }
}
