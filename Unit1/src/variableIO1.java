import java.util.Scanner;

public class variableIO1 {
    public static void main(String[] args) {
        /* Create a scanner object kboard */
        Scanner kboard = new Scanner(System.in);

        /* Write (two) statements that will prompt a user
        to enter their first name & last name and store as variables */

        System.out.println("What is your first name?");
        String fname = kboard.next();
        System.out.println("What is your last name?");
        String lname = kboard.next();

        /* Write (two) statements that will prompt a user to enter their age, and GPA and store as variables */

        System.out.println("What is your age?");
        int age = kboard.nextInt();
        System.out.println("What is your grade? (100 point grading scale)");
        double grade = kboard.nextDouble();

        /* Write (four) messages using all of the variables created */

        System.out.println("Hello, " + fname + " " + lname + "! You are " + age + " years old and have a GPA of " + grade + "!");

        /* Write an if statement, with a messages providing positive feedback for a good GPA,
        encouragement for a low GPA, and a nice message regardless of GPA */

        if (grade >= 80) {
            System.out.println("Nice Job!");
        }
        else {
            System.out.println("You got this! Study harder!");
        }

        System.out.println("Great work!");

        /* Close the scanner object */
        kboard.close();
    }
}
