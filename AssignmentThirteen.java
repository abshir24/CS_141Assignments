// Abshir Mohamed

// CS&141

// Assignment #13

//The program should store each word in an array. The program should then go through the array of words one by one and it 
//should upper case all the odd numbered words, and lowercase all the even numbered words.   
//Then the program should go through the array and print off the entire "sentence" word by word onto a single line, 
//adding a period to the end.Then print off the list as an array using the Arrays.toString() command;




import java.util.*;

public class AssignmentThirteen {

	public static void main(String[] arg)
	{
		String[] arr = new String[10];
		
		String sentence = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 10 words: ");
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.printf("Please type in word #%d: \n ",i+1);
			
			String word = input.next();
			
			if(i%2==0)
				word = word.toLowerCase();
			else 
				word = word.toUpperCase();
			
			
			sentence+= word+" ";
			
			arr[i] = word;
		}
		
		System.out.println("Your sentence is: ");
		
		System.out.println(sentence+".");
		
		System.out.printf("As a string your array would look like: %s ", Arrays.toString(arr));
		
	}
}
