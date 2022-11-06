package assignment_2;

import java.util.Scanner;

public class Selection_sort {

private static Scanner sc;
	
	public static void main(String[] args) {
		int Size, i, j, temp;
		
		sc = new Scanner(System.in);		
		System.out.print("Please Enter the Array size = ");
		Size = sc.nextInt();
		
		int[] arr = new int[Size];
		
		System.out.format("Enter Array %d elements = ", Size);
		for(i = 0; i < Size; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(i = 0; i < arr.length  - 1; i++)
		{
			int min = i;
			
			for(j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
		System.out.print("\nThe Selection Sort Output = ");
		for(i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + "  ");
		}
	}
}
