import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {
        // Construct a while loop that counts to 50, printing every number
        // May or may not include 0, but must include 50

        int i = 0;
        while (i <= 50) {
            System.out.println(i);
            i++;
        }
        // Construct a while loop that counts to 100, only printing multiples
        // of 5 (may or may not include 0)

        i = 0;
        while (i <= 100) {
            System.out.println(i);
            i += 5;
        }

        // Construct a while loop that prompts a user to guess a number from
        // 1-5, terminating when guess is correct

        boolean guess = false;
        int rand = (int) (Math.random() * 4) + 1;
        Scanner s = new Scanner(System.in);

        while (!guess) {
            System.out.print("Pick a number 1-5!");
            int p = s.nextInt();
            if (p == rand) { guess = true; System.out.println("You got it!"); }
        }
    }
}
