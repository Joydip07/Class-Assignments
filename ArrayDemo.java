package arrayexamples;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		//compile initialization
		int a[]= {45,3,5,6,7};
		int arr[]= new int[5];
		//traversing array
	for(int i=0; i<arr.length;i++)
		{
			System.out.println(a[i]);
		}
		//runtime initialization
		int arr2[]= new int [5];
		//arr [0]= 10;

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array elements:");

		for (int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();//arr[1]
			
		}
		for (int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
			
		}
		//traversing array using for each
		System.out.println("Traversing array using foreach loop");
		for (int var:arr)
		{
			System.out.println(var);
		}
		
		}
	}


