package Entity;
import java.util.Scanner;
public class ConfirmationWindow {  
    public static boolean show(String message) {
        System.out.println(message);
        System.out.println("Enter Yes to confirm, No to cancel");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();      
        if (input.equalsIgnoreCase("Yes")) {
            return true;
        } else if (input.equalsIgnoreCase("No")) {
            return false;
        } else {
            System.out.println("Try again.");
            return show(message);
        }
    }
    
}
