package mp3player.model;

import com.mpatric.mp3agic.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;


public class Track
{
    private StringProperty fileName;
    private StringProperty path;
    private Mp3File mp3File;
    private StringProperty album;
    private StringProperty artist;
    private StringProperty title;
    private StringProperty year;
    private Image image;
    private ID3v1 id3v1Tag;

    public Track() { this(null, null, null); }

    public Track(String fileName, String filePath, Mp3File mp3File)
    {
        this.fileName = new SimpleStringProperty(fileName);
        this.path = new SimpleStringProperty(filePath);
        this.mp3File = mp3File;
        id3v1Tag = mp3File.getId3v1Tag();
    }

    public StringProperty getFileName() { return fileName; }

    public void setFileName(String fileName) { this.fileName.set(fileName); }

    public Mp3File getMp3File() { return mp3File; }

    public void setMp3File(Mp3File mp3File) { this.mp3File = mp3File; }

    public StringProperty getPath() {
        return path;
    }

    public void setPath(StringProperty path) {
        this.path = path;
    }

    public StringProperty getAlbum() {
        return new SimpleStringProperty(id3v1Tag.getAlbum());
    }

    public void setAlbum(StringProperty album) {
        this.album = album;
    }

    public StringProperty getArtist() {
        return new SimpleStringProperty(id3v1Tag.getArtist());
    }

    public void setArtist(StringProperty artist) {
        this.artist = artist;
    }

    public StringProperty getTitle() {
        return new SimpleStringProperty(id3v1Tag.getTitle());
    }

    public void setTitle(StringProperty title) {
        this.title = title;
    }

    public StringProperty getYear() {
        return new SimpleStringProperty(id3v1Tag.getYear());
    }

    public void setYear(StringProperty year) {
        this.year = year;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }



}
