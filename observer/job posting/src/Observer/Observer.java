package Observer;

import Model.JobPost;

public interface Observer {
    void onJobPosted(JobPost job);

}
