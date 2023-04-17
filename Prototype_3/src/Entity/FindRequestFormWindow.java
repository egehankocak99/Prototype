package Entity;

import java.util.List;
import java.util.Scanner;

public class FindRequestFormWindow {
    private List<Request> requests;

    public FindRequestFormWindow(List<Request> requests) {
        this.requests = requests;
    }

    public FindRequestFormWindow() {
		// TODO Auto-generated constructor stub
	}

	public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find Request:");
        System.out.println("1. By Reference Number");
        System.out.println("2. By Client Name");
        System.out.println("3. By Request Type");
        System.out.println("4. By Created Date");
        System.out.println("5. Back to Previous Menu");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Reference Number:");
                String refNumber = scanner.next();
                for (Request request : requests) {
                    if (request.getReferenceNumber().equals(refNumber)) {
                        System.out.println(request);
                    }
                }
                break;
            case 2:
                System.out.println("Enter Client Name:");
                String clientName = scanner.next();
                for (Request request : requests) {
                    if (request.getClientName().equals(clientName)) {
                        System.out.println(request);
                    }
                }
                break;
            case 3:
                System.out.println("Enter Request Type:");
                String requestType = scanner.next();
                for (Request request : requests) {
                    if (request.getRequestType().toString().equalsIgnoreCase(requestType)) {
                        System.out.println(request);
                    }
                }
                break;
            case 4:
                System.out.println("Enter Created Date (yyyy-MM-dd):");
                String createdDate = scanner.next();
                for (Request request : requests) {
                    if (request.getCreatedOnDate().equals(createdDate)) {
                        System.out.println(request);
                    }
                }
                break;
            case 5:
                return;
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        show(); // Recursively call show() to continue searching or return to previous menu
    }
}

