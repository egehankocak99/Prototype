package Entity;
import java.util.List;
import java.util.Scanner;
public class AddImplementationPlan implements ButtonAction {
    private List<ImplementationPlan> implementationPlans;
    public AddImplementationPlan(List<ImplementationPlan> implementationPlans) {
        this.implementationPlans = implementationPlans;
    }
    public void performAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter implementation plan details:");
        System.out.print("Name of the plan: ");
        String name = scanner.nextLine();
        System.out.print("Description of the plan: ");
        String description = scanner.nextLine();
        ImplementationPlan implementationPlan = new ImplementationPlan(name, description);
        implementationPlans.add(implementationPlan);
        System.out.println("Congratulations! Plan added successfully.");
    }
}
