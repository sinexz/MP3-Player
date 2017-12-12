package mp3player.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RootLayoutView extends Application
{
    protected final BorderPane rootPane;

    public RootLayoutView()
    {
        rootPane = new BorderPane();
        rootPane.setPrefSize(425,500);
    }

    @Override
    public void start(Stage stage){
        BorderPane rootPane1 = new BorderPane();
        rootPane1.setPrefSize(520,440);
        Scene sceneRoot = new Scene(rootPane1,520,440);
        stage.setScene(sceneRoot);
        stage.show();
    }

}
