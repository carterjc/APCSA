import java.util.Random;

public class array2d_1 {
    public static void pretty(String s) { System.out.print("\n\n----" + s + "----\n\n"); }
    public static void printMdArray(int[][] s) {
        for (int[] i : s) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    public static void printMdArray(String[][] s) {
        for (String[] i : s) {
            for (String j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    public static void findIndex(int[][] s, int n) {
        boolean found = false;
        b:
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                if (s[i][j] == n) {
                    System.out.println("Value of " + n + " found at row " + (i + 1) + " and column " + (j + 1) + "!");
                    found = true;
                    break b;
                }
            }
        }
        if (!found) { System.out.println("Value of " + n + " not found."); }
    }
    public static void markX(int a, int b) {
        String[][] s = new String[5][5];
        if (a > 4) a = 4;
        if (b > 4) b = 4;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                if (i == a && j == b) {
                    s[i][j] = "X";
                }
                else s[i][j] = "-";
            }
        }
        printMdArray(s);
    }
    public static void main(String[] args) {
        // part 1
        int[][] evenArray = new int[5][5];
        Random r = new Random();
        for (int i = 0; i < evenArray.length; i++) {
            for (int j = 0; j < evenArray[0].length; j++) {
                evenArray[i][j] = r.nextInt(50) * 2;
            }
        }
        pretty("Even Array");
        printMdArray(evenArray);

        // part 2
        int[][] multFive = new int[5][5];
        for (int i = 0; i < multFive.length; i++) {
            for (int j = 0; j < multFive[0].length; j++) {
                multFive[i][j] = r.nextInt(20) * 5;
            }
        }
        pretty("Multiple of 5 Array");
        printMdArray(multFive);

        pretty("Find Indexes");
        findIndex(multFive, 25);
        findIndex(multFive, 30);
        findIndex(multFive, 35);

        // part 3
        int[][] quickArray = { {1, 2}, {3, 4} };
        pretty("Quick Array");
        printMdArray(quickArray);

        String[][] dashArray = new String[5][5];
        for (int i = 0; i < dashArray.length; i++) { for (int j = 0; j < dashArray[0].length; j++) { dashArray[i][j] = "-"; } }
        pretty("Dash Array");
        printMdArray(dashArray);

        // part 4
        String[][] classroom = { {"Carter", "Alexa", "Braedan", "Dylan", "Keren"}, {"Mahika", "Michael", "Olivia", "Omir", "-"}};
        pretty("Classroom Array");
        printMdArray(classroom);

        // bonus
        pretty("X at 2, 1");
        markX(2, 1);
        pretty("X at 100, 100");
        markX(100, 100);
    }
}
