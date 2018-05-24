// Abshir Mohamed

// CS&141

// Assignment #7

//This is a program that calculates a student's grade point average. The user will type a line of input containing the student's name, 
//then a number that represents the number of scores, followed by that many integer scores.
//This program uses printf to format the grade point average to 2 decimal places. 

import java.util.Scanner;
public class AssignmentSeven {
	public static void main(String[] arg)
	{
		Scanner userinput = new Scanner(System.in);
		double average = 0;
		System.out.print("Enter a student record: ");
		String name = userinput.next();
//		System.out.print("Enter the number of exams you have taken: ");
		int exams = userinput.nextInt();
		for(int i = 1;i<=exams;i++)
		{
//			System.out.print("Enter exam score number " + i +":");
			average+=userinput.nextInt();
		}
		average = (average/exams);
		System.out.printf("%s's grade is %.2f",name,average);
	}
}
