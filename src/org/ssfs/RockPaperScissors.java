package org.ssfs;

import java.util.Scanner;

public class RockPaperScissors {

    static Scanner scan = new Scanner(System.in);

    public static String getUserChoice(){
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.next();
        return userChoice;
    }

    public static String getComputerChoice(){
        int randomNum = (int)(Math.random() * 3);
        if(randomNum == 0)
            return "rock";
        else if(randomNum == 1)
            return "paper";
        else
            return "scissors";

    }

    public static String whoWins(String computer, String person) {
        String winner;
        String tied = "You tied!";
        String computerWin = "The computer wins!";
        String personWin= "You win!";
        String error = "You have entered invalid choice.";
        if(person. equals("scissors") && computer.equals("scissors"))
            winner = tied;
        else if(person. equals("rock") && computer. equals("rock"))
            winner = tied;
        else if(person. equals("paper") && computer. equals("paper"))
            winner = tied;
        else if(person. equals("scissors") && computer.equals("paper"))
            winner = personWin;
        else if(person. equals("rock") && computer. equals("scissors"))
            winner = personWin;
        else if(person. equals("paper") && computer. equals("rock"))
            winner = personWin;
        else if(person. equals("scissors") && computer.equals("rock"))
            winner = computerWin;
        else if(person. equals("rock") && computer. equals("paper"))
            winner = computerWin;
        else if(person. equals("paper") && computer. equals("scissors"))
            winner = computerWin;
        else
            winner = error;
        return winner;

    }
}
