package Entity;

import java.util.Scanner;

public class SendRequestFormWindow {

    public void show() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter recipient email:");
        String recipientEmail = scanner.nextLine();

        System.out.println("Enter request type (FEEDBACK or SURVEY):");
        String requestTypeString = scanner.nextLine();

        RequestType requestType = null;
        try {
            requestType = RequestType.valueOf(requestTypeString.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid request type. Please try again.");
            return;
        }

        String subject = "Feedback Request";
        String body = "Dear recipient,\n\nPlease fill out the " + requestType + " form using the following link: " 
                + "http://example.com/" + requestType + "/form\n\nThank you for your cooperation.";

        System.out.println("Email sent to " + recipientEmail + " with subject: " + subject + " and body: " + body);
    }

}
