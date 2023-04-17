package Entity;
import java.util.List;
import java.util.Scanner;
public class AddImplementationPlanAction implements ButtonAction {
    private List<ImplementationPlan> implementationPlans;
    public AddImplementationPlanAction(List<ImplementationPlan> implementationPlans) {
        this.implementationPlans = implementationPlans;
    }
    public void performAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter implementation plan details:");
        System.out.print("Name of the plan: ");
        String name = scanner.nextLine();
        System.out.print("Description of the Implementation Plan: ");
        String description = scanner.nextLine();
        ImplementationPlan implementationPlan = new ImplementationPlan(name, description);
        implementationPlans.add(implementationPlan);
        System.out.println("Plan added successfully!");
    }
	public void setImplementationPlans(List<ImplementationPlan> implementationPlans2) {	
	}
}
