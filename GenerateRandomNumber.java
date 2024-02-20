package com.codesoft.numberGuessApp;

import java.util.Random;

public class GenerateRandomNumber 
{
	
	public int generateNumber()
	{
		Random random = new Random();
		int lowerLimit = 1;
		int upperLimit = 100;
		int generated = random.nextInt(upperLimit-lowerLimit+1)+lowerLimit;
		
		return generated;
		
	}
}
