import java.util.Random;

public class introClass2 {
    public static void pretty(String s) {
        System.out.print("\n\n----" + s + "----\n\n");
    }

    public static void main(String[] args) {
        // Create (2) variables of type int and double

        int var1 = 5;
        double var2 = 6.7;

        // Create an expression that squares each variable

        pretty("Square");

        System.out.println(Math.pow(var1, 2));
        System.out.println(Math.pow(var2, 2));


        // Create an expression that finds the square root of each variable

        pretty("Square Root");

        System.out.println(Math.sqrt(var1));
        System.out.println(Math.sqrt(var2));

        // Create an expression that finds the absolute value of the
        // difference between your variables

        pretty("Absolute");

        System.out.println(Math.abs(var1 - var2));

        // Create an expression that prints out a random number from 10-35

        pretty("Random");

        Random rand = new Random();

        System.out.println(rand.nextInt(25) + 10);

        // Research (3) new methods in the Java Documentation (link)
        // Create custom expressions for the methods you find

        pretty("New Methods");

        System.out.println("The hypotenuse of a triangle with legs of 5 and 12 is: " + Math.hypot(5, 12));
        System.out.println("The value of 1 radian in degrees is: " + Math.toDegrees(1));
        System.out.println("The natural log of 2 is: " + Math.log(2));
    }
}
