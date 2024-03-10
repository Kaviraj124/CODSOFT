package com.codesoft.StudentGradeCalculator;

public class StudentGradeCalc {

	public static void main(String[] args) 
	{
		TakeMarksInput marks = new TakeMarksInput();
		marks.inputMarks();
		marks.sum();
		marks.average();
		marks.grade();
		marks.output();
		

	}

}
