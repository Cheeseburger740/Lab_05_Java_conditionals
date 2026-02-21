import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Declare variables
        String choice = "";
        // Display menu
        System.out.println("Political Party Menu");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");

        choice = in.nextLine();

        // Cascaded if structure
        if (choice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (choice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        }
        else if (choice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        }
        else {
            System.out.println("Other affiliation selected.");
        }
        in.close();
    }
}