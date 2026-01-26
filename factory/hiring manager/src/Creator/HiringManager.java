package Creator;

import Product.Interviewer;

public abstract class HiringManager {
    protected abstract Interviewer makeInterviewer();

    public void takeInterviewer() {
        Interviewer interviewer = makeInterviewer();
        interviewer.askQuestions();
    }

}
