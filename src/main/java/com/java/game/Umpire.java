package com.java.game;

public class Umpire {

    int numberFromGuesser;
    int numberFromPlayerOne;
    int numberFromPlayerTwo;
    int numberFromPlayerThree;

    public void collectNumberFromGuesser()
    {
       Guesser g = new Guesser();
       numberFromGuesser = g.guessNumber();
    }

    public void collectNumberFromPlayers()
    {
       Player playerOne = new Player();
       numberFromPlayerOne = playerOne.guessNumber();

       Player playerTwo = new Player();
       numberFromPlayerTwo = playerTwo.guessNumber();

       Player playerThree = new Player();
       numberFromPlayerThree = playerThree.guessNumber();
    }

    public void compare()
    {
        if(numberFromGuesser == numberFromPlayerOne)
        {
            System.out.println("Player one won the game!!!");
        }
        else if (numberFromGuesser == numberFromPlayerTwo)
        {
            System.out.println("Player two won the game!!!");
        }
        else if(numberFromGuesser == numberFromPlayerThree)
        {
            System.out.println("Player Three won the game!!!");
        }
        else
        {
            System.out.println("Nobody Guessed!! You lost the game!!!");
        }
    }
}
