package Entity;

import java.util.List;

public class ListImplementationPlansAction {
    private List<ImplementationPlan> implementationPlans;

    public ListImplementationPlansAction(List<ImplementationPlan> implementationPlans) {
        this.implementationPlans = implementationPlans;
    }

    public void execute() {
        System.out.println("List of the Possible Implementation Plans:");
        for (ImplementationPlan implementationPlan : implementationPlans) {
            System.out.println(implementationPlan.getName() + ": " + implementationPlan.getDescription());
        }
    }
}
