package Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImplementationPlanWindow {
    private List<ImplementationPlan> implementationPlans;

    public ImplementationPlanWindow() {
        implementationPlans = new ArrayList<>();
    }

    public void addButton(String label, ButtonAction action) {
        // Not needed for this implementation
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nImplementation Plan Window");
            System.out.println("------------------------");
            System.out.println("1. List implementation plans");
            System.out.println("2. Add implementation plan");
            System.out.println("3. Exit");
            System.out.print("> ");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                listImplementationPlans();
            } else if (choice.equals("2")) {
                addImplementationPlan(scanner);
            } else if (choice.equals("3")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void listImplementationPlans() {
        System.out.println("\nImplementation Plans:");
        if (implementationPlans.size() == 0) {
            System.out.println("No implementation plans found.");
        } else {
            for (int i = 0; i < implementationPlans.size(); i++) {
                ImplementationPlan implementationPlan = implementationPlans.get(i);
                System.out.printf("%d. %s (%s)\n", i + 1, implementationPlan.getName(), implementationPlan.getDescription());
            }
        }
    }

    private void addImplementationPlan(Scanner scanner) {
        System.out.println("\nEnter implementation plan details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        ImplementationPlan implementationPlan = new ImplementationPlan(name, description);
        implementationPlans.add(implementationPlan);

        System.out.println("Implementation plan added successfully.");
    }
}
