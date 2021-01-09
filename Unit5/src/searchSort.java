import java.util.Arrays;
import java.util.function.Predicate;

public class searchSort {
    public static void prettyPrint(String s) {
        System.out.println("\n\n----" + s + "----\n\n");
    }
    public static void printArray(int[] a) {
        for (int b : a) {
            System.out.print(b + " ");
        }
    }
    public static int binary(int target, int[] a) {
        int low = 0;
        int high = a.length - 1;
        int mid;

        while (low <= high) {
            mid = (high + low) / 2;
            if (a[mid] == target) { return mid; }
            else if (a[mid] < target) { low = mid + 1; }
            else { high = mid - 1; }
        }
        return -1;
    }
    public static int linear(int target, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) { return i; }
        }
        return -1;
    }
    public static int[] selectionSort(int[] a) {
        int min, temp;
        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) { min = j; }
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] sorted = {1, 4, 7, 10, 15, 22, 44, 55, 66, 77, 88, 99};
        int[] unSorted = {5, 3, 87, 65, 467, 895, 100, 607, 4008};

        prettyPrint("The Array");
        printArray(sorted);

        prettyPrint("Binary");
        int i = binary(15, sorted);
        int j = binary(14, sorted);
        System.out.println("The index found is: " + i);
        System.out.println("The index found is: " + j);

        prettyPrint("Linear");
        i = linear(15, sorted);
        j = linear(467, unSorted);
        int k = linear(17, unSorted);
        System.out.println("The index found is: " + i);
        System.out.println("The index found is: " + j);
        System.out.println("The index found is: " + k);

        prettyPrint("Selection Sort");
        System.out.println("The current unsorted array is: ");
        printArray(unSorted);
        unSorted = selectionSort(unSorted);
        System.out.println("\nThe sorted array is: ");
        printArray(unSorted);
    }
}
