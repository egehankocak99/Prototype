package Entity;

public class Request {
    private String id;
    private String title;
    private String importanceLevel;
    private String approvalStatus;
    private String clientName;
    private String requestType;
    private String createdOnDate;

    public Request(String id, String title, String importanceLevel, String approvalStatus, String clientName, String requestType, String createdOnDate) {
        this.id = id;
        this.title = title;
        this.importanceLevel = importanceLevel;
        this.approvalStatus = approvalStatus;
        this.clientName = clientName;
        this.requestType = requestType;
        this.createdOnDate = createdOnDate;
    }

    public Request(String id2, String name, String requestType2, String createdOnDate2) {
		// TODO Auto-generated constructor stub
	}

	public Request(int idNumber, String title2, int importanceLevel2, int approvalStatus2) {
		// TODO Auto-generated constructor stub
	}

	public Request(int id2, String title2, int importanceLevel2, String approvalStatus2) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImportanceLevel() {
        return importanceLevel;
    }

    public void setImportanceLevel(String importanceLevel) {
        this.importanceLevel = importanceLevel;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getCreatedOnDate() {
        return createdOnDate;
    }

    public void setCreatedOnDate(String createdOnDate) {
        this.createdOnDate = createdOnDate;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", importanceLevel='" + importanceLevel + '\'' +
                ", approvalStatus='" + approvalStatus + '\'' +
                ", clientName='" + clientName + '\'' +
                ", requestType='" + requestType + '\'' +
                ", createdOnDate='" + createdOnDate + '\'' +
                '}';
    }

	public Object getReferenceNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void add(Request request) {
		// TODO Auto-generated method stub
		
	}
}

