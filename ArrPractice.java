import java.util.*;
import java.io.*;
public class ArrPractice {

	public static void main (String[] arg)throws FileNotFoundException
	{
		File file = new File("src/section.txt");
		
		Scanner reader = new Scanner(file);
		
		sections(reader);
		
		
	}
	
	public static void printScores(Scanner reader)
	{
		int[] arr = new int[101];
		while(reader.hasNextInt())
		{
			arr[reader.nextInt()]++;
		}
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.printf("%d:",i);
			
			for(int j=0;j<arr[i];j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void sections(Scanner reader)
	{
		int[] points = new int[5];
		
		double[]grades = new double[5];
		
		int count = 0,student=0;
		
		while(reader.hasNextLine())
		{
			count++;
			
			String line = reader.nextLine();
			
			for(int i = 0;i<line.length();i++)
			{
				if(student > 4) student = 0;
				
				if( i == 36) System.out.println(line.charAt(i));
				
				if(line.charAt(i) == 'y') points[student]+=3;
				
				else if (line.charAt(i) == 'n') points[student]+=2;
				
				if (points[student] >= 20) points[student] = 20;
				
				
				student++;
			}
			
			
			
			for(int i = 0;i<points.length;i++)
			{
				grades[i] = ((double)points[i]/20)*100;
			}
			
			System.out.printf("Section %d: \n",count);
			
			System.out.printf("Student points %s: \n",Arrays.toString(points));
			
			System.out.printf("Student grades %s: \n",Arrays.toString(grades));
			
			grades = new double[5];
			
			points = new int[5];
			
			
		}
		
	}
	
	
	public static int multCounter(int num)
	{
		int[] arr = new int[10];
		
		while(num>0)
		{
			arr[num%10]++;
			
			num = num/10;
		}
		
		int max = arr[0];
		
		for(int i = 0;i<arr.length;i++)
		{
			
			if(arr[i]>max) max = i;
			
		}
		
		return max;
		
	}
	
	public static void swap(int[] arr, int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void swapAll(int[] arr, int[] arr2)
	{
		for(int i = 0;i<arr.length;i++)
		{
			int temp = arr[i];
			arr[i] = arr2[i];
			arr2[i]=temp;
		}
	}
	
	public static int[] merge(int[]arr,int[]arr2)
	{
		int len = arr.length+arr2.length;
		
		int[] returnArr = new int[len];
		
		int count=0,i=0;
		
		while(count<Math.max(arr.length, arr2.length))
		{
			if(count < arr2.length)
			{
				
				returnArr[i] = arr2[count]; 
				
				i++;
			}
			
			if(count < arr.length)
			{
				returnArr[i] = arr[count];
				i++;
			}
			
			
			count++;
		}
		
		return returnArr;
	}
}
