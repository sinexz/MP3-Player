package mp3player.view;

import javafx.scene.layout.BorderPane;

public class RootLayoutView extends BorderPane
{
    protected final BorderPane rootPane;

    public RootLayoutView()
    {
        rootPane = new BorderPane();
        rootPane.setPrefSize(520,440);
    }
}
