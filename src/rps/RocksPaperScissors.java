package rps;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;



public class RocksPaperScissors {
    static String[] options = {"rock", "paper", "scissors"};
    static boolean playAgain;

    public static void main(String[] args) {
        int userChoice = getUserChoice();
        System.out.println(getOutcome(userChoice, getRandChoice()));
        playAgain = getPlayAgain();
    }

// Returns user's choice
    private static int getUserChoice() {
        Scanner sc = new Scanner(System.in);
        String choice;
        System.out.print("Enter your choice: ");
        choice =  sc.nextLine().toLowerCase();


        int out =  choice.equals("rock") ? 0
                : choice.equals("paper") ? 1
                : choice.equals("scissors") ? 2 : 3;
        if (out == 3) {
            System.out.println("Invalid choice! Options are rock, paper and scissors.");
            getUserChoice();
        }
        sc.close();
        return out;
    }

    // Returns int representing computer's move
        private static int getRandChoice() {
            return new Random().nextInt(3);
        }

    private static String getOutcome(int userChoice, int randChoice) {
        if (userChoice == randChoice) {
            return "Your opponent played " + options[randChoice] + "\nIt's a tie! ";
        } else if (userChoice == 0 && randChoice == 2
                || userChoice == 1 && randChoice == 0
                || userChoice == 2 && randChoice == 1) {
            return "Your opponent played " + options[randChoice] + "\nCongratulations! You win!";
        } else {
            return "Your opponent played " + options[randChoice] + "\nUnfortunately... you lost.";
        }
    }
    public static boolean getPlayAgain() {
        boolean playAgain;
        System.out.println("Would you like to play again? (Y/N): ");
        Scanner sc = new Scanner(System.in);
        playAgain = sc.nextLine().toLowerCase(Locale.ROOT).equals("y");
        return playAgain;
    }
}


