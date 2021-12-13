package org.ssfs;

import org.junit.Test;

import static org.junit.Assert.*;

public class RockPaperScissorsTest {

    @Test
    public void getComputerChoice() {
        assertTrue((RockPaperScissors.getComputerChoice().equals("rock") ||
                RockPaperScissors.getComputerChoice().equals("scissors") ||
                RockPaperScissors.getComputerChoice().equals("paper")));
    }

    @Test
    public void whoWins() {
        assertEquals("You chose paper.\nThe computer chose paper.\nYou tied!",
                RockPaperScissors.whoWins("paper", "paper"));
        assertEquals("You chose paper.\nThe computer chose scissors.\nThe computer wins!",
                RockPaperScissors.whoWins("scissors", "paper"));
        assertEquals("You chose paper.\nThe computer chose rock.\nYou win!",
                RockPaperScissors.whoWins("rock", "paper"));

        assertEquals("You chose rock.\nThe computer chose paper.\nThe computer wins!",
                RockPaperScissors.whoWins("paper", "rock"));
        assertEquals("You chose rock.\nThe computer chose scissors.\nYou win!",
                RockPaperScissors.whoWins("scissors", "rock"));
        assertEquals("You chose rock.\nThe computer chose rock.\nYou tied!",
                RockPaperScissors.whoWins("rock", "rock"));

        assertEquals("You chose scissors.\nThe computer chose paper.\nYou win!",
                RockPaperScissors.whoWins("paper", "scissors"));
        assertEquals("You chose scissors.\nThe computer chose scissors.\nYou tied!",
                RockPaperScissors.whoWins("scissors", "scissors"));
        assertEquals("You chose scissors.\nThe computer chose rock.\nThe computer wins!",
                RockPaperScissors.whoWins("rock", "scissors"));

    }
}