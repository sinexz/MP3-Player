package mp3player.view;

import com.mpatric.mp3agic.Mp3File;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import mp3player.MainApp;
import mp3player.model.*;
import mp3player.util.*;
import javafx.scene.control.ListView;

public class PlayerViewController
{
    /**
     * Alle benötigten Variablen und Objekte
     */
    //Playlist list
    private ListView<Playlist> playlistView;
    private ObservableList<Playlist> observablePlaylistsView;

    //Reference to main application
    private MainApp mainApp;

    //Initialize playerModel and current media
    private Player player;
    private Track currentTrack;
    private Track prevTrack;
    private Track nextTrack;
    private Mp3File mp3File;
    private Player playerModel;

    public PlayerViewController(Player model)
    {
        this.playerModel = model;
    }

    private void intitialize()
    {
        //setupPlaylistView();
        //setupTrackTableView();
    }

    public void setMainApp(MainApp mainApp) { this.mainApp = mainApp; }

    private void handlePlayTrigger()
    {
        if(player != null)
        {
            boolean playing = player.playingStatus();
            if(playing)
            {
                player.pause();
            }
            else
            {
                player.play();
            }
        }
    }
/*
    private void handleNextTrack() { if (nextTrack != null) playTrack(nextTrack); }

    private void handlePrevTrack() { if (prevTrack != null) playTrack(prevTrack); }

    private void handleNewPlaylist()
    {
        Playlist tempPlaylist = new Playlist();
        boolean okClicked = mainApp.showPlaylistDialog(tempPlaylist);
        if (okClicked)
        {
            PlayListUtil.savePlaylist(tempPlaylist);
            observablePlaylistsView.add(tempPlaylist);
        }
    }

    public void setupPlaylistView()
    {
        observablePlaylistsView = PlayListUtil.getAll();
        playlistView.setItems(observablePlaylistsView);


        playlistView.setCellFactory((ListView<Playlist> p) ->
        {
            ListCell<Playlist> cell = new ListCell<Playlist>()
            {
                @Override
                protected void updateItem(Playlist playlist, boolean bln)
                {
                    super.updateItem(playlist, bln);
                    if (playlist != null)
                    {

                    }
                }
            }
        });
    }
*/
}
