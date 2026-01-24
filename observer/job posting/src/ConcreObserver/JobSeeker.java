package ConcreObserver;

import Model.JobPost;
import Observer.Observer;

public class JobSeeker implements Observer {
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void onJobPosted(JobPost job) {
        System.out.println("Hi " + name + "! New job posted: " + job.getTitle());
    }
    
}
