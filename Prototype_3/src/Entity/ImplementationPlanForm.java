package Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImplementationPlanForm {

    private List<ImplementationPlan> implementationPlans;

    public ImplementationPlanForm(List<ImplementationPlan> implementationPlans) {
        this.implementationPlans = implementationPlans;
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter implementation plan details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        ImplementationPlan implementationPlan = new ImplementationPlan(name, description);
        implementationPlans.add(implementationPlan);

        System.out.println("Implementation plan added successfully.");
    }
}
