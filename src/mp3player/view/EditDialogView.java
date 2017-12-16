package mp3player.view;

import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import mp3player.model.Playlist;
import mp3player.util.EffectUtil;
import mp3player.util.PlayListUtil;
import java.io.File;

public class EditDialogView extends AnchorPane
{

    protected final AnchorPane dialogBox;
    protected final HBox inputBox;
    protected final TextField titleTextField;
    protected final HBox buttonBox;
    protected final Button saveButton;
    protected final Button closeButton;
    protected final VBox vboxLayout;
    protected final Label labelField;
    private Stage dialogStage;
    private Scene dialogScene;
    private Playlist playlist;
    private boolean saveClicked = false;

    public EditDialogView() {
        dialogStage = new Stage();
        dialogBox = new AnchorPane();
        vboxLayout = new VBox();
        inputBox = new HBox();
        labelField = new Label();
        titleTextField = new TextField();
        buttonBox = new HBox();
        saveButton = new Button();
        closeButton = new Button();

        dialogStage.initModality(Modality.APPLICATION_MODAL);
        dialogStage.setTitle("Playlist Hinzufügen");
        dialogStage.setMinWidth(200);
        dialogStage.initStyle(StageStyle.TRANSPARENT);

        dialogBox.setMaxHeight(USE_PREF_SIZE);
        dialogBox.setMaxWidth(USE_PREF_SIZE);
        dialogBox.setMinHeight(USE_PREF_SIZE);
        dialogBox.setMinWidth(USE_PREF_SIZE);
        dialogBox.setPrefHeight(100.0);
        dialogBox.setPrefWidth(200.0);
        EffectUtil.addDragListeners(dialogBox);

        vboxLayout.setMaxHeight(USE_PREF_SIZE);
        vboxLayout.setMaxWidth(USE_PREF_SIZE);
        vboxLayout.setMinHeight(USE_PREF_SIZE);
        vboxLayout.setMinWidth(USE_PREF_SIZE);
        vboxLayout.setPrefHeight(100.0);
        vboxLayout.setPrefWidth(200.0);


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
        saveButton.setOnAction(event ->
        {
            if (isInputValid())
            {
                DirectoryChooser chooser = new DirectoryChooser();
                chooser.setTitle("Select the folder of your tracks");
                File selectedDirectory = chooser.showDialog(dialogStage);
                playlist.setPath(new SimpleStringProperty(selectedDirectory.toString()));
                playlist.setName(new SimpleStringProperty(titleTextField.getText()));
                saveClicked = true;
                dialogStage.close();
            }
        });

        HBox.setHgrow(closeButton, javafx.scene.layout.Priority.NEVER);
        closeButton.setMaxHeight(USE_PREF_SIZE);
        closeButton.setMaxWidth(USE_PREF_SIZE);
        closeButton.setMinHeight(USE_PREF_SIZE);
        closeButton.setMinWidth(USE_PREF_SIZE);
        closeButton.setMnemonicParsing(false);
        closeButton.setPrefHeight(25.0);
        closeButton.setPrefWidth(75.0);
        closeButton.setText("cancel");
        closeButton.setOnAction(e -> { dialogStage.close(); });

        inputBox.getChildren().addAll(labelField,titleTextField);
        dialogBox.getChildren().add(inputBox);
        buttonBox.getChildren().addAll(saveButton,closeButton);
        vboxLayout.getChildren().addAll(inputBox,buttonBox);
        dialogBox.getChildren().add(vboxLayout);

        dialogScene = new Scene(dialogBox);
        dialogStage.setScene(dialogScene);
        dialogStage.showAndWait();
    }

    private void intialize() { EffectUtil.addDragListeners(dialogBox); }

    private void handleDeletePlaylist()
    {
        PlayListUtil.delete(playlist);
        dialogStage.close();
    }

    public void setPlaylist(Playlist playlist)
    {
        this.playlist = playlist;
        titleTextField.setText(playlist.getName().getValue());
        if (playlist.getId().getValue() == 0)
        {
            //deletePlaylistButton.setDiasable(true);
        }
    }

    public boolean isSaveClicked() { return saveClicked; }

    public void setDialogStage(Stage dialogStage) { this.dialogStage = dialogStage; }

    private boolean isInputValid() {
        String errorMessage = "";
        if (titleTextField.getText() == null || titleTextField.getText().length() == 0) {
            errorMessage += "Please enter a valid name!\n";
        }
        if (errorMessage.length() == 0) {
            return true;
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Missing data");
            alert.setHeaderText(null);
            alert.setContentText(errorMessage);
            alert.showAndWait();
            return false;
        }
    }

}
