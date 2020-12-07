import java.util.Scanner;


public class RPS {
    public static void main (String[] args){
        //import scanner to start the game
        Scanner myScan = new Scanner(System.in);

        //message to users
        System.out.println("Welcome to Rock, Paper, Scissors!");

        //takes in user input
        System.out.print("Are you ready to begin? Say anything to continue:");
        String playerRes = myScan.nextLine();

        // game boolean
        boolean game = true;

        //see if input has no length, as if user pressed enter without typing anything
        if (playerRes.length() > 0) {
            System.out.println("Great, let's continue!");
        }
        else {
            System.out.println("Well that's no good. Aborting.");
            game = false;
        }

        //begins game with directions for user
        if (game) {
            System.out.println("Choose a number 1-3 to select the corresponding RPS move. Beat the computer!");
        }

        //takes in user input again

        /*
        enter game code here
        todo:
        create a random number to represent computer choice of r p or s
        check the user input
        use if statements to determine whether the player won, lost, tied or quit against computer input
        start the game again if the player did not quit
        */

        while (game) {
            System.out.println("Select 1 for Rock, 2 for Paper, 3 for Scissors, or 4 to quit!");
            int playerChoice = myScan.nextInt();
            if (playerChoice > 3 || playerChoice < 1) {
                System.out.println("Well that's not valid! Aborting!");
                game = false;
                continue;
            }
            int computerChoice = (int) (Math.random() * 3) + 1;
            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
            }
            else if ((playerChoice == 1 && computerChoice == 2 ) || (playerChoice == 2 && computerChoice == 3) || (playerChoice == 3 && computerChoice == 1)) {
                System.out.println("You lose!");
            }
            else {
                System.out.println("You win!");
            }
        }

        //message to user when they quit
        System.out.println("I'm sad to see you go. Enjoy your day!");
    }

}