//Task 1: Write two void methods in the class : one to print , "Hello World"; and another one to print your name. Then call both these methods to display the output. Submit the link to the repl.
//Task 2: write two void methods with arguments: one to display the sum of two numbers; and another to display the given string.

public class Methods {
    public static void main(String[] args) {
        // Part 1
        helloWorld();
        myName();

        // Part 2
        sumNum(5, 9);
        displayString("Panda bears");
    }

    public static void helloWorld() {
        System.out.println("Hello World");
    }

    public static void myName() {
        System.out.println("Carter Costic");
    }

    public static void sumNum(int int1, int int2) {
        System.out.println(int1 + int2);
    }

    public static void displayString(String str) {
        System.out.println(str);
    }

}
