// Abshir Mohamed

// CS&141

// Assignment #8

//This is a program that takes a integer input from the user and expresses the number as a product of factors of  and an odd number. 
//The number 120 has 3 factors of 2 multiplied by the odd number 15.
//For odd numbers (e.g. 7), there are no factors of 2, so you just show the number itself. 

import java.util.Random;


import java.util.Scanner;
public class AssignmentNine {
	static Random rand = new Random();
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] arg)
	{
		int num = promptUser();
		
		twoFactors(num);
	}

	public static int promptUser()
	{
		System.out.println("Please input a number:");
		
		int num = console.nextInt();
		
		if(num <= 0)
		{
			
			System.out.println("Please input a number that's greater than zero");
			
			return promptUser();
		}else{
			
			return num;
			
		}
	}
	
	public static void twoFactors(int num)
	{
		int count = 0, temp = num;
		
		while(num % 2 == 0)
		{
			count++;
			
			num = num/2;
		}
		
		System.out.printf("%d = ", temp);
		
		while(count>0)
		{
			System.out.printf("%d * ",2);
			
			count--;
		}
		
		System.out.printf("%d", num);
		
	}
	
	
}