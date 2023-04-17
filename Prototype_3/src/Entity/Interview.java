package Entity;

public class Interview {
    private String interviewerName;
    private String intervieweeName;
    private String date;

    public Interview(String interviewerName, String intervieweeName, String date) {
        this.interviewerName = interviewerName;
        this.intervieweeName = intervieweeName;
        this.date = date;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public String getIntervieweeName() {
        return intervieweeName;
    }

    public void setIntervieweeName(String intervieweeName) {
        this.intervieweeName = intervieweeName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
