package mp3player.view;

import javafx.collections.ObservableList;
import mp3player.MainApp;
import mp3player.model.Player;
import mp3player.model.Playlist;
import mp3player.util.PlayListUtil;

public class PlaylistViewController
{
    private static ObservableList<Playlist> observablePlaylistsView = PlayerController.observablePlaylistView;

    private static MainApp mainApp;

    private static Player playerModel;

    public PlaylistViewController(Player playerModel) { this.playerModel = playerModel; }

    public static void intitialize()
    {
        PlaylistView.buttonAddPlaylist.setOnAction(event -> handleNewPlaylist() );
    }

    private static void handleNewPlaylist()
    {
        Playlist tempPlaylist = new Playlist();
        boolean okClicked = mainApp.showPlaylistDialog(tempPlaylist);
        if (okClicked)
        {
            PlayListUtil.savePlaylist(tempPlaylist);
            observablePlaylistsView.add(tempPlaylist);
        }
    }
}
