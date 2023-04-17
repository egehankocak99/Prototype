package Entity;

import java.util.Scanner;

public class InterviewFormWindow {

    public void show() {
        System.out.println("=== Interview Form ===");
        System.out.println("Please fill in the following information:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Interviewer name: ");
        String interviewerName = scanner.nextLine();
        System.out.print("Interviewee name: ");
        String intervieweeName = scanner.nextLine();
        System.out.print("Interview date: ");
        String interviewDate = scanner.nextLine();
        System.out.println("Interview created successfully.");
        System.out.println();
    }

    public void addButton(String label, OpenDefineInterviewWindowAction action) {
    }
}
