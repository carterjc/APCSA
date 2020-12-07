import java.util.Random;
import java.util.Scanner;

public class array1 {

    // Create a method to print any integer array

    // *BONUS overload this method to print a string array also
    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.println(s + " ");
        }
    }
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
    public static void pretty(String s) {
        System.out.println("\n\n----" + s + "----\n\n");
    }
    public static void main(String[] args) {
        // Part 1
        // Create an integer array ‘numArray’ containing five integers

        int[] numArray = {1, 2, 3, 4, 5};

        // Print the array using a standard for loop

        pretty("Standard");

        for (int i = 0; i < numArray.length; i++) { System.out.println(numArray[i]); }

        // Print the array using an enhanced for loop

        pretty("Enhanced");

        for (int num : numArray) { System.out.println(num); }

        // Then print only the odd numbered indices

        pretty("Odd");

        for (int i = 0; i < numArray.length; i++) {
            if (i % 2 == 1) { System.out.print(numArray[i] + " "); }
        }

        // Create an integer array ‘numArray2’ of length 10, containing no
        // values

        int[] numArray2 = new int[10];

        // Using a for loop add 10 random numbers to the arrays

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            numArray2[i] = r.nextInt(100);
        }

        // Print the array

        pretty("Random");

        printArray(numArray2);

        // Print the average of the numbers in ‘numArray2’

        pretty("Average");

        double avg = 0;
        for (int a : numArray2) {
            avg += a;
        }
        avg = avg/numArray2.length;
        System.out.println(avg);

        // Part 2: Hogwarts Sorting Hat

        // Create a String array ‘hogwartsArray’ with the four hogwarts houses
        // in it (Gryffindor, Hufflepuff, Ravenclaw, Slytherin)

        pretty("Hogwarts");

        String[] hogwartsArray = {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};

        // Ask a user to input a name

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.next();

        // Randomly select which house they have been chosen into.

        String house = hogwartsArray[r.nextInt(hogwartsArray.length)];

        // Print to the user:

        // <Name of User> you have been selected to <House chosen>!


        System.out.println(name + " you have been selected to " + house + "!");
    }
}
