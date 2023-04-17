package Entity;

import java.util.List;

public class Client extends Person {
    public Client(String name, int age, String gender) {
		super(name, age, gender);
	}
	private int number;
    private Subscription tier;
    private String billing;
    private boolean feedbackAccepted;
    private boolean interviewAccepted;
    private boolean surveyAssigned;
    private boolean feedbackAssigned;
    private boolean interviewScheduled;
    private FeedbackRequest feedbackRequestType;
    private List<String> surveyQuestions;
    private List<ImplementationPlan> implementationPlans;
    
    public int getNumber() {
        return number;}
    public void setNumber(int number) {
        this.number = number;}
    public Subscription getTier() {
        return tier;}
    public void setTier(Subscription tier) {
        this.tier = tier;}
    public String getBilling() {
        return billing;}
    public void setBilling(String billing) {
        this.billing = billing;}
    public boolean isFeedbackAccepted() {
        return feedbackAccepted;}
    public void setFeedbackAccepted(boolean feedbackAccepted) {
        this.feedbackAccepted = feedbackAccepted;}
    public boolean isInterviewAccepted() {
        return interviewAccepted;}
    public void setInterviewAccepted(boolean interviewAccepted) {
        this.interviewAccepted = interviewAccepted;}
    public boolean isSurveyAssigned() {
        return surveyAssigned;}
    public void setSurveyAssigned(boolean surveyAssigned) {
        this.surveyAssigned = surveyAssigned;}
    public boolean isFeedbackAssigned() {
        return feedbackAssigned;}
    public void setFeedbackAssigned(boolean feedbackAssigned) {
        this.feedbackAssigned = feedbackAssigned;}
    public boolean isInterviewScheduled() {
        return interviewScheduled;}
    public void setInterviewScheduled(boolean interviewScheduled) {
        this.interviewScheduled = interviewScheduled;}
    public FeedbackRequest getFeedbackRequestType() {
        return feedbackRequestType;}
    public void setFeedbackRequestType(FeedbackRequest feedbackRequestType) {
        this.feedbackRequestType = feedbackRequestType;}
    public List<String> getSurveyQuestions() {
        return surveyQuestions;}
    public void setSurveyQuestions(List<String> surveyQuestions) {
        this.surveyQuestions = surveyQuestions;}
    public List<ImplementationPlan> getImplementationPlans() {
        return implementationPlans;}
    public void setImplementationPlans(List<ImplementationPlan> implementationPlans) {
        this.implementationPlans = implementationPlans;}
    public void assignFeedbackRequest(FeedbackRequest aFeedbackRequest) {
        constructFeedbackRequest();
        if (feedbackAccepted) {
            Survey survey = constructSurvey();
            if (surveyAssigned && survey != null) {
                assignFeedbackRequest(survey);
                assignSurvey(survey);
            }
        }
        if (interviewAccepted && feedbackAssigned) {
            FeedbackInterview feedbackInterview = constructFeedbackInterview();
            if (feedbackInterview != null) {
                assignFeedbackRequest(feedbackInterview);
                assignInterview(feedbackInterview);
            }
        }
    }
    private void assignSurvey(Survey survey) {
		
	}
	private void assignInterview(FeedbackInterview feedbackInterview) {
    }
    public void constructFeedbackRequest() {
        System.out.println("Feedback request constructed.");
    }
    public Survey constructSurvey() {
        System.out.println("Survey is constructed.");
        return new Survey(surveyQuestions);
    }
    public FeedbackInterview constructFeedbackInterview() {
        System.out.println("Feedback interview is constructed.");
        return new FeedbackInterview();
    }
    public void assignFeedbackRequest(Survey survey) {
        System.out.println("Feedback request is assigned with survey.");  
    }
    public void assignFeedbackRequest(FeedbackInterview feedbackInterview) {
        System.out.println("Feedback request is assigned with feedback interview.");
    }
}
