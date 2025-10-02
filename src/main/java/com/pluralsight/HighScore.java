package com.pluralsight;

import java.util.Scanner;

public class HighScore {
    public static Scanner scoreHigh = new Scanner(System.in);

    public static void main(String[] args) {
        // propmpt the user for a game score ( in the format visitor | 21:9 )
        // create scanner
        //print " what is the score "
        // home:
        // print the winner
        // this is the first question
        System.out.print("What was the score of the game?: ");
        String match = askQuestion("what is the score of the game?: ");
        // lets create a method for this
        // create a print statement for the score
        // System.out.println("Winner: " + score);
        // this is where we would split the answer given and then have the score printed as Winner:
        // i think i need another method but im gonna figure out how to do that later
        // gonna create an array named scoreSpl
        String[] teamScores = match.split("\\|");
        String[] teams = teamScores[0].split(":");
        String[] scores = teamScores[1].split(":");
        int scoreA = Integer.parseInt(scores[0]);
        int scoreB = Integer.parseInt(scores[1]);

        if (scoreA > scoreB){
            System.out.println("Winner: " + teams[0]);
        }
        else if (scoreB > scoreA){
            System.out.println("Winner: " + teams[1]);
        }
        else {
            System.out.println("It's a tie! ");
        }

        /*switch (winner.length){
            case 1:
                System.out.println("winner" + winner[0]);
                break;

            case 2:
                System.out.println("winner" + winner[1]);
                break;

            default:
                System.out.println("invalid");
        }*/
        // i have to change ^ this to an if statement to compare the two numbers to determin the winner
        // if position 2 is > position 3 then print winner position 0
        // i think that i need to call on

    }

    public static String askQuestion (String askQuestion ){
        System.out.println(askQuestion);
        String match = scoreHigh.nextLine();
        return match.trim();
    }
}
