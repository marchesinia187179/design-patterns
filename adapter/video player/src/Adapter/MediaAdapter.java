package Adapter;

import Adaptee.AviPlayer;
import Adaptee.VlcPlayer;
import Target.AdvancedMediaPlayer;
import Target.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer vlcMediaPlayer = new VlcPlayer();
    AdvancedMediaPlayer aviMediaPlayer = new AviPlayer();

    @Override
    public void play(String videoType, String filename) {
        if (videoType.equalsIgnoreCase("vlc")) {
            vlcMediaPlayer.playVlc(filename);            
        } else {
            aviMediaPlayer.playAvi(filename);
        }
    }
    
}
