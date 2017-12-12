package mp3player.view;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import mp3player.model.Player;

public class CoverView extends SplitPane
{

    //Erstellung der benötigten Variable

    protected final AnchorPane anchorPaneTop;
    protected final HBox hBoxTop;
    protected final HBox hBoxImg;
    protected PlayerViewController playerViewController;
    protected Player player;

    public CoverView(PlayerViewController playerViewController, Player player) {

        anchorPaneTop = new AnchorPane();
        hBoxTop = new HBox();
        hBoxImg = new HBox();

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
        hBoxTop.setAlignment(Pos.CENTER);
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

        //Alle "Kinder" hinzufügen
        hBoxTop.getChildren().add(hBoxImg);
        anchorPaneTop.getChildren().add(hBoxTop);
        getItems().add(anchorPaneTop);
    }
}
