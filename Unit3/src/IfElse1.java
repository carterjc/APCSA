import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        // Create three integer variables ‘num1’, ‘num2’, & ‘num3’
        // Set these variables to user inputs

        // num1
        System.out.println("Enter a value for the number 1");
        int num1 = myScan.nextInt();
        // num2
        System.out.println("Enter a value for the number 2");
        int num2 = myScan.nextInt();
        // num3
        System.out.println("Enter a value for the number 3");
        int num3 = myScan.nextInt();

        // Write a statement for each variable, checking if it is equal to 5
        // and print the results

        System.out.println(num1 == 5);
        System.out.println(num2 == 5);
        System.out.println(num3 == 5);

        // Write a statement that will reach an else block

        if (false) {
            System.out.println("How?");
        }
        else {
            System.out.println("Ah nice");
        }

        // Write a series of statements that will print the largest number of
        // three given numbers (variables or user input)

        // this can be written more concisely but i used a series of statements
        if (Math.max(num1, num2) == num1 && Math.max(num1, num3) == num1) { System.out.println(num1 + " is the max!"); }
        else if (Math.max(num2, num1) == num2 && Math.max(num2, num3) == num2) { System.out.println(num2 + " is the max!"); }
        else { System.out.println(num3 + " is the max!"); }


        // Write a series of statements that will print the smallest number of
        // three given numbers (variables or user input)

        if (Math.min(num1, num2) == num1 && Math.min(num1, num3) == num1) { System.out.println(num1 + " is the min!"); }
        else if (Math.min(num2, num1) == num2 && Math.min(num2, num3) == num2) { System.out.println(num2 + " is the min!"); }
        else { System.out.println(num3 + " is the min!"); }

        // Write a series of statements that will check if user input numbers
        // are in ascending order

        if (num1 < num2 && num2 < num3) {
            System.out.println("The variables are in ascending order!");
        }
        else {
            System.out.println("The variables are not in ascending order!");
        }

        // Write a series of statements that will print user input numbers in
        // ascending order
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        // smallest num
        System.out.println(min);
        // medium num
        if (num1 != max && num1 != min) { System.out.println(num1); }
        else if (num2 != max && num2 != min) { System.out.println(num2); }
        else { System.out.println(num3); }
        // largest num
        System.out.println(max);

        /* BONUS

        Create a game, where the user has 5 guesses to guess a number
        This game can only use inputs, and ONLY if/else if/else statements
        Provide the user with context of the game using print statements

        */

        int guesses = 5;
        int number = (int) (Math.random() * 20) + 1;
        System.out.println("This is a game. Guess the number correctly (1 - 20). You have 5 guesses or you lose.");
        // i want to use a loop
        for (int i = 1; i <= guesses; i++) {
            System.out.println("What is your guess?");
            int guess = myScan.nextInt();
            if (guess == number) {
                System.out.println("You got it! The number was " + number + "!");
                break;
            }
            else {
                System.out.println("You did not get it!");
            }
        }
        System.out.println("You failed but the number was " + number + "!");
    }
}

