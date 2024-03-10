package com.codesoft.StudentGradeCalculator;

import java.util.Scanner;

public class TakeMarksInput
{
	Scanner scan = new Scanner(System.in);
	int subjects;
	int sum;
	float average;
	char grade;
	int counter = 0;
	
	public void inputMarks()
	{
		System.out.println("--- Welcome to THE STUDENT GRADE CALCULATOR ---");
		System.out.println();
		System.out.println("Enter your total subjects : ");
		subjects = scan.nextInt();
		System.out.println();
	}
	
	public int sum() 
	{	
		for(int i=1; i<=subjects; i++)
		{
			System.out.println("Enter the marks of Subject " + i + " : ");
			sum = sum + scan.nextInt();
			counter++;
			
		}
		return sum;
	}
	
	public float average()
	{
		average = sum/subjects;
		return average;
	}	
	
	public char grade()
	{
		if(average>90.00)
		{
			grade = 'A';
		}
		
		else if(average<90.00 && average>70)
		{
			grade = 'B';
		}
		
		else if(average<70.00 && average>60.00)
		{
			grade = 'C';
		}
		
		else if(average<60.00 && average>35.00)
		{
			grade = 'D';
		}
		
		else if(average<35.00)
		{
			grade = 'E';
		}
		
		return grade;
	}
		
	public void output()
	{
		
		System.out.println();
		System.out.println("Total Marks : " + sum + "/" + counter*100);
		System.out.println("Percentage : " + average + "%");
		System.out.println("Grade : " + grade);
	}
	
	
}
