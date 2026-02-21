import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declare variables
        int age = 0;
        String trash = "";

        System.out.print("Enter your age: ");

        // Check for valid integer input
        if (in.hasNextInt()) {

            age = in.nextInt();
            in.nextLine();

            // Check age requirement
            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }

        } else {

            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }

        in.close();
    }
}