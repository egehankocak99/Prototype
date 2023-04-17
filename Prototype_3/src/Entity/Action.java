package Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Action {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int subChoice = 0;
        boolean exit = false;
        List<ImplementationPlan> implementationPlans = new ArrayList<>();
        List<Request> requests = new ArrayList<>();

        ImplementationPlanWindow implementationPlanWindow = new ImplementationPlanWindow();
        InterviewFormWindow interviewFormWindow = new InterviewFormWindow();
        FeedbackRequestWindow feedbackRequestMenuWindow = new FeedbackRequestWindow();
        ListImplementationPlansAction listImplementationPlansAction = new ListImplementationPlansAction(implementationPlans);

        while (!exit) {
            System.out.println("Please select one of the below options:");
            System.out.println("1. Implementation Plan");
            System.out.println("2. Define Interview");
            System.out.println("3. Request for Feedback");
            System.out.println("4. Exit the application");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    subChoice = 0;
                    while (subChoice != 3) {
                        System.out.println("Implementation Plan");
                        System.out.println("-----------");
                        System.out.println("1. List the possible implementation plans");
                        System.out.println("2. Add a new implementation plan");
                        System.out.println("3. Go back to the main menu");

                        subChoice = scanner.nextInt();

                        if (subChoice == 1) {
                            implementationPlanWindow.show();
                        } else if (subChoice == 2) {
                            scanner.nextLine();
                            System.out.println("Enter the implementation plan details:");
                            System.out.print("Name of the plan: ");
                            String name = scanner.nextLine();
                            System.out.print("Description of the plan: ");
                            String description = scanner.nextLine();
                            implementationPlans.add(new ImplementationPlan(name, description));
                            System.out.println("Congratulations! Implementation plan added successfully.");
                        }
                    }
                    subChoice = 0;
                    break;

                case 2:
                    subChoice = 0;
                    while (subChoice != 2) {
                        System.out.println("Define Interview Form");
                        System.out.println("----------------");
                        System.out.println("1. Add a New Interview Question:");
                        System.out.println("2. Go back to the Main Menu");

                        subChoice = scanner.nextInt();

                        if (subChoice == 1) {
                            interviewFormWindow.addButton("Done!", new OpenDefineInterviewWindowAction(interviewFormWindow));
                            interviewFormWindow.show();
                        }
                    }
                    subChoice = 0;
                    break;

                case 3:
                    subChoice = 0;
                    while (subChoice != 4) {
                        System.out.println("Request for Feedback Form");
                        System.out.println("--------------------");
                        System.out.println("1. Add a Feedback Request:");
                        System.out.println("2. List of the Requests");
                        System.out.println("3. Find a Request");
                        System.out.println("4. Go back to the Main Menu");

                        subChoice = scanner.nextInt();

                        if (subChoice == 1) {
                            feedbackRequestMenuWindow.addButton("Add Feedback Request", new OpenAddRequestFormAction(requests));
                            feedbackRequestMenuWindow.show();
                        } else if (subChoice == 2) {
                            feedbackRequestMenuWindow.addButton("List of the Requests", new OpenRequestLinkReportAction(requests));
                            feedbackRequestMenuWindow.show();
                        } else if (subChoice == 3) {
                            feedbackRequestMenuWindow.addButton("Find a Request", new OpenFindRequestFormAction(requests));
                            feedbackRequestMenuWindow.show();
                        } else if (subChoice == 4) {
                            subChoice = 0;
                        } else {
                            System.out.println("Invalid option. Please use one of the possible options.");
                        }
                        feedbackRequestMenuWindow.clearButtons();
                    }
                    subChoice = 0;
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please use one of the possible options.");
                    break;
            }
        }
        scanner.close();
    }
}
