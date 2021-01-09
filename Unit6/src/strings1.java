import java.util.HashMap;
import java.util.Map;

public class strings1 {
    public static void pretty(String s) {
        System.out.println("\n----" + s + "----\n");
    }
    public static void endsWithAsterik(String s) {
        if (s.length() == 0) {
            System.out.println("False");
        }
        else if (s.charAt(s.length() - 1) == '*') {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    public static void formatBday(String s) {
        if (s.length() != 8) {
            System.out.println("Error!");
        }
        else {
            System.out.println(s.substring(0, 2) + "/" + s.substring(2, 4) + "/" + s.substring(4));
        }
    }
    public static void unFormatBday(String s) {
        if (s.charAt(2) == '-' && s.charAt(5) == '-' && s.length() == 10) {
            System.out.println(s.substring(0, 2) + s.substring(3, 5) + s.substring(6));
        }
        else { System.out.println("Error!"); }
    }
    public static void ccNumber(String s) {
        if (s.length() == 16) {
            System.out.println(s.substring(0, 4) + " " + s.substring(4, 8) + " " + s.substring(8, 12) + " " + s.substring(12));
        }
        else { System.out.println("Error!"); }
    }
    public static void whatIndex(String s, String target) {
        boolean found = false;
        int i = 0;
        while (i + target.length() < s.length()) {
            if (s.substring(i, i + target.length()).equals(target)) {
                System.out.println("Target found at index " + i +  "!");
                found = true;
            }
            i++;
        }
        if (!found) { System.out.println("Not found1"); }
    }
    public static void frontToBack(String s) {
        if (s.length() < 2) { System.out.println("Please provide a longer string!"); }
        else { System.out.println(s.substring(1) + s.charAt(0)); }
    }
    public static void jollyLikes(String s) {
        if (s.toLowerCase().equals("moon")) { System.out.println("True"); }
        else { System.out.println("False"); }
    }
    public static void noDoubles(String s) {
        char[] chars = s.toCharArray();
        String output = s;
        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            if (map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            }
            else {
                map.put(c, 1);
            }
        }
        for (char c : map.keySet()) {
            if (map.get(c) > 1) { output = output.replaceAll(String.valueOf(c), "-"); }
        }
        System.out.println(output);
    }
    public static void alphabetizeIt(String[] s) {
        for (int i = 0; i < s.length; i++)  {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].compareTo(s[j])>0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        for (String a : s) { System.out.print(a + " "); }
        System.out.println();
    }
    public static void reverseString(String s) {
        StringBuilder output = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            output.append(s.charAt(i));
        }
        System.out.println(output);
    }
    public static void isPalindrome(String s) {
        boolean p = true;
        s = s.replaceAll("[^a-zA-Z]+", "").toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                p = false;
                break;
            }
        }
        System.out.println(p);
    }
    public static void main(String[] args) {
        // endsWithAsterisk
        // Write code that will print true if a given string is not empty and
        // ends with an asterisk, or false otherwise

        pretty("Ends with Asterik");

        endsWithAsterik("YEs*");
        endsWithAsterik("No");

        // formatBday
        // Write code that will take a birthday String in the format
        // "MMDDYYYY" and print in the format "MM/DD/YYYY"
        // This code must also check if the input is valid:
        // "MMDDYY" and "MMDDYYYY?" should print an error

        pretty("Format Birthday");

        formatBday("03052004");
        formatBday("030504");

        // unFormatBday
        // Write code that will take a birthday String in the format
        // "MM-DD-YYYY" and print in the format "MMDDYYYY"
        // This code must also check if the input is valid:
        // "MM/DD/YYYY" should print an error

        pretty("Unformat Birthday");

        unFormatBday("03-05-2004");
        unFormatBday("03/05/2004");

        // ccNumber
        // Write code that will take in a Credit Card Number
        // "1111222233334444" and add spaces after every fourth digit, except
        // for the last => "1111 2222 3333 4444"

        pretty("Credit Card Numbers");

        ccNumber("1111222233334444");
        ccNumber("11112222333344444");

        // whatIndex
        // Write code that will print the index of a given letter/series of
        // letters. If the letter is not found, an error message will print =>
        // “My String”, “S” will print 3

        pretty("What Index?");

        whatIndex("My String", "S");
        whatIndex("Pineapple pizza is disgusting!", "app");

        // frontToBack
        // Write code that will take the first character of a String and place
        // it at the end => "MyString" will print "yStringM"

        pretty("Front to Back");

        frontToBack("MyString");

        // jollyLikes
        // Write code that will print true if Jolly likes a word, and false
        // otherwise => "Moon" will print true, "Stars" will print false
        // This code should handle all cases of inputs => "Moon" and "mOoN"
        // should both print true

        pretty("Jolly Likes");

        jollyLikes("Moon");
        jollyLikes("mOoN");
        jollyLikes("Stars");


        // noDoubles
        // Write code that will replace any String that contains double
        // letters with dashes “-” => "Loops" will print "L--ps"
        // If a string does not contain doubles, it will remain unchanged
        // BONUS: Handle multiple instances of doubles => "Doorbell" will
        // print "D--rbe--"
        // *You may use methods not in Strings slides for the BONUS only*

        pretty("No Doubles");

        noDoubles("Loops");
        noDoubles("Doorbell");

        // alphabetizeIt
        // Write code that will take an array of Strings, and alphabetize the
        // elements

        pretty("Alphabetize It");

        String[] str = {"d", "b", "a", "c"};
        alphabetizeIt(str);

        // reverseString
        // Write code that will reverse a given string => "Hello” will print
        // “olleH”

        pretty("Reverse String");

        reverseString("Hello");

        // BONUS
        // isPalindrome
        // Write code that will check if a String is a palindrome, printing
        // true or false
        // This code should handle spaces, and special characters
        // Hint use .replaceAll()

        pretty("Palindrome");

        isPalindrome("Red rum, sir, is murder");
    }
}
