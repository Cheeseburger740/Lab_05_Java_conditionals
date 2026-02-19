import java.util.Scanner;
public class ShippingCostCalculator {
    //variables
    double price = 0;
    double shipping = 0;
    double total = 0;
    String trash = "";
    Scanner in = new Scanner(System.in);
    System.out.print("enter the price of the item: ");
    if (in.hasNextDouble())
    {
        price = in.nextDouble();
        in.nextLine();
        if (price >= 100) {
            shipping = 0;
        } else {
            shipping = price * 0.02;
        }
        total = price + shipping;
        System;
        system.out.printf("Shipping Cost: $%.2f\n", shipping);
        System.out.printf("Total Price: $%.2f\n", total);
    } else {
        trash = in.nextLine();
        System.out.println("Invalid input: " + trash);
        System.out.println("Run the program again and enter a valid number.");
    }
        in.close();
    }
}
