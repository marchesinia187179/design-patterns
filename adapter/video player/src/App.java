import Client.VideoPlayer;

public class App {
    public static void main(String[] args) throws Exception {
        VideoPlayer videoPlayer = new VideoPlayer();

        videoPlayer.play("mp4", "italy.mp4");

        videoPlayer.play("vlc", "italy.vlc");
        videoPlayer.play("avi", "italy.avi");

        videoPlayer.play("mkv", "italy.mkv");
    }
}
