package com.codesoft.numberGuessApp;

import java.util.Scanner;

public class GuessLogic 
{
	Scanner scan = new Scanner(System.in);
	int attempts = 9;
	int roundsWon = 0; 
	
	GenerateRandomNumber generate = new GenerateRandomNumber();
	
	
	public void guessLogic()
	{
		
		int trueNumber = generate.generateNumber();
		
		System.out.println("Guess Any Number Between 1 to 100");
		System.out.print("Please Enter your answerget number : ");
		int userGuess = scan.nextInt();
		
		
		for(int i=0 ; i<=attempts ; i++)
		{
			if(userGuess<(trueNumber/2))
			{
				System.out.println("too Low...");
				System.out.println();
				System.out.println("Let's try again");
				System.out.println("Guess Any Number Between 1 to 100");
				System.out.print("Please Enter your guessed number : ");
				userGuess = scan.nextInt();
			}
			
			else if(userGuess>(trueNumber/2))
			{
				System.out.println("too High...");
				System.out.println();
				System.out.println("Let's try again");
				System.out.println("Guess Any Number Between 1 to 100");
				System.out.print("Please Enter your guessed number : ");
				userGuess = scan.nextInt();
			}
				
			else if(userGuess == trueNumber)
			{
				System.out.println("WOW..!! Your Guess Is True");
				System.out.println("Congratulations champ...");
				roundsWon++;
			}
			
			if(i>=attempts)
			{
				System.out.println("Oops sorry you've reached your maximum attempts");
				System.out.println();
				playAgain();
			}
			
			
		}
	}
	
	public void playAgain()
	{
		System.out.println("Do you want to play again ?  (Y/N)");
		String conformation = scan.next();
		
		if(conformation.equalsIgnoreCase("Y"))
		{
			guessLogic();
		}
		
		if(conformation.equalsIgnoreCase("N"))
		{
			System.out.println();
			System.out.println("Winning Score : " + roundsWon);
			System.out.println("Come back later Bbye....");
			System.out.println("--Game Over--");
		}
	}

}
