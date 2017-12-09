package mp3player.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Playlist
{
    private IntegerProperty id;
    private StringProperty name;
    private StringProperty path;

    public Playlist() { this(0,null,null); }

    public Playlist(Integer id, String name, String path)
    {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.path = new SimpleStringProperty(path);
    }

    public StringProperty getName() { return name; }

    public void setName(StringProperty name) { this.name = name; }

    public StringProperty getPath() { return path; }

    public void setPath(StringProperty path) { this.path = path; }

    public IntegerProperty getId() { return id; }

    public void setId(IntegerProperty id) { this.id = id; }

}
