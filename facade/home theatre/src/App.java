import Facade.HomeTheaterFacade;
import Subsystem.DVDPlayer;
import Subsystem.Projector;
import Subsystem.Screen;
import Subsystem.SoundSystem;

public class App {
    public static void main(String[] args) throws Exception {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
            dvdPlayer, projector, soundSystem, screen
        );

        homeTheaterFacade.watchMovie("The imitation game");
        homeTheaterFacade.endMovie();
    }
}
