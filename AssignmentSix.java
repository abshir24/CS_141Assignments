// Abshir Mohamed

// CS&141

// Assignment #6

// This program is a program that asks the user to input their full name in <last name>, <first name>
// format. With that input the program will alter the user's name and return which group they  
//belong too based on the length of their last name.


import java.util.*;
public class AssignmentSix {
	public static void main(String[] arg)
	{
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter your name in <lastname>, <firstname>: ");
		String fullname  = userinput.nextLine();
		String alteredName = convert(fullname);
		System.out.println("Your new name is : " + alteredName);
		String lastname = alteredName.substring(alteredName.indexOf(".")+1);
		System.out.print(group(lastname));
		System.out.println();
	}
	
	public static String convert(String fullname)
	{
		int space = fullname.indexOf(",")+2;
		return (fullname.substring(space,space+2) +"."+ fullname.substring(0,space-2)).toUpperCase();

	}
	
	public static String group(String name)
	{
		if(name.length() <= 3)
		{
			return "You are in Group 1!";
		}
		else if(name.length() < 7)
		{
			return "You are in Group2!";
		}
		else 
		{
			return "You are in Group3!";
		}
		
	}
}
