package com.codesoft.numberGuessApp;

public class Game 
{
	public static void main(String[] args)
	{
		GuessLogic guessLogic = new GuessLogic();
		GameInfoForPlayer gameInfo = new GameInfoForPlayer();
		gameInfo.getUserInput();
		guessLogic.guessLogic();
	}
}
