package Client;

import Adapter.MediaAdapter;
import Target.MediaPlayer;

public class VideoPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter = new MediaAdapter();

    @Override
    public void play(String videoType, String filename) {
        if (videoType.equalsIgnoreCase("mp4")) {
            System.out.println("Playing mp4 file. Name: " + filename);
        } else if (videoType.equalsIgnoreCase("vlc") || videoType.equalsIgnoreCase("avi")) {
            mediaAdapter.play(videoType, filename);
        } else {
            System.out.println("Invalid media. " + videoType + " format not supported!");
        }
    }
    
}
