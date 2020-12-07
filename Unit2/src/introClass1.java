import java.util.Arrays;
import java.util.Scanner;

public class introClass1 {
    public static void main(String[] args) {
        // Part 1:
        // Create a scanner object
        Scanner scan = new Scanner(System.in);

        // Write prompts to the user that will allow them to purchase
        // items from “Dollar Plus”, where all items are $1. The user must
        // purchase five items, with a quantity that is of their discretion

        System.out.println("Welcome to Dollar Plus! Everything here is 1$ so take your pick!");

        // Eg: paper towels x4, plate x10, soap x1, cups x15, forks x20

        // Create variables to store the user data

        // Print back each item in an itemized list, and a total cost

        String[] items = new String[5];
        Integer[] quant = new Integer[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter your item: ");
            items[i] = scan.next();
            System.out.print("Please enter the quantity: ");
            quant[i] = scan.nextInt();
        }

        // Part 2:
        // Perform this pseudo transaction with only three print statements. A
        // message to the user, and the itemized list with total cost
        double total = 0;
        for (int q : quant) {
            total += q;
        }
        System.out.println("Alright, you ordered the following: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(items[i] + " - " + quant[i]);
        }
        System.out.println("Your total is " + total + "$. Thank you for shopping!");
    }
}
