package com.java.game;

import java.util.Scanner;

public class Guesser {
    int guessNum;

    int guessNumber()
    {
        System.out.println("Guesser guess the number between 1-10 : ");
        Scanner scanner =  new Scanner(System.in);
        guessNum = scanner.nextInt();
        return guessNum;
    }
}
