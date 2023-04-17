package Entity;

import java.util.List;

public class RequestLinkReport {

    private List<FeedbackRequest> feedbackRequests;

    public RequestLinkReport(List<FeedbackRequest> feedbackRequests) {
        this.feedbackRequests = feedbackRequests;
    }

    public RequestLinkReport() {
		// TODO Auto-generated constructor stub
	}

	public void show() {
        System.out.println("Feedback Request Link Report\n");

        for (FeedbackRequest request : feedbackRequests) {
            System.out.printf("ID: %d\n", request.getId());
            System.out.printf("Link: %s\n", request.getLink());
            System.out.println();
        }
    }

    public void generateReport() {
        System.out.println("Report generated and saved.");
    }
}
