// Abshir Mohamed

// CS&141

// Assignment extra credit

//This is a program that calculates the number of votes and the winner of the 2008 election

import java.io.*;
import java.util.*;

public class Poll {
	public static void main(String[] arg)throws FileNotFoundException
	{
		File file = new File("src/poll.txt");
		
		Scanner console = new Scanner(file);
		
		int obamaElec=0, mcainElec=0,obama,mcain,electoral;
		
		while(console.hasNext())
		{
			if(console.hasNextInt())
			{
				obama = console.nextInt();
				
				mcain = console.nextInt();
				
				electoral = console.nextInt();
				
				if(obama>mcain){ obamaElec+=electoral;}
				
				else if(mcain>obama) { mcainElec+=electoral; }
				
				else { continue;}
				
			}else{
				
				console.next();
				
			}
		}
		
		System.out.printf("Obama: %d votes \n", obamaElec);
		
		System.out.printf("Mcain: %d votes \n", mcainElec);
	}

}
