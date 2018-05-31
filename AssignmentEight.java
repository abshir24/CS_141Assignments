// Abshir Mohamed

// CS&141

// Assignment #8

//This program compares two applicants to
//determine which one seems like the stronger
//applicant.  For each candidate I will need
//either SAT or ACT scores plus a weighted GPA.

import java.util.*;
public class AssignmentEight {
	static Scanner userinput = new Scanner(System.in);
	
	public static void main(String[] arg)
	{
		double applicantOneScore = applicantScore(1);
		
		double applicantTwoScore = applicantScore(2);
		
		winner(applicantOneScore,applicantTwoScore);
		
	}
	
	
	//Method that prints the winner between the two applicants
	public static void winner(double one, double two)
	{
		System.out.printf("First applicant overall score is %.1f \n", one);
		System.out.printf("Second applicant overall score is %.1f \n", two);
		if(one>two)
		{
			System.out.println( "The first applicant seems to be better");
		}else if(one<two) {
			System.out.println( "The second applicant seems to be better");
		}else {
			System.out.println("The two applicants seem to be equal");
		}
	}
	
	//Method that handles the information for the applicant
	
	public static double applicantScore(int applicant)
	{
		double examScores,gpaScores;
		
		System.out.printf("Information for applicant #%d: \n", applicant);
		
		examScores = retrieveScores();
		
		gpaScores = gpa();
		
		return calculateScores(examScores,gpaScores);
		
	}
	
	//Retrieve SAT and ACT scores
	
	public static double retrieveScores()
	{
		System.out.print("do you have 1) SAT scores or 2) ACT scores? ");
		int test = userinput.nextInt();
		if(test == 1)
		{
			return calculateSAT();
		}
		else if(test == 2)
		{
			return calculateACT();
		}
		else {
			System.out.println("Please enter a valid number!");
			//run the function again if the right number is not given by user
			return retrieveScores();
		}
	}
	
	//Calculate GPA score 
	
	public static double gpa()
	{
		double gpa , maxGpa , TM,  score;
		System.out.print("overall GPA? ");
		gpa = userinput.nextDouble();
		System.out.print("max GPA? ");
		maxGpa = userinput.nextDouble();
		System.out.print("Transcript Multiplier? ");
		TM = userinput.nextDouble();
		if(gpa>maxGpa || gpa < 0.0)
		{
			System.out.printf("Please enter a valid GPA within 0.0 and %.1f", maxGpa );
			//run the function again if the right number is not given by user
			return gpa();
		}else {
			score = (gpa/maxGpa)*100*TM;
			System.out.printf("Gpa score is %.1f \n", score);
			return score;
		}
		
	}
	
	//Calculate applicant scores
	
	public static double calculateScores(double a, double b)
	{
		
		return a+b;
	}
	
	//Calculate SAT scores
	
	public static double calculateSAT()
	{
		double examScore;
		int math , reading;
		System.out.print("SAT math? ");
		math =  userinput.nextInt() * 2;
		System.out.print("SAT reading? ");
		reading =  userinput.nextInt();
		System.out.print("SAT writing? ");
		int writing =  userinput.nextInt();
		examScore = (math + reading + writing)/32;
		System.out.printf("exam score is %.1f \n", examScore );
		return examScore;
	}
	
	//Calculate ACT scores
	public static double calculateACT()
	{
		double examScore;
		int math,reading,english,science;
		System.out.print("ACT English? ");
		english =  userinput.nextInt();
		System.out.print("ACT math? ");
		math =  userinput.nextInt() * 2;
		System.out.print("ACT reading? ");
		reading =  userinput.nextInt();
		System.out.print("ACT science? ");
		science =  userinput.nextInt();
		examScore = (math + reading + english + science)/1.8;
		System.out.printf("exam score is %.1f \n", examScore );
		return examScore;
	}

}





