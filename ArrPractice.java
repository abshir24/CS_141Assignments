import java.util.*;
public class ArrPractice {

	public static void main(String[] arg)
	{
		
		System.out.println(multCounter(669260267));
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
				System.out.println("First");
				
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
