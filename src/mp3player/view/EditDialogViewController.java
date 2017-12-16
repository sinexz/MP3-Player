package mp3player.view;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Alert;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import mp3player.model.Playlist;
import mp3player.util.EffectUtil;
import mp3player.util.PlayListUtil;

import java.io.File;

public class EditDialogViewController
{
    private Stage dialogStage;
    private Playlist playlist;
    public boolean saveClicked = false;

    public static void intialize() { EffectUtil.addDragListeners(EditDialogView.dialogBox); }

    public void setDialogStage(Stage dialogStage) { this.dialogStage = dialogStage; }

    public void setPlaylist(Playlist playlist)
    {
        this.playlist = playlist;
        EditDialogView.titleTextField.setText(playlist.getName().getValue());
        if (playlist.getId().getValue() == 0)
        {
            EditDialogView.deleteButton.setDisable(true);
        }
    }

    public boolean isSaveClicked() { return saveClicked; }

    private void handleDeletePlaylist()
    {
        PlayListUtil.delete(playlist);
        dialogStage.close();
    }

    private void handleSelectFolder()
    {
        EditDialogView.saveButton.setOnAction(event ->
        {
            if (isInputValid())
            {
                DirectoryChooser chooser = new DirectoryChooser();
                chooser.setTitle("Select the folder of your tracks");
                File selectedDirectory = chooser.showDialog(dialogStage);
                playlist.setPath(new SimpleStringProperty(selectedDirectory.toString()));
                playlist.setName(new SimpleStringProperty(EditDialogView.titleTextField.getText()));
                saveClicked = true;
                dialogStage.close();
            }
        });
    }

    private void handleClose() { EditDialogView.closeButton.setOnAction(e -> dialogStage.close()); }

    private boolean isInputValid() {
        String errorMessage = "";
        if (EditDialogView.titleTextField.getText() == null || EditDialogView.titleTextField.getText().length() == 0) {
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
