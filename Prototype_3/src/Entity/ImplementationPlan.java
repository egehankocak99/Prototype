package Entity;

public class ImplementationPlan {
    private String id;
    private String name;
    private String description;
    private String title;
    private int importanceLevel;
    private boolean approvalStatus;

    public ImplementationPlan(String id, String name, String description, String title, int importanceLevel, boolean approvalStatus) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.title = title;
        this.importanceLevel = importanceLevel;
        this.approvalStatus = approvalStatus;
    }

    public ImplementationPlan(String name2, String description2) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImportanceLevel() {
        return importanceLevel;
    }

    public void setImportanceLevel(int importanceLevel) {
        this.importanceLevel = importanceLevel;
    }

    public boolean isApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Description: " + description +
                ", Title: " + title + ", Importance Level: " + importanceLevel +
                ", Approval Status: " + (approvalStatus ? "Approved" : "Not Approved");
    }
}

