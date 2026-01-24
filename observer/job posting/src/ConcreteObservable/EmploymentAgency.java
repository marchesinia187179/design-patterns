package ConcreteObservable;

import java.util.ArrayList;
import java.util.List;

import Model.JobPost;
import Observable.Observable;
import Observer.Observer;

public class EmploymentAgency implements Observable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(JobPost job) {
        for (Observer observer : observers) {
            observer.onJobPosted(job);
        }
    }

    public void addJob(JobPost jobPosting) {
        notifyObservers(jobPosting);
    }
    
}
