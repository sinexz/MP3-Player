package mp3player;

import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import mp3player.view.*;
import mp3player.model.*;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private PlayerViewController playerViewController;
    private Player playerModel;
    private PlayerView playerView;

    public MainApp() {}

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        playerModel = new Player();
        playerViewController = new PlayerViewController(playerModel);
        playerView = new PlayerView(playerViewController, playerModel);

        Scene scene = new Scene(playerView.asParent(), 501,638);
        primaryStage.setTitle("MP3 - Player");
        primaryStage.getIcons().add(new Image("file:src/mp3player/view/img/logo.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
        //initRootLayoutView();
        //initPlayerView();
    }

    public void initRootLayoutView()
    {
        //Load root Layout
        RootLayoutView view = new RootLayoutView();
        rootLayout = (BorderPane) view;

        //Show scene with root layout
        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void initPlayerView()
    {
        //Load playerModel Layout
        PlayerView view = new PlayerView(playerViewController,playerModel);
        SplitPane playerOverview = (SplitPane) view;

        rootLayout.setCenter(playerOverview);

        //Give the controller acess to the main
        PlayerViewController controller = view.getController();
        controller.setMainApp(this);
    }
}
