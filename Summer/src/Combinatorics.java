import java.util.Scanner;

public class Combinatorics {
    public static void main(String[] args) {
        // Initializes scanner object
        Scanner myObj = new Scanner(System.in);

        // Creates prompts
        System.out.println("What integer value do you want for n?");
        int n = myObj.nextInt();

        System.out.println("What integer value do you want for r?");
        int r = myObj.nextInt();

        // Calls combination method
        numCombinations(n, r);
    }

    public static int factorial(int n) {
        // Case 1, n = 1
        if (n == 1) { return 1; }

        // Case 2, n != 1
        else { return n * factorial(n - 1); }
    }

    public static void numCombinations(int n, int r) {
        // Declares factorial variable
        int factorial;

        // If r > n, factorial is 0
        if (r > n) {
            factorial = 0;
        }
        // If n > r, use formula
        else {
            factorial = factorial(n)/(factorial(r)*factorial(n-r));
        }

        // Print out combinations in proper format
        System.out.println("There are " + factorial + " ways of choosing " + r + " items from " + n + " choices.");
    }
}
