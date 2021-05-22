import java.util.Random;
import java.util.ArrayList;

public class AP14 {
    public static String scrambleWord(String word) {
        String res = "";
        for (int i = 0; i <= word.length() - 1; i++) {
            if (i == word.length() - 1) res = res + word.charAt(i);
            else if (word.charAt(i) == 'A' && word.charAt(i + 1) != 'A') {
                res = res + word.charAt(i + 1) + word.charAt(i);
                i++;
            }
            else res = res + word.charAt(i);
        }
        return res;
    }
    public static ArrayList<String> scrambleOrRemove(ArrayList<String> words) {
        int i = 0;
        while (i < words.size()) {
            String w = words.get(i);
            if (w.equals(scrambleWord(w))) {
                words.remove(i);
            }
            else {
                words.set(i, scrambleWord(w));
                i++;
            }
        }
        return words;
    }
    public static void main(String[] args) {
        String word;
        word = "ABRACADABRA";
        System.out.println(scrambleWord(word));
        System.out.println("BARCADABARA");
        ArrayList<String> words = new ArrayList<String>();
        words.add("TAN");
        words.add("ABRACADABRA");
        words.add("WHOA");
        words.add("APPLE");
        words.add("EGGS");
        System.out.println(scrambleOrRemove(words));
    }
}
