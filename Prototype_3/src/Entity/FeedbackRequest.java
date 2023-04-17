package Entity;

public class FeedbackRequest {
    private int id;
    private String type;
    private String description;
    public FeedbackRequest(int id, String type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
    }
    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public String getDescription() {
        return description;
    }
	public static FeedbackRequest findRequest(int requestId) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getLink() {
		// TODO Auto-generated method stub
		return null;
	}
}
