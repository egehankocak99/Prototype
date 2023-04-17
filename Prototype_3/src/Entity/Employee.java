package Entity;

public class Employee extends Person {
    public Employee(String name, int age, String gender) {
		super(name, age, gender);
	}
	private int id;
    private String department;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void draftFeedback(Feedback requested){
    }
    public void sendImplementation(Implementation sent){
    }
    public void conductInterview(Interview conducted){
    }
    public void scheduleInterview(Interview scheduled){
    }
    public void sendFeedbackRequest(FeedbackRequest sent){
    }
    public void defineInterview(Interview define){
   
    }
    public void defineSurvey(Survey define){
        
    }
    public void defineImplementation(Implementation define){

    }
}
