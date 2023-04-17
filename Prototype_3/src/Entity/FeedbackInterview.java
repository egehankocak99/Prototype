package Entity;

import java.time.LocalDateTime;

public class FeedbackInterview {
    private LocalDateTime dateTime;
    private Employee interviewer;
    private Employee interviewee;
    private Feedback feedback;    
    public FeedbackInterview(LocalDateTime dateTime, Employee interviewer, Employee interviewee) {
        this.dateTime = dateTime;
        this.interviewer = interviewer;
        this.interviewee = interviewee;
    }   
    public FeedbackInterview() {
	}
	public LocalDateTime getDateTime() {
        return dateTime;
    }    
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    public Employee getInterviewer() {
        return interviewer;
    }    
    public void setInterviewer(Employee interviewer) {
        this.interviewer = interviewer;
    }   
    public Employee getInterviewee() {
        return interviewee;
    }   
    public void setInterviewee(Employee interviewee) {
        this.interviewee = interviewee;
    }   
    public Feedback getFeedback() {
        return feedback;
    }    
    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }  
    public void conductInterview() {
    }
}
