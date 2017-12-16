package mp3player.model;

import de.hsrm.mi.eibo.simpleplayer.SimpleAudioPlayer;
import de.hsrm.mi.eibo.simpleplayer.SimpleMinim;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableBooleanValue;

public class Player
{
    SimpleMinim minim = new SimpleMinim(true);
    SimpleAudioPlayer audioPlayer;
    ObservableBooleanValue playingStatus = new SimpleBooleanProperty(false);

    public Player() { this(null,null); }

    public Player(SimpleMinim minim, SimpleAudioPlayer audioPlayer)
    {
        this.minim = minim;
        this.audioPlayer = audioPlayer;
        playingStatus = new SimpleBooleanProperty(false);
    }

    public Player(Track track)
    {
        audioPlayer = minim.loadMP3File(track.getFileNameString());
    }

    private boolean statusPlaying = false;

    public void play()
    {
        if (audioPlayer != null) audioPlayer.play();
    }

    public void pause()
    {
        if (audioPlayer != null) audioPlayer.pause();
    }

    public boolean playingStatus() { return audioPlayer.isPlaying(); }

    public ObservableBooleanValue getPlayingStatus() { return playingStatus; }

    public void setVolume(double volume) { audioPlayer.setVolume((float) volume / 100); }

    public int getActTime() { return audioPlayer.position(); }

    public int getTotalTime() { return audioPlayer.length(); }

    public int toSeconds(int milliSeconds) { return milliSeconds / 1000; }

    public int toMillis(int seconds) { return  seconds * 1000; }

    public void seek(int millis) { audioPlayer.skip(millis - getActTime()); }
}
