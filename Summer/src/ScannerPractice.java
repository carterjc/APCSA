import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = myScan.nextLine();

        System.out.println("Your name is: " + name);

        System.out.println("What is your age?");
        int age = Integer.parseInt(myScan.nextLine());
        System.out.println("Your age is: " + age);

        myScan.close();
    }
}
