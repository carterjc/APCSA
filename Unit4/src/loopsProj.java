import java.util.Random;
import java.util.Scanner;

public class loopsProj {
    public static char[] generateCode(int l) {
        String charSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$";
        char[] code = new char[l];
        Random random = new Random();

        // Guarantees all parts, done in stupid way
        code[0] = charSet.charAt(random.nextInt(charSet.substring(0, 26).length()));
        code[1] = charSet.charAt(random.nextInt(charSet.substring(26, 52).length()) + 26);
        code[2] = charSet.charAt(random.nextInt(charSet.substring(52, 62).length()) + 52);
        code[3] = charSet.charAt(random.nextInt(charSet.substring(62).length()) + 62);

        for (int i = 4; i < l; i++) {
            code[i] = charSet.charAt(random.nextInt(charSet.length()));
        }
        return code;
    }
    public static void main(String[] args) {
        int length = 10;
        String code = new String(generateCode(length));

        boolean run = true;
        Scanner s = new Scanner(System.in);
        String guess;
        int attempts = 0;

        while (run) {
            System.out.print("Guess the password or say 'quit': ");
            guess = s.next();

            // If correct, the vault is cracked
            if (guess.equals(code)) {
                run = false;
                System.out.println("Congratulations, you cracked the vault!");
                continue;
            }
            else if (guess.equals("quit")) {
                run = false;
                System.out.println("Well, I guess you tried.");
                continue;
            }
            else if (attempts >= 10) {
                length++;
                code = new String(generateCode(length));
                System.out.println("You have attempted 10 times! Now the code has changed and increase in length!");
                attempts = 0;
            }
            else if (guess.equals("123456") || guess.equals("qwerty") || guess.equals("password") || guess.equals("abc123") || guess.equals("password1")) {
                length++;
                code = new String(generateCode(length));
                System.out.println("HOW DARE YOU! Our vault is better than these dirty, common passwords.");
                System.out.println("You have attempted 10 times! Now the code has changed and increase in length!");
                attempts = 0;
            }
            else {
                System.out.println("Incorrect!");
            }
            attempts++;
        }
        s.close();
    }
}
