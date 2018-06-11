// Abshir Mohamed

// CS&141

// Assignment #12

//This is a program that searches through a file to search for a person by ID:​
import java.io.*;
import java.util.*;

public class AssignmentTwelve {
	public static void main(String[] arg)throws FileNotFoundException
	{
		File file = new File("src/hours.txt");
		
		Scanner console = new Scanner(file);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an id: ");
		
		int id = input.nextInt();
		
		String result = findPerson(console,id);
		
		if(result.equals("N"))
		{
			System.out.printf("ID #%d not found", id);
		}
		else {
			processUserInfo(result);
		}
		
		
	}
	
	public static String findPerson(Scanner console,int searchId)
	{
		String name;
		
		int id;
		
		while(console.hasNextLine())
		{

			String line = console.nextLine();
			
			Scanner lineScan = new Scanner(line);
			
			id = lineScan.nextInt();
			
			if(id == searchId)
			{
				return line;
			}
	
		}
		
		return "N";
		
	}
	
	public static void processUserInfo(String line)
	{
		Scanner userInfo = new Scanner(line);
		
		int id = userInfo.nextInt();
		
		String name = userInfo.next();
		
		double hours = 0, days = 0;
		
		while(userInfo.hasNextDouble())
		{
			days++;
			
			hours += userInfo.nextDouble();
		}
		
		double average = (hours/days);
		
		System.out.printf("%s (ID#%d) worked %.1f (%.2f hours/day)\n",name,(int)id,hours,average);
		
	}
}


