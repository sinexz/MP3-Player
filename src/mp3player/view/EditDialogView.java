package mp3player.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class EditDialogView extends VBox {

    protected final HBox hBox;
    protected final TextField textField;
    protected final HBox hBox0;
    protected final Button button;
    protected final Button button0;

    public EditDialogView() {

        hBox = new HBox();
        textField = new TextField();
        hBox0 = new HBox();
        button = new Button();
        button0 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(100.0);
        setPrefWidth(200.0);

        VBox.setVgrow(hBox, javafx.scene.layout.Priority.NEVER);
        hBox.setAlignment(javafx.geometry.Pos.CENTER);
        hBox.setMaxHeight(USE_PREF_SIZE);
        hBox.setMaxWidth(USE_PREF_SIZE);
        hBox.setMinHeight(USE_PREF_SIZE);
        hBox.setMinWidth(USE_PREF_SIZE);
        hBox.setPrefHeight(50.0);
        hBox.setPrefWidth(200.0);

        HBox.setHgrow(textField, javafx.scene.layout.Priority.NEVER);
        textField.setMaxHeight(USE_PREF_SIZE);
        textField.setMaxWidth(USE_PREF_SIZE);
        textField.setMinHeight(USE_PREF_SIZE);
        textField.setMinWidth(USE_PREF_SIZE);
        textField.setPrefHeight(50.0);
        textField.setPrefWidth(200.0);
        HBox.setMargin(textField, new Insets(0.0));

        VBox.setVgrow(hBox0, javafx.scene.layout.Priority.NEVER);
        hBox0.setAlignment(javafx.geometry.Pos.CENTER);
        hBox0.setMaxHeight(USE_PREF_SIZE);
        hBox0.setMaxWidth(USE_PREF_SIZE);
        hBox0.setMinHeight(USE_PREF_SIZE);
        hBox0.setMinWidth(USE_PREF_SIZE);
        hBox0.setPrefHeight(50.0);
        hBox0.setPrefWidth(200.0);
        hBox0.setSpacing(10.0);

        HBox.setHgrow(button, javafx.scene.layout.Priority.NEVER);
        button.setMaxHeight(USE_PREF_SIZE);
        button.setMaxWidth(USE_PREF_SIZE);
        button.setMinHeight(USE_PREF_SIZE);
        button.setMinWidth(USE_PREF_SIZE);
        button.setMnemonicParsing(false);
        button.setPrefHeight(25.0);
        button.setPrefWidth(75.0);
        button.setText("Speichern");

        HBox.setHgrow(button0, javafx.scene.layout.Priority.NEVER);
        button0.setMaxHeight(USE_PREF_SIZE);
        button0.setMaxWidth(USE_PREF_SIZE);
        button0.setMinHeight(USE_PREF_SIZE);
        button0.setMinWidth(USE_PREF_SIZE);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(25.0);
        button0.setPrefWidth(75.0);
        button0.setText("Beenden");

        hBox.getChildren().add(textField);
        getChildren().add(hBox);
        hBox0.getChildren().add(button);
        hBox0.getChildren().add(button0);
        getChildren().add(hBox0);

    }
}
