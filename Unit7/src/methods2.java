public class methods2 {
    public static void pretty(String s) {
        System.out.println("\n----" + s + "----\n");
    }
    public static String reverseString(String s) {
        StringBuilder output = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            output.append(s.charAt(i));
        }
        return output.toString();
    }
    public static void findTarget(String[] s, String target) {
        boolean found = false;
        for (String a : s) {
            if (a.equals(target)) {
                System.out.println("True");
                found = true;
                break;
            }
        }
        if (!found) { System.out.println("False"); }
    }
    public static void findTarget(int[] s, int target) {
        boolean found = false;
        for (int a : s) {
            if (a == target) {
                System.out.println("True");
                found = true;
                break;
            }
        }
        if (!found) { System.out.println("False"); }
    }
    public static void tipCalc(double bill, int diners, double tipPercent) {
        double tip = bill * tipPercent/100;
        System.out.print("All " + diners + " diners should pay ");
        System.out.printf("Value: %.2f", tip);
        System.out.println("$ as tip!");


    }
    public static void countWords(String s) {
        if (s.length() == 0) { System.out.println("Error!"); }
        else {
            int words = s.split(" ").length;
            System.out.println("There are " + words + " words");
        }
    }
    public static void nameGame(String s) {
        System.out.println(s + ' ' + s + ", bo-B" + s.substring(1));
        System.out.println("Banana-fana fo-F" + s.substring(1));
        System.out.println("Fee-fi-mo-M" + s.substring(1));
        System.out.println(s.toUpperCase() + "!");
    }
    public static void main(String[] args) {
        // Part 1: Refactoring
        // Refactor the following blocks of code from previous assignments
        // to be called by a method

        // reverseString(param s)
        // Write code that will reverse a given string => "Hello” will return
        // “olleH”

        pretty("Reverse String");

        System.out.println(reverseString("Hello"));

        // findTarget(params: target, arr)
        // Write code that will iterate through an array passed as an argument
        // and return true or false based on results when searching for target
        // HINT: Use a linear search
        // This method must be overloaded to handle integers and strings
        // This method will not work with a GUI

        pretty("Find Target");

        findTarget(new String[]{"a", "b", "c"}, "a");
        findTarget(new int[]{1, 2, 3, 4}, 1);

        // Part 2: Practical Methods
        // tipCalc(params: bill, diners, tipPercent)
        // Create a method that will resemble a tip calculator
        // This method will return/print the amount owed per diner, based on
        // its arguments
        // This method may be void or integer/double type

        pretty("Tip Calculator");

        tipCalc(80.57, 4, 20);

        // countWords(param s)
        // Create a method to count all words in a string
        // Eg: String s = “The quick brown fox jumps over the lazy dog”
        // countWords(s) => 9
        // This method may be void or integer type

        pretty("Count Words");

        countWords("The quick brown fox jumps over the lazy dog");

        // nameGame(param name)
        // Write a method where the argument name is used in “Name Game” that
        // will sing the “Name Game” song in the format below
        // Eg: nameGame(“John”) =>
        // > John John, bo-Bohn
        // > Banana-fana fo-Fohn
        // > Fee-fi-mo-Mohn
        // > JOHN!
        // This method may be void or String type

        pretty("Name Game");

        nameGame("John");
    }
}
