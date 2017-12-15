package mp3player.model;

import de.hsrm.mi.eibo.simpleplayer.SimpleAudioPlayer;
import de.hsrm.mi.eibo.simpleplayer.SimpleMinim;

public class Player
{
    SimpleMinim minim = new SimpleMinim(true);
    SimpleAudioPlayer audioPlayer;

    public Player() { this(null,null); }

    public Player(SimpleMinim minim, SimpleAudioPlayer audioPlayer)
    {
        this.minim = minim;
        this.audioPlayer = audioPlayer;
    }

    private boolean statusPlaying = false;

    public void play() { audioPlayer.play(); }

    public void pause() { audioPlayer.pause(); }

    public boolean playingStatus() { return audioPlayer.isPlaying(); }

    public void setVolume(double volume) { audioPlayer.setVolume((float) volume / 100); }

    public int getActTime() { return audioPlayer.position(); }

    public int getTotalTime() { return audioPlayer.length(); }

    public int toSeconds(int milliSeconds) { return milliSeconds / 1000; }

    public void seek(int millis) { audioPlayer.skip(millis - getActTime()); }
}
