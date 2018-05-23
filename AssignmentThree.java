
// Abshir Mohamed

// CS&141

// Assignment #3

// This program will implement a factorial method that takes in an integer as a parameter and returns the factorial of that integer



public class AssignmentThree {
	public static void main(String[] args)
	{
		System.out.println(factorial(5));
	}
	
	public static int factorial(int stop)
	{
		int fact = 1;
		for(int i=fact;i<=stop;i++)
		{
			fact *= i;
		}
		return fact;
	}
	
	public static void printNumbers(int stop)
	{
		for(int i=1;i<=stop;i++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
}

