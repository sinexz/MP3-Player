package mp3player;

import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.StageStyle;
import mp3player.view.*;
import mp3player.model.*;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApp extends Application {

    private PlayerController playerController;
    private Player playerModel;
    private PlayerView playerView;
    private Stage primaryStage;

    public MainApp() {}

    @Override
    public void start(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
        playerModel = new Player();
        PlayerController playerController = new PlayerController(playerModel);
        playerController.setMainApp(this);
        PlayerView playerView = new PlayerView(playerController, playerModel);

        Scene scene = new Scene(playerView.asParent(), 501,638);
        primaryStage.setTitle("MP3 - Player");
        primaryStage.getIcons().add(new Image("file:src/mp3player/view/img/logo.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public boolean showPlaylistDialog(Playlist playlist)
    {
        AnchorPane dialogBox = (AnchorPane) EditDialogView.dialogBox;

        Scene scene = new Scene(dialogBox);

        EditDialogViewController controller = new EditDialogViewController();
        controller.setDialogStage(EditDialogView.dialogStage);
        controller.setPlaylist(playlist);

        EditDialogView.dialogStage.showAndWait();

        return controller.isSaveClicked();
    }
}
