import java.util.Scanner;

public class arrayProj {
    public static void prettyPrint(String s) {
        System.out.println("\n\n----" + s + "----\n\n");
    }
    public static boolean doesContain(String p, char t) {
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == t) { return true; }
        }
        return false;
    }
    public static boolean isSame(String p, char[] g) {
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) != g[i]) { return false; }
        }
        return true;
    }
    public static char[] makeGuessArray(String p) {
        char[] g = new char[p.length()];
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == ' ') { g[i] = ' '; }
            else if (p.charAt(i) == '\'') { g[i] = '\''; }
            else { g[i] = '_'; }
        }
        return g;
    }
    public static void solve(String phrase, String cat, int points) {
        prettyPrint("Solve");
        System.out.println("Your category is " + cat + "!");
        System.out.println(makeGuessArray(phrase));
        Scanner s = new Scanner(System.in);
        String guess = s.nextLine();
        if (guess.equals(phrase)) {
            System.out.println("You received " + points + " points!");
            if (points != 600) { System.out.println("\nOn to the next level!"); }
        }
        else {
            System.out.println("Nope that isn't it. Better luck next time!");
            System.exit(0);
        }
    }
    public static void spin(String phrase, String cat, int points) {
        prettyPrint("Spin");
        System.out.println("Your category is " + cat + "!");
        char[] guess = makeGuessArray(phrase);
        Scanner s = new Scanner(System.in);
        boolean solved = false;
        while (!solved) {
            System.out.println(guess);
            prettyPrint("Guess");
            System.out.print("Enter your character guess:");
            char g = s.next().charAt(0);
            if (doesContain(phrase, g)) {
                for (int i = 0; i < phrase.length(); i++) {
                    if (Character.toLowerCase(phrase.charAt(i)) == g) {
                        guess[i] = phrase.charAt(i);
                    }
                    if (phrase.charAt(i) == ' ') { guess[i] = ' '; }
                }
                if (isSame(phrase, guess)) {
                    prettyPrint("Completed");
                    System.out.println("Woah you got " + points + " points!");
                    if (points != 600) { System.out.println("\nOn to the next level!"); }
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        // Scanner moment
        Scanner s = new Scanner(System.in);
        // Main method
        System.out.println("Welcome to Wheel of Fortune!");
        boolean run = true;
        String[] phrases = {"another one bites the dust", "roosevelt's new deal", "i'll be back"};
        String[] cats = {"The 80s", "Proper Name", "Movie Quotes"};
        int[] points = {200, 400, 600};
        int level = 0;

        // Loop go brrrr
        while (run) {
            prettyPrint("Let's Begin");
            if (level <= 2) { System.out.println("You are on level " + (level + 1)); }
            else { System.out.println("You won! Congratulations!"); System.exit(0); }
            System.out.print("Choose an option:\n0. Quit\n1. Spin\n2. Solve");
            int choice = s.nextInt();
            if (choice == 0) { System.out.println("See you later!"); break; }
            else if (choice == 1) { spin(phrases[level], cats[level], points[level]); }
            else { solve(phrases[level], cats[level], points[level]); }
            level++;
        }

        s.close();
    }
}
