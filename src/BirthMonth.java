import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declare variables
        int month = 0;
        String trash = "";

        System.out.print("Enter your birth month (1-12): ");

        // Check for valid integer input
        if (in.hasNextInt()) {

            month = in.nextInt();
            in.nextLine();

            // Check if month is in valid range
            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }

        } else {
            trash = in.nextLine();
            System.out.println("You entered an incorrect month value: " + trash);
        }
        in.close();
    }
}
