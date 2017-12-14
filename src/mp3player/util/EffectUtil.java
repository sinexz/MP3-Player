package mp3player.util;

import javafx.scene.Node;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class EffectUtil
{
    private static double x;
    private static double y;

    private static double initialX;
    private static double initialY;

    public static void addDragListeners(final Node n) {
        n.setOnMousePressed((MouseEvent me) -> {
            if (me.getButton() != MouseButton.MIDDLE) {
                initialX = me.getSceneX();
                initialY = me.getSceneY();
            } else {
                n.getScene().getWindow().centerOnScreen();
                initialX = n.getScene().getWindow().getX();
                initialY = n.getScene().getWindow().getY();
            }
        });

        n.setOnMouseDragged((MouseEvent me) -> {
            if (me.getButton() != MouseButton.MIDDLE) {
                n.getScene().getWindow().setX(me.getScreenX() - initialX);
                n.getScene().getWindow().setY(me.getScreenY() - initialY);
            }
        });
    }
}
