import java.util.Scanner;

public class arr {

	public static void main(String[] args) 
	{
		
		int[] arr = {10,20,30,40,50,60};
		
		int max =arr[0];
		int secmax =arr[0];
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secmax = max;
				max =arr[i];
			}
			else if(arr[i]>secmax)
			{
				secmax = arr[i];
				
			}
		}
		
		System.out.println(max);
		System.out.println(secmax);
		
		
		
	}

}
