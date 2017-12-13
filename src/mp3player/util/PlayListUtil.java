package mp3player.util;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import mp3player.model.Playlist;
import java.util.prefs.Preferences;

public class PlayListUtil
{
    private static final String PLAYLIST_NODE = "mp3player.playlists";
    private static final String PLAYLIST_NUMBER = "PLAYLIST_NUMBER";
    private static final String PLAYLIST_NAME = "PLAYLIST_";
    private static final String PLAYLIST_PATH = "PLAYLIST_PATH_";

    private static final Preferences prefs = Preferences.userRoot().node(PLAYLIST_NODE);

    public static void savePlaylist(Playlist playlist)
    {
        int playlistNumber = getPlaylistNumber() + 1;
        prefs.put(PLAYLIST_NAME + playlistNumber, playlist.getName().getValue());
        prefs.put(PLAYLIST_PATH + playlistNumber, playlist.getPath().getValue());
        prefs.putInt(PLAYLIST_NUMBER, playlistNumber);
    }

    public static int getPlaylistNumber() { return prefs.getInt(PLAYLIST_NUMBER, 0); }

    public static ObservableList<Playlist> getAll()
    {
        ObservableList<Playlist> playlists = FXCollections.observableArrayList();

        for(int i = 1; i <= getPlaylistNumber(); i++)
        {
            String listName = prefs.get(PLAYLIST_NAME + i, null);
            String listPath = prefs.get(PLAYLIST_PATH + i, null);
            Playlist playlist = new Playlist(i, listName, listPath);
            playlists.add(playlist);
        }
        return playlists;
    }

    public static void deleteAll()
    {
        for (int i = 0; i < getPlaylistNumber(); i++)
        {
            prefs.remove(PLAYLIST_NAME + i);
            prefs.remove(PLAYLIST_PATH + i);
            prefs.putInt(PLAYLIST_NUMBER, 0);
        }
    }

    public static void delete(Playlist playlist)
    {
        prefs.remove(PLAYLIST_NAME + playlist.getId().getValue());
        prefs.remove(PLAYLIST_PATH + playlist.getId().getValue());
        prefs.putInt(PLAYLIST_NUMBER, prefs.getInt(PLAYLIST_NUMBER, 0) -1);
    }

    public static void refreshList(ListView listView)
    {
        ObservableList<Playlist> items = getAll();
        listView.setItems(null);
        listView.setItems(items);
    }
}
