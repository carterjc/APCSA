import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        // Create a for loop that counts from 0 to 10 ascending, printing each
        // number

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Create a for loop that counts from 10 to 0 descending, printing
        // each number

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // Create a for loop that counts from 0 to 100, only printing
        // multiples of 10

        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) { System.out.println(i); }
        }

        // Create a for loop that prints 10 random integers

        for (int i = 0; i < 10; i++) {
            System.out.println((Math.random() * 9) + 1);
        }

        // Create a for loop that prints 20 lines of ascending asterisks (*)
        // starting with one

        for (int i = 1; i < 21; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // *
        // **
        // ***
        // etc..

        // Create a for loop that prints <a-number-from-user-input> to 100
        // ascending

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number under 100");
        int x = s.nextInt();
        for (int i = x; i <= 100; i++) { System.out.println(i); }

        // Create a for loop that prints a user's name ‘x’ times. The name and
        // number of times we will print shall come from user input

        System.out.println("Please enter your name");
        String name = s.next();
        System.out.println("Please enter the number of times you want your name printed");
        int times = s.nextInt();

        for (int i = 0; i < times; i++) { System.out.print(name); }

        /* BONUS

        Create a for loop that prints the following output:
        (HINT: use nested for loops)

        1******
        12*****
        123****
        1234***
        12345**
        123456*
        1234567

        */
        System.out.println();
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 0; k < 7-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
