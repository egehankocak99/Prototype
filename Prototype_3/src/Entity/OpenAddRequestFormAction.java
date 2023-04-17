package Entity;

import java.util.List;
import java.util.Scanner;

public class OpenAddRequestFormAction implements ButtonAction {

    private List<Request> requests;

    public OpenAddRequestFormAction(List<Request> requests) {
        this.requests = requests;
    }

    @Override
    public void performAction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add a Feedback Request");
        System.out.println("----------------");

        System.out.print("ID Number: ");
        int idNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.println("Importance Level: ");
        System.out.println("1. Not important");
        System.out.println("2. Important");
        System.out.println("3. Very important");
        int importanceLevel = scanner.nextInt();
        System.out.println("Approval Status: ");
        System.out.println("1. Approved");
        System.out.println("2. Not approved");
        int approvalStatus = scanner.nextInt();

        Request request = new Request(idNumber, title, importanceLevel, approvalStatus);
        requests.add(request);

        System.out.println("The request has been added successfully.");

        scanner.close();
    }

}
