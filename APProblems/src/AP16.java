import java.util.ArrayList;
import java.util.Random;

class RandomStringChooser {
    public ArrayList<String> r_arr = new ArrayList<String>();

    public RandomStringChooser(String[] wordArray) {
        for (String s : wordArray) {
            this.r_arr.add(s);
        }
    }

    public String getNext() {
        int index;
        String choice;

        Random r = new Random();
        if (this.r_arr.size() > 0) {
            index = r.nextInt(this.r_arr.size());
            choice = r_arr.get(index);
            r_arr.remove(choice);
        }
        else {
            choice = "NONE";
        }
        return choice;
    }
}

class RandomLetterChooser extends RandomStringChooser {

    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str) {
        String[] out =  new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            out[i] = String.valueOf(str.charAt(i));
        }
        return out;
    }
}

public class AP16 {
    public static void main(String[] args) {
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++) {
            System.out.print(sChooser.getNext() + " ");
        }

        System.out.println();

        RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
        for (int k = 0; k < 4; k++)
        {
            System.out.print(letterChooser.getNext());
        }
    }
}
