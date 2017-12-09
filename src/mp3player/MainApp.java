package mp3player;

import mp3player.view.*;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApp extends Application {

    private  Stage primaryStage;
    //private PANE rootLayout;

    public MainApp() {}

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("MP3 - Player");

        this.primaryStage.getIcons().add(new Image("file:src/mp3player.view/img/logo.png"));

        initRootLayoutView();
        initPlayerView();
    }

    public void initRootLayoutView()
    {
        //Load root Layout
        RootLayoutView view = new RootLayoutView();
        /**
         * ((PANE)) <-  Cast || mp3player.view.load() lädt das ganze Pane um es anzuzeigen
         */
        //rootLayout = ((PANE)) mp3player.view.load();

        //Show scene with root layout
        /**
         * Pane einstellen Zeile 11 &&
         */
        //Scene scene = new Scene(rootLayout);
    }

    public void initPlayerView()
    {
        //Load player Layout
        PlayerView view = new PlayerView();
        /**
         * ((PANE)) <-  Cast || mp3player.view.load() lädt das ganze Pane um es anzuzeigen
         */
        //(PANE) playerOverview = ((PANE)) mp3player.view.load();

        //rootLayout.setCenter(playerOverview);

        //Give the controller acess to the main
        PlayerController controller = view.getController();
        controller.setMain(this);
    }
}
