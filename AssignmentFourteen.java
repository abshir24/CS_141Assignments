// Abshir Mohamed

// CS&141

// Assignment #14

//The collapse method is a method that accepts an array of integers as a parameter and returns a 
//new array containing the result of replacing each pair of integers with the sum of that pair.

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentFourteen {
	 public static void main(String[] args)
	 {
		 int[] array1 = {1,2,3,4,5};
		 int[] array2 = {8, 7, 6, 4, 9, 12, 12, 8, 11, 12, 20};
		 int[] array1b, array2b;
		 
		 array1b = collapse(array1);
		 array2b = collapse(array2);
		 
		 System.out.println("Before : " + Arrays.toString(array1) );
		 System.out.println("After : " + Arrays.toString(array1b) );
		 System.out.println("******");
		 System.out.println("Before : " + Arrays.toString(array2) );
		 System.out.println("After : " + Arrays.toString(array2b) );
	 
	 }
	 
	 public static int[] collapse(int[]arr)
	 {
		int len = arr.length,stop=0,idx=0;
		
		if(len%2==1){ len = (arr.length/2)+1; stop=1; }
		
		else len = (arr.length/2);
		
		int[] returnArr = new int[len];
		
		returnArr[len-1] = arr[arr.length-1];
		
		for(int i = 0;i<arr.length-stop;i+=2){ returnArr[idx++] = arr[i]+arr[i+1]; }
		
		return returnArr;
	 }
	
}
