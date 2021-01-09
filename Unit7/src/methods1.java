import java.util.Arrays;

public class methods1 {
    public static void pretty(String s) {
        System.out.println("\n----" + s + "----\n");
    }
    static void helloWorldVoid() { System.out.println("Hello World"); }
    static void myNameVoid() { System.out.println("Carter"); }
    static void randomNumberVoid() { System.out.println( (int) (Math.random() * 100)); }
    static void sayHelloVoid(String name) { System.out.println("Hello " + name + "!"); }
    static void randomNumberVoid(int l) { System.out.println((int) (Math.random() * l) ); }
    static void maxNumVoid(int a, int b, int c) { System.out.println(Math.max(Math.max(a, b), c)); }
    static void maxNumVoid(int[] a) {
        int num = a[0];
        for (int b : a) { if (b > num) { num = b; } }
        System.out.println(num);
    }
    static void printArray(String[] s) { for (String a : s) { System.out.print(a + " "); } System.out.println(); }
    static void printArray(int[] b) { for (int a : b) { System.out.print(a + " "); } System.out.println(); }
    static void longestWord(String[] a) {
        String longest = "";
        for (String b : a) { if (b.length() > longest.length()) { longest = b; } }
        System.out.println(longest);
    }
    static String myName() { return "Carter"; }
    static int randomNumber() { return (int) (Math.random() * 100); }
    static int randomNumber(int l) { return (int) (Math.random() * l); }
    static int maxNum(int a, int b, int c) { return Math.max(Math.max(a, b), c); }
    static int maxNum(int[] a) {
        int num = a[0];
        for (int b : a) { if (b > num) { num = b; } }
        return num;
    }
    static int[] sortArray(int[] arr) {
        int min, temp;
        for (int index = 0; index < arr.length - 1; index++){
            min = index;
            for (int scan = index +1; scan < arr.length; scan++){
                if(arr[scan] < arr[min]){
                    min = scan;
                }
            }
            temp = arr[min];
            arr[min] = arr[index];
            arr[index] = temp;

        }
        return arr;
    }
    static String[] sortArray(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        // In the main method:
        //	- Create a String array with at least 5 words of different length
        // 	- Create an integer array with at least 10 different numbers
        // 	- Test all of your methods here

        String[] a = {"panda", "cow", "chicken", "slime", "steven"};
        int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Part 1: Void Methods (without params)
        // helloWorldVoid()
        // Create a method that will print “Hello World”

        pretty("Hello World");

        helloWorldVoid();

        // myNameVoid()
        // Create a method that will print our your name

        pretty("My Name");

        myNameVoid();

        // randomNumberVoid()
        // Create a method that will print a random number from 0 - 100

        pretty("Random Number");

        randomNumberVoid();

        // Part 2: Void Methods (with params)
        // sayHelloVoid(param s)
        // Create a method that will ‘Say Hello’ to argument s
        // Eg: sayHelloVoid(“James”) => “Hello James!”

        pretty("Say Hello");

        sayHelloVoid("James");

        // randomNumberVoid(param limit)
        // Create an overloaded method that will print a random integer from 0
        // to the upper limit passed as an argument

        pretty("Random Number Param");

        randomNumberVoid(50);

        // maxNumVoid(params: a, b, c)
        // Create a method that will print the largest number of the three
        // integers passed as arguments

        pretty("Max Number Void");

        maxNumVoid(1, 3, 4);

        // printArray(param arr)
        // Create a method that prints a String array passed as an argument

        pretty("Print Array");

        printArray(a);

        // printArray(param arr)
        // Create an overloaded method that prints an integer array passed as
        // an argument

        pretty("Print Array");

        printArray(b);

        // longestWord(param arr)
        // Create a method that prints the longest word in a String array
        // passed as an argument

        pretty("Longest Word");

        longestWord(a);

        // maxNumVoid(param arr)
        // Create an overloaded method that prints the largest number in an
        // integer array passed as an argument

        pretty("Max Num Void");

        maxNumVoid(b);

        // Part 3: Return methods
        // myName()
        // Create a method that returns your name as a String

        pretty("Return Name");

        System.out.println(myName());

        // randomNumber()
        // Create a method that returns a random integer from 0 - 100

        pretty("Random Number");

        System.out.println(randomNumber());

        // randomNumber(param limit)
        // Create an overloaded method that returns a random integer from 0
        // to the upper limit passed as an argument

        System.out.println(randomNumber(50));

        // maxNum(params: a, b, c)
        // Create a method that will return the largest number of the three
        // integers passed as arguments

        pretty("Max Num");

        System.out.println(maxNum(3, 4, 5));

        // maxNum(param arr)
        // Create a method that will return the largest number of an integer
        // array passed as an argument

        System.out.println(maxNum(b));

        // sortArray(param arr)
        // Create a method that will return a sorted String array passed as an
        // argument

        pretty("Sort Array");

        System.out.println(Arrays.toString(sortArray(a)));

        // sortArray(param arr)
        // Create a method that will return a sorted integer array passed as
        // an argument

        System.out.println(Arrays.toString(sortArray(b)));
    }
}
