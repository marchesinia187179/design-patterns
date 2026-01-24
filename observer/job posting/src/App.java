import ConcreObserver.JobSeeker;
import ConcreteObservable.EmploymentAgency;
import Model.JobPost;

public class App {
    public static void main(String[] args) throws Exception {
        JobSeeker jobSeeker1 = new JobSeeker("Topolino");
        JobSeeker jobSeeker2 = new JobSeeker("Paperino");

        EmploymentAgency employmentAgency = new EmploymentAgency();
        employmentAgency.attach(jobSeeker1);
        employmentAgency.attach(jobSeeker2);

        employmentAgency.addJob(new JobPost("Software Engineer"));

        employmentAgency.detach(jobSeeker2);

        employmentAgency.addJob(new JobPost("Data Analist"));
    }

}
