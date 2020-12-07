import java.util.Arrays;

public class array2 {
    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.println(s + " ");
        }
    }
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
    public static void pretty(String s) {
        System.out.println("\n\n----" + s + "----\n\n");
    }
    public static void main(String[] args) {
        // Part 1
        // Create two String arrays strArray & strArray2 of length 10, using a
        // themes of your choice. Enter two elements with the same values in
        // each array

        String[] strArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] strArray2 = {"9", "10", "11", "12", "13", "14", "15", "16", "17", "18"};


        // Create a String variable target
        // Write code that will iterate through both arrays (individually or
        // together) and print “Found” or “Not Found” based on results when
        // searching for target

        pretty("Search");

        String target = "9";
        boolean found = false;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(target) || strArray2[i].equals(target)) {
                System.out.println("Found");
                found = true;
            }
        }
        if (!found) { System.out.println("Not Found"); }


        // Write code that will compare strArray and strArray2 and print
        // “Common Elements!” or “No Common Elements” based on results. Print the indices of common elements

        pretty("Common Elements");

        // I know I could have used standard loops, but wanted to try another way
        for (String s : strArray) {
            for (String t : strArray2) {
                if (s.equals(t)) {
                    System.out.println("Common Elements at:\nArray1: " + Arrays.asList(strArray).indexOf(s) + "\nArray2: " + Arrays.asList(strArray2).indexOf(t));
                }
            }
        }

        // Write code that will remove a target from strArray without
        // decreasing array size

        pretty("Remove Target");

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(target)) {
                strArray[i] = "Removed";
            }
        }
        printArray(strArray);

        // [Put the removed item back] and write code that will reverse
        // strArray

        pretty("Reverse Array");

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("Removed")) {
                strArray[i] = target;
            }
        }

        // Reverses
        for (int i = 0; i < strArray.length / 2; i++)
        {
            String temp = strArray[i];
            strArray[i] = strArray[strArray.length - i - 1];
            strArray[strArray.length - i - 1] = temp;
        }

        printArray(strArray);


        // Write code that will copy(duplicate) strArray2 to dupStrArray2

        pretty("Duplicate Array");

        String[] dupStrArray2 = strArray2;
        printArray(dupStrArray2);

        // Part 2
        // Create an int array intArray of length 10, with numbers ascending
        // from the start number of your choice AND an int array intArray2
        // with numbers of your choice. Enter at least two values that are in
        // intArray

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] intArray2 = {9, 10, 11, 12, 13, 14, 15, 16, 17, 18};


        // Create an int variable iTarget
        // Write code that will iterate through both arrays (individually or
        // together) and print “Found” or “Not Found” based on results when
        // searching for iTarget

        pretty("Found");

        int iTarget = 9;
        found = false;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == iTarget || intArray2[i] == iTarget) { System.out.println("Found"); found = true; }
        }
        if (!found) { System.out.println("Not Found"); }


        // Write code that will compare intArray and intArray2 and print
        // “Common Elements!” or “No Common Elements” based on results. Print the indices of common elements

        pretty("Common Elements");

        found = false;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray2.length; j++) {
                if (intArray[i] == intArray2[j]) {
                    System.out.println("Common Elements:\nArray1: " + i + "\nArray2: " + j);
                    found = true;
                }
            }
        }
        if (!found) { System.out.println("No Common Elements"); }


        // Write code that will reverse intArray and intArray2 (separately)

        pretty("Reverse 1");

        for (int i = 0; i < intArray.length/2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - i - 1];
            intArray[intArray.length - i - 1] = temp;
        }
        printArray(intArray);

        pretty("Reverse 2");

        for (int i = 0; i < intArray2.length/2; i++) {
            int temp = intArray2[i];
            intArray2[i] = intArray2[intArray2.length - i - 1];
            intArray2[intArray2.length - i - 1] = temp;
        }
        printArray(intArray2);

        // Write code that will duplicate intArray2 [dupIntArray2]

        pretty("Duplicate");

        int[] dupIntArray2 = intArray2;
        printArray(dupIntArray2);


        // Write code that will locate the index of the smallest element in
        // intArray2. Print the smallest index, and its elements value

        pretty("Array2");
        printArray(intArray2);
        pretty("Smallest Value");

        int smallest = intArray2[0];
        int index = 0;
        for (int i = 0; i < intArray2.length; i++) {
            if (intArray2[i] < smallest) {
                smallest = intArray2[i];
                index = i;
            }
        }
        System.out.println("The smallest value is " + smallest + " at index " + index);


        // Write code that will locate the second smallest element in
        // intArray2. Print the index, and its elements value

        pretty("Second Smallest");

        smallest = intArray2[0];
        index = 0;
        int smallest2 = intArray2[0];
        int index2 = 0;
        for (int i = 0; i < intArray2.length; i++) {
            if (intArray2[i] < smallest) {
                smallest2 = smallest;
                smallest = intArray2[i];
                index2 = index;
                index = i;
            }
            else if (intArray2[i] < smallest2) {
                smallest2 = intArray2[i];
                index2 = i;
            }
        }
        System.out.println("The smallest value is " + smallest2 + " at index " + index2);
    }
}
