// Abshir Mohamed

// CS&141

// Assignment #5

// This program is a bank that  offers 6.5% interest on a savings account, compounded annually. 
// This bank asks the user for an initial amount to invest and a yearly investment amount.  
//Then using these two values, the program prints out a table that show how much money a 
//person will have after each year for the first 25 years.  



import java.util.Scanner;
public class AssignmentFive {
	public static void main(String[] arg)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Welcome to the bank of Wakanda, how much would you like to start with:  ");
		
		double Starts = (double) console.nextInt();
		
		System.out.println("How much do you deposit each year: ");
		
		int deposit = console.nextInt();
		
		double interest = .065;
		
		for(int i = 1;i<=3;i++)
		{
			double FinalInterest = Starts * interest;
			
			double total = (FinalInterest + Starts);
			
			System.out.print("Year"+ i +"   ");
			
			System.out.print("Starts: "+ Starts +"    ");
			
			System.out.print("Interest: "+ FinalInterest +"    ");
			
			System.out.print("Total: "+ total +" ");
			
			Starts = total + deposit;
			
			System.out.println();
		}
	}
}
