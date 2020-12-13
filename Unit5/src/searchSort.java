import java.util.Arrays;
import java.util.function.Predicate;

public class searchSort {
    public static void prettyPrint(String s) {
        System.out.println("\n\n----" + s + "----\n\n");
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
    public static void main(String[] args) {
        int[] sorted = {1, 4, 7, 10, 15, 22, 44, 55, 66, 77, 88, 99};

        prettyPrint("The Array");
        System.out.println(Arrays.toString(sorted));

        prettyPrint("Binary");
        int i = binary(15, sorted);
        int j = binary(14, sorted);
        System.out.println("The index found is: " + i);
        System.out.println("The index found is: " + j);

        prettyPrint("Linear");
    }
}
