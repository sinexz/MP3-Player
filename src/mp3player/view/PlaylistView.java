package mp3player.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import mp3player.model.Player;
import mp3player.util.EffectUtil;

public class PlaylistView extends SplitPane
{

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
    protected final TableView tableViewPlaylist;
    protected final TableColumn title;
    protected final TableColumn album;
    protected final TableColumn artist;
    protected PlayerViewController playerViewController;
    protected Player player;

    public PlaylistView(PlayerViewController playerViewController, Player player)
    {
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
        tableViewPlaylist = new TableView();
        title = new TableColumn();
        album = new TableColumn();
        artist = new TableColumn();

        setDividerPositions(0.6, 0.5);
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setOrientation(javafx.geometry.Orientation.VERTICAL);
        setPrefHeight(500.0);
        setPrefWidth(500.0);

        anchorPane.setMaxHeight(USE_PREF_SIZE);
        anchorPane.setMaxWidth(USE_PREF_SIZE);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(500.0);
        anchorPane.setPrefWidth(500.0);

        splitPane.setDividerPositions(0.33);
        splitPane.setMaxHeight(USE_PREF_SIZE);
        splitPane.setMaxWidth(USE_PREF_SIZE);
        splitPane.setMinHeight(USE_PREF_SIZE);
        splitPane.setMinWidth(USE_PREF_SIZE);
        splitPane.setPrefHeight(500.0);
        splitPane.setPrefWidth(500.0);

        VBoxPlaylist.setMaxHeight(USE_PREF_SIZE);
        VBoxPlaylist.setMaxWidth(USE_PREF_SIZE);
        VBoxPlaylist.setMinHeight(USE_PREF_SIZE);
        VBoxPlaylist.setMinWidth(USE_PREF_SIZE);
        VBoxPlaylist.setPrefHeight(500.0);
        VBoxPlaylist.setPrefWidth(130.0);

        tableView.setMaxHeight(USE_PREF_SIZE);
        tableView.setMaxWidth(USE_PREF_SIZE);
        tableView.setMinHeight(USE_PREF_SIZE);
        tableView.setMinWidth(USE_PREF_SIZE);
        tableView.setPrefHeight(465.0);
        tableView.setPrefWidth(130.0);

        tableColumnPlaylists.setPrefWidth(130.0);
        tableColumnPlaylists.setText("Playlists");

        HBoxPlaylist.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        HBoxPlaylist.setPrefHeight(100.0);
        HBoxPlaylist.setPrefWidth(200.0);
        HBoxPlaylist.setSpacing(10);

        labelAddPlaylist.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        labelAddPlaylist.setMaxHeight(USE_PREF_SIZE);
        labelAddPlaylist.setMaxWidth(USE_PREF_SIZE);
        labelAddPlaylist.setMinHeight(USE_PREF_SIZE);
        labelAddPlaylist.setMinWidth(USE_PREF_SIZE);
        labelAddPlaylist.setPrefWidth(90.0);
        labelAddPlaylist.setText("Hinzufügen");
        labelAddPlaylist.setFont(new Font(13.0));
        labelAddPlaylist.setPadding(new Insets(0.0, 0.0, 0.0, 15.0));

        buttonAddPlaylist.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        buttonAddPlaylist.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
        buttonAddPlaylist.setMaxHeight(USE_PREF_SIZE);
        buttonAddPlaylist.setMaxWidth(USE_PREF_SIZE);
        buttonAddPlaylist.setMinHeight(USE_PREF_SIZE);
        buttonAddPlaylist.setMinWidth(USE_PREF_SIZE);
        buttonAddPlaylist.setMnemonicParsing(false);
        buttonAddPlaylist.setPrefHeight(25.0);
        buttonAddPlaylist.setPrefWidth(40.0);
        buttonAddPlaylist.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/playlistAdd.png",
                buttonAddPlaylist.getPrefWidth(),buttonAddPlaylist.getPrefHeight(),true,true)));
        buttonAddPlaylist.setContentDisplay(ContentDisplay.CENTER);
        buttonAddPlaylist.setStyle("-fx-background-color: transparent;");
        buttonAddPlaylist.setOnAction(event -> {
            EditDialogView editDialogView = new EditDialogView();
        });



        hBox0.setAlignment(javafx.geometry.Pos.CENTER);
        hBox0.setMaxHeight(USE_PREF_SIZE);
        hBox0.setMaxWidth(USE_PREF_SIZE);
        hBox0.setMinHeight(USE_PREF_SIZE);
        hBox0.setMinWidth(USE_PREF_SIZE);
        hBox0.setPrefHeight(500.0);
        hBox0.setPrefWidth(350.0);

        tableViewPlaylist.setMaxHeight(USE_PREF_SIZE);
        tableViewPlaylist.setMaxWidth(USE_PREF_SIZE);
        tableViewPlaylist.setMinHeight(USE_PREF_SIZE);
        tableViewPlaylist.setMinWidth(USE_PREF_SIZE);
        tableViewPlaylist.setPrefHeight(500.0);
        tableViewPlaylist.setPrefWidth(350.0);

        title.setMinWidth(100.0);
        title.setPrefWidth(115.3);
        title.setText("Titel");

        album.setMinWidth(110.0);
        album.setPrefWidth(115.33);
        album.setText("Album");

        artist.setPrefWidth(115.33);
        artist.setText("Interpret");

        tableView.getColumns().add(tableColumnPlaylists);
        VBoxPlaylist.getChildren().add(tableView);
        HBoxPlaylist.getChildren().add(labelAddPlaylist);
        HBoxPlaylist.getChildren().add(buttonAddPlaylist);
        VBoxPlaylist.getChildren().add(HBoxPlaylist);
        splitPane.getItems().add(VBoxPlaylist);
        tableViewPlaylist.getColumns().add(title);
        tableViewPlaylist.getColumns().add(album);
        tableViewPlaylist.getColumns().add(artist);
        hBox0.getChildren().add(tableViewPlaylist);
        splitPane.getItems().add(hBox0);
        anchorPane.getChildren().add(splitPane);
        getItems().add(anchorPane);
    }
}
