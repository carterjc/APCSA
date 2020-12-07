import java.util.ArrayList;

public class Delimiters {

    private String openDel;
    private String closeDel;

    // Initializes class
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    // Takes string array of values and parses out the deliminters
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delims = new ArrayList<String>();

        for (String token : tokens) {
            if (token.equals(openDel) || token.equals(closeDel)) {
                delims.add(token);
            }
        }
        return delims;
    }

    // Takes ArrayList and determines is the open and close delims are balanced
    public boolean isBalanced(ArrayList<String> delimiters) {
        int numOpen = 0;
        int numClose = 0;

        for (String delim : delimiters) {
            if (delim.equals(openDel)) { numOpen += 1; }
            else if (delim.equals(closeDel)) { numClose += 1; }
        }

        return numOpen == numClose;
    }

    // Main method
    public static void main(String[] args) {
        Delimiters d1 = new Delimiters("(", ")");
        String[] tokens = {"(", "x + y", ")", " * 5 "};

        ArrayList<String> delimiters = new ArrayList<String>();

        delimiters = d1.getDelimitersList(tokens);
        boolean balanced = d1.isBalanced(delimiters);

        System.out.println(balanced);
    }


}
