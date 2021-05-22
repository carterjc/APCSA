public class array2d_2 {
    public static void addColumns(int[][] s) {
        int[] sum = new int[s[0].length];
        for (int i = 0; i < s[0].length; i++) {
            for (int j = 0; j < s.length; j++) {
                sum[i] += s[j][i];
            }
        }
        for (int n : sum) { System.out.println(n); }
    }
    public static void sumArray(int[][] s) {
        int total = 0;
        for (int[] a : s) {
            for (int b : a) {
                total += b;
            }
        }
        System.out.println(total);
    }
    public static boolean magicSquares(int[][] s) {
        if (s.length != s[0].length) return false;
        // add rows
        int[] rowSum = new int[s.length];
        int[] colSum = new int[s[0].length];
        int[] diagSum = new int[2];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                rowSum[i] += s[i][j];
                colSum[j] += s[i][j];
            }
        }
        int i = s.length - 1;
        int j = 0;
        while (i >= 0) {
            diagSum[0] += s[i][i];
            diagSum[1] += s[i][j];
            j++;
            i--;
        }
        for (int a : rowSum) { if (a != rowSum[0]) return false; }
        for (int a : colSum) { if (a != colSum[0]) return false; }
        return diagSum[0] == diagSum[1];
        // add columns
    }
    public static void main(String[] args) {
        int[][] a = { {1, 2, 3, 4}, {5, 6, 7, 8} };
        int[][] b = { {0, 1, 0, 1}, {1, 0, 1, 0} };
        int[][] c = { {4, 9, 2}, {3, 5, 7}, {8, 1, 6} };
        int[][] d = { {4, 9, 2}, {3, 15, 7}, {8, 1, 6} };


        addColumns(a);
        sumArray(a);
        System.out.println(magicSquares(c));
        System.out.println(magicSquares(d));
    }
}
