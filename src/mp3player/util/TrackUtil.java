package mp3player.util;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import mp3player.model.Playlist;
import mp3player.model.Track;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TrackUtil
{

    public static final List<String> SUPPORTET_FILE_EXTENTIONS = Arrays.asList(".mp3");

    public static ObservableList<Track> getAll(Playlist playlist, TableView tracktable) throws  IOException, UnsupportedTagException, InvalidDataException
    {
        ObservableList<Track> tracks = FXCollections.observableArrayList();

        File dir = new File(playlist.getPath().getValue());
        if (!dir.exists() || !dir.isDirectory())
        {
            System.out.println("Can´t find audio source directory: " + dir + " please input a directory as a command line argument");
        }

        for (String file : Objects.requireNonNull(dir.list((File dirl, String name) ->
        {
            for (String ext : SUPPORTET_FILE_EXTENTIONS) {
                if (name.endsWith(ext)) {
                    return true;
                }
            }
            return false;
        })))
        {
            String fileURL = dir + "\\" + file;
            String cleanURL = cleanURL(fileURL);
            String mediaURL = "file:///" + cleanURL;

            Track track = new Track();
            Mp3File mp3File = new Mp3File(mediaURL);
            track.setMp3File(mp3File);
            handleMetadata(track);
            track.setFileName(new SimpleStringProperty(file));
            track.setPath(new SimpleStringProperty(dir + "/" + file));
            tracks.add(track);
        }
        return tracks;
    }

    private static void handleMetadata(Track track)
    {
        //Artist
        if(track.getMp3File().getId3v2Tag().getArtist() == null || track.getMp3File().getId3v2Tag().getArtist().equals(""))
        {
            track.setArtist(new SimpleStringProperty("Unknown"));
        }
        else
        {
            track.setArtist(new SimpleStringProperty(track.getMp3File().getId3v2Tag().getArtist()));
        }
        //Album
        if(track.getMp3File().getId3v2Tag().getAlbum() == null || track.getMp3File().getId3v2Tag().getAlbum().equals(""))
        {
            track.setAlbum(new SimpleStringProperty("Unknown"));
        }
        else
        {
            track.setAlbum(new SimpleStringProperty(track.getMp3File().getId3v2Tag().getAlbum()));
        }
        //Title
        if(track.getMp3File().getId3v2Tag().getTitle() == null || track.getMp3File().getId3v2Tag().getTitle().equals(""))
        {
            track.setTitle(new SimpleStringProperty("Unknown"));
        }
        else
        {
            track.setTitle(new SimpleStringProperty(track.getMp3File().getId3v2Tag().getTitle()));
        }
        //Year
        if(track.getMp3File().getId3v2Tag().getYear() == null || track.getMp3File().getId3v2Tag().getYear().equals(""))
        {
            track.setYear(new SimpleStringProperty("Unknown"));
        }
        else
        {
            track.setYear(new SimpleStringProperty(track.getMp3File().getId3v2Tag().getYear()));
        }
        //Image
        try
        {
            InputStream in = new ByteArrayInputStream(track.getMp3File().getId3v2Tag().getAlbumImage());
            BufferedImage imageFromStream = ImageIO.read(in);
            track.setImage(SwingFXUtils.toFXImage(imageFromStream, null));
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void refreshTable(TableView table)
    {
        for (int i = 0; i < table.getColumns().size(); i++)
        {
            TableColumn tableColumn = ((TableColumn) (table.getColumns().get(i)));
            if (tableColumn.isVisible())
            {
                tableColumn.setVisible(false);
                tableColumn.setVisible(true);
            }
        }
    }

    private static String cleanURL(String url)
    {
        url = url.replace("\\", "/");
        url = url.replaceAll(" ", "%20");
        url = url.replace("[", "%5B");
        url = url.replace("]", "%5D");
        return url;
    }
}
