package Entity;
import java.util.Scanner;
public class AddRequestMenuWindow {
    private Scanner scanner;
    
    public AddRequestMenuWindow() {
        scanner = new Scanner(System.in);
    } 
    public void show() {
        System.out.println("Menu");
        System.out.println("--------------");
        System.out.println("1. Add a Feedback Request");
        System.out.println("2. Go Back");
        
        int choice = getChoice();       
        switch (choice) {
            case 1:
                addRequest();
                break;
            case 2:
                return;
            default:
                System.out.println("You entered an invalid option. Please use one of the possible options.");
                show();
                break;
        }
    }
    private int getChoice() 
    {
        System.out.print("Please enter your choice: ");
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("You entered an invalid option. Please use one of the possible options.");
            return getChoice();
        }
    }   
    private void addRequest() {
        System.out.println("Add a Feedback Request");
        System.out.println("----------------");
    }
}
