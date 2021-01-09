import java.util.Map;
import java.util.HashMap;

public class stringsProj {
    static void pretty(String s) {
        System.out.println("\n----" + s + "----\n");
    }
    static String formatName(String s) {
        if (!s.contains(",")) { return s; }
        else {
            return s.substring(s.indexOf(",") + 2) + " " + s.substring(0, s.indexOf(","));
        }
    }
    static String reverseEach(String s) {
        String[] words = s.split(" ");
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            StringBuilder str = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                str.append(word.charAt(i));
            }
            output.append(str).append(" ");
        }
        return output.toString();
    }
    static void multiples(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            if (map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            }
            else {
                map.put(c, 1);
            }
        }
        boolean print = false;
        for (char c : map.keySet()) {
            int count = map.get(c);
            if (count > 1) { System.out.println(c + " appears " + count + " times!"); print = true; }
        }
        if (!print) { System.out.println("No duplicates!"); }
    }
    public static void main(String[] args) {
        pretty("Format Name");
        System.out.println(formatName("von Neumann, John"));
        System.out.println(formatName("O'Reilly, Bill"));

        pretty("Reverse Each");
        System.out.println(reverseEach("The quick brown fox jumped over the lazy dog!"));

        pretty("How Many Multiples");
        multiples("Hello World");

        System.out.println();
        multiples("cat");
    }
}
