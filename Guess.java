// Abshir Mohamed

// CS&141

// Assignment #10
//This program allows you to play a guessing game.
//I will think of a number between 1 and
//and a contstant number that changes everytime the program is run and will allow you to guess until
//you get it.  For each guess, I will tell you
//whether the right answer is higher or lower
//than your guess.

import java.util.*;

public class Guess {
	static Scanner console = new Scanner(System.in);
	
	static Random rand = new Random();
	
	//all of the variables that transcend one game are stored outside of game function because they change very often.
	
	static double totalGames = 0, totalGuesses = 0;
	
	static int bestGame=10000,constant = rand.nextInt(101) + 1;
	
	public static void main(String[] arg)
	{
		introduction();
	}
	
	//This is the introduction to the game that invokes the game function
	
	public static void introduction()
	{
		System.out.println("This program allows you to play a guessing game.\nI will think of a number between 1 and"+constant+"\nand will allow you to guess until\nyou get it.For each guess, I will tell you\nwhether the right answer is higher or lower\nthan your guess.");
		System.out.println();
		playGame();
	}
	
	
	//This is the game function that allows the begins the game when invoked
	
	public static void playGame()
	{
		int guesses = 0, randomNum = rand.nextInt(constant+1)+1 , guess;
		
		
		boolean gameover = false;
		
		System.out.printf("I'm thinking of a number between 1 and %d \n", constant);
		
		//while the gameover condition is false and the amount of guesses are less than 10000
		
		while(!gameover && guesses<10000)
		{
			guesses++;
			
			System.out.print("Your guess?");
			
			guess = console.nextInt();
			
			if(guess>randomNum)  System.out.println("Its lower guess a gain"); 
				
			else if(guess<randomNum) System.out.println("Its higher guess a gain");
				
			
			else {
				bestGame = Math.min(guesses, bestGame);
				
				totalGuesses += guesses;
				
				totalGames++;
				
				if(guesses == 1)  System.out.printf("You got it right in %d guess \n", guesses) ; 
				
				else System.out.printf("You got it right in %d guesses \n", guesses) ; 
				
				gameover = true;
			}
		}
		
		promptUser();
		
	}
	
	//This methods prompts the user to see if they want to play again
	
	public static void promptUser()
	{
		System.out.print("Do you want to play again?");
		
		String response = console.next().toLowerCase();
		
		if(response.charAt(0) == 'n')
		{
			double average = (totalGuesses/totalGames);
			
			System.out.println("Overall results");
			
			System.out.printf("Total games = %d \n", (int)totalGames);
			
			System.out.printf("Total guesses = %d \n", (int)totalGuesses);
			
			System.out.printf("Guessing average = %.1f \n", average);
			
			System.out.printf("Best game = %d", bestGame);
			
		}
		
		else playGame();
			
		
	}
}
