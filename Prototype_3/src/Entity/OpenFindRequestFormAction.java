package Entity;

import java.util.List;

public class OpenFindRequestFormAction implements ButtonAction {
    private List<Request> requests;

    public OpenFindRequestFormAction(List<Request> requests) {
        this.requests = requests;
    }

    public OpenFindRequestFormAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public void performAction() {
        FindRequestFormWindow findRequestFormWindow = new FindRequestFormWindow(requests);
        findRequestFormWindow.show();
    }
}