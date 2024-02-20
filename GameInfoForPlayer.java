package com.codesoft.numberGuessApp;

import java.util.Scanner;

public class GameInfoForPlayer {
    private Scanner scanner = new Scanner(System.in);

    public void getUserInput() {
        System.out.println("*****GUESSER GUESS GAME*****");
        System.out.println();
        System.out.println("Welcome to the game");
        System.out.println();
        System.out.println("Rules :");
        System.out.println("   - Player Will have only 10 attempts for guess ");
        System.out.println("   - Guessed Number should be only in the range of 1 to 100");
        System.out.println();
        System.out.println("Let's begin......");
        System.out.println();
        System.out.println("Press Enter to start the game.");
        scanner.nextLine(); 
    }
}
