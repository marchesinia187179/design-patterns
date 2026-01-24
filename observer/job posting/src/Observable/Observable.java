package Observable;

import Model.JobPost;
import Observer.Observer;

public interface Observable {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(JobPost job);
}
