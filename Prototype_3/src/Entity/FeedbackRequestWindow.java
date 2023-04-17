package Entity;

import java.util.Scanner;

public class FeedbackRequestWindow {

    public void addButton(String label, ButtonAction buttonAction) {
    }
    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Feedback Request Window");
        System.out.println("=======================");
        System.out.println("1. Add a new Request");
        System.out.println("2. List the Requests");
        System.out.println("3. Find a Request");
        System.out.println("4. Send a Request");
        System.out.println("5. Exit");
        int choice = 0;
        while (choice != 5) {
            System.out.print("\nPlease enter your choice: ");
            choice = scanner.nextInt();
           scanner.nextLine(); 
            switch (choice) {
                case 1:
                    AddRequestMenuWindow addRequestFormWindow = new AddRequestMenuWindow();
                    addRequestFormWindow.show();
                    break;
                case 2:
                    RequestLinkReport requestLinkReport = new RequestLinkReport();
                    requestLinkReport.show();
                    break;
                case 3:
                    FindRequestFormWindow findRequestFormWindow = new FindRequestFormWindow();
                    findRequestFormWindow.show();
                    break;
                case 4:
                    SendRequestFormWindow sendRequestFormWindow = new SendRequestFormWindow();
                    sendRequestFormWindow.show();
                    break;
                case 5:
                    System.out.println("Exiting Feedback Request Window");
                    break;
                default:
                    System.out.println("Please try again");
                    break;
            }
        }
    }
	public void addButton(String label, OpenAddRequestFormAction openAddRequestFormAction) {
		// TODO Auto-generated method stub
		
	}

	public void addButton(String label, OpenRequestLinkReportAction openRequestLinkReportAction) {
		// TODO Auto-generated method stub
		
	}

	public void addButton(String label, OpenFindRequestFormAction openFindRequestFormAction) {
		
	}

	public void addButton(String label, OpenSendRequestFormAction openSendRequestFormAction) {
		
	}

	public void clearButtons() {
		
	}
}
