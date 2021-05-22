import java.util.*;

class SecretEncrypt {
    public static void main(String args[]) {
        SecretEncrypt vault = new SecretEncrypt();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vault password: ");
        String userInput = scanner.next();
        String input = userInput.substring("rbrctf{".length(),userInput.length()-1);
        if (vault.checkPassword(input)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied!");
        }
        vault.reversePass();
    }


    //Checking the password
    public boolean checkPassword(String password) {
        if (password.length() != 32) {
            return false;
        }
        char[] buffer = new char[32];
        int i;
        for (i=0; i<8; i++) {
            buffer[i] = password.charAt(i);
        }
        for (; i<16; i++) {
            buffer[i] = password.charAt(23-i);
        }
        for (; i<32; i+=2) {
            buffer[i] = password.charAt(46-i);
        }
        for (i=31; i>=17; i-=2) {
            buffer[i] = password.charAt(i);
        }
        String s = new String(buffer);
        return s.equals("Th1$_1s_31Pm1s_a_p3(sdg3_43SrmT");





    }

    public void reversePass() {
        String password = "Th1$_1s_31Pm1s_a_p3(sdg3_43SrmT";
        int i;
        char[] buffer = new char[32];
        for (i=0; i<8; i++) {
            buffer[i] = password.charAt(i);
        }
        for (; i<16; i++) {
            buffer[i] = password.charAt(23-i);
        }
        System.out.println(new String(buffer));

        for (; i<32; i+=2) {
            buffer[i] = password.charAt(46-i);
        }
        System.out.println(new String(buffer));

        for (i=31; i>=17; i-=2) {
            buffer[i] = password.charAt(i);
        }
        System.out.println(new String(buffer));
    }

}
