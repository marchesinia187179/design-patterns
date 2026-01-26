package Adaptee;

import Target.AdvancedMediaPlayer;

public class AviPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // Do nothing
    }

    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing avi file. Name: " + fileName);
    }
    
}
