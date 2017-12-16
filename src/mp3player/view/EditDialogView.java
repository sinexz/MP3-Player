package mp3player.view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import mp3player.model.Playlist;
import mp3player.util.EffectUtil;

public class EditDialogView extends AnchorPane
{

    public static AnchorPane dialogBox;
    protected final HBox inputBox;
    protected static TextField titleTextField;
    protected final HBox buttonBox;
    protected static Button saveButton;
    protected static Button closeButton;
    protected static Button deleteButton;
    protected final VBox vBoxLayout;
    protected final Label labelField;
    public static Stage dialogStage;
    public static Scene dialogScene;
    private Playlist playlist;
    private boolean saveClicked = false;

    public EditDialogView() {
        dialogStage = new Stage();
        dialogBox = new AnchorPane();
        vBoxLayout = new VBox();
        inputBox = new HBox();
        labelField = new Label();
        titleTextField = new TextField();
        buttonBox = new HBox();
        saveButton = new Button();
        closeButton = new Button();
        deleteButton = new Button();

        dialogStage.initModality(Modality.APPLICATION_MODAL);
        dialogStage.setTitle("New Playlist");
        dialogStage.setMinWidth(200);
        dialogStage.initStyle(StageStyle.TRANSPARENT);

        dialogBox.setMaxHeight(USE_PREF_SIZE);
        dialogBox.setMaxWidth(USE_PREF_SIZE);
        dialogBox.setMinHeight(USE_PREF_SIZE);
        dialogBox.setMinWidth(USE_PREF_SIZE);
        dialogBox.setPrefHeight(100.0);
        dialogBox.setPrefWidth(200.0);
        EffectUtil.addDragListeners(dialogBox);

        vBoxLayout.setMaxHeight(USE_PREF_SIZE);
        vBoxLayout.setMaxWidth(USE_PREF_SIZE);
        vBoxLayout.setMinHeight(USE_PREF_SIZE);
        vBoxLayout.setMinWidth(USE_PREF_SIZE);
        vBoxLayout.setPrefHeight(100.0);
        vBoxLayout.setPrefWidth(200.0);


        VBox.setVgrow(inputBox, javafx.scene.layout.Priority.NEVER);
        inputBox.setMaxHeight(USE_PREF_SIZE);
        inputBox.setMaxWidth(USE_PREF_SIZE);
        inputBox.setMinHeight(USE_PREF_SIZE);
        inputBox.setMinWidth(USE_PREF_SIZE);
        inputBox.setPrefHeight(50.0);
        inputBox.setPrefWidth(200.0);
        inputBox.setMargin(titleTextField,new Insets(10,0,0,0));
        inputBox.setMargin(labelField, new Insets(0,0,0,10));

        labelField.setMaxHeight(USE_PREF_SIZE);
        labelField.setMaxWidth(USE_PREF_SIZE);
        labelField.setMinHeight(USE_PREF_SIZE);
        labelField.setMinWidth(USE_PREF_SIZE);
        labelField.setPrefHeight(50.0);
        labelField.setPrefWidth(50.0);
        labelField.setText("Name:");


        HBox.setHgrow(titleTextField, javafx.scene.layout.Priority.NEVER);
        titleTextField.setMaxHeight(USE_PREF_SIZE);
        titleTextField.setMaxWidth(USE_PREF_SIZE);
        titleTextField.setMinHeight(USE_PREF_SIZE);
        titleTextField.setMinWidth(USE_PREF_SIZE);
        titleTextField.setPrefHeight(22.0);
        titleTextField.setPrefWidth(120.0);

        VBox.setVgrow(buttonBox, Priority.ALWAYS);
        buttonBox.setAlignment(javafx.geometry.Pos.CENTER);
        buttonBox.setMaxHeight(USE_PREF_SIZE);
        buttonBox.setMaxWidth(USE_PREF_SIZE);
        buttonBox.setMinHeight(USE_PREF_SIZE);
        buttonBox.setMinWidth(USE_PREF_SIZE);
        buttonBox.setPrefHeight(50.0);
        buttonBox.setPrefWidth(200.0);
        buttonBox.setSpacing(10.0);

        HBox.setHgrow(saveButton, javafx.scene.layout.Priority.NEVER);
        saveButton.setMaxHeight(USE_PREF_SIZE);
        saveButton.setMaxWidth(USE_PREF_SIZE);
        saveButton.setMinHeight(USE_PREF_SIZE);
        saveButton.setMinWidth(USE_PREF_SIZE);
        saveButton.setMnemonicParsing(false);
        saveButton.setPrefHeight(25.0);
        saveButton.setPrefWidth(75.0);
        saveButton.setText("save");


        HBox.setHgrow(closeButton, javafx.scene.layout.Priority.NEVER);
        closeButton.setMaxHeight(USE_PREF_SIZE);
        closeButton.setMaxWidth(USE_PREF_SIZE);
        closeButton.setMinHeight(USE_PREF_SIZE);
        closeButton.setMinWidth(USE_PREF_SIZE);
        closeButton.setMnemonicParsing(false);
        closeButton.setPrefHeight(25.0);
        closeButton.setPrefWidth(75.0);
        closeButton.setText("cancel");

        deleteButton.setMaxHeight(USE_PREF_SIZE);
        deleteButton.setMaxWidth(USE_PREF_SIZE);
        deleteButton.setMinHeight(USE_PREF_SIZE);
        deleteButton.setMinWidth(USE_PREF_SIZE);
        deleteButton.setPrefHeight(20.0);
        deleteButton.setPrefWidth(25.0);
        deleteButton.setGraphic(new ImageView(new Image("file:src/mp3player/view/img/deleteButton.png",
                deleteButton.getPrefWidth(),deleteButton.getPrefHeight(),true,true)));
        deleteButton.setContentDisplay(ContentDisplay.CENTER);
        deleteButton.setStyle("-fx-background-color: transparent;");

        inputBox.getChildren().addAll(labelField,titleTextField);
        dialogBox.getChildren().add(inputBox);
        buttonBox.getChildren().addAll(saveButton,closeButton,deleteButton);
        vBoxLayout.getChildren().addAll(inputBox,buttonBox);
        dialogBox.getChildren().add(vBoxLayout);

        dialogScene = new Scene(dialogBox);
        dialogStage.setScene(dialogScene);
        dialogStage.showAndWait();
        EditDialogViewController.intialize();
    }
}
