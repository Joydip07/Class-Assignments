package basicprograms;

import java.util.Scanner;

public class PrintEvenNumber {
	public static void main(String [] args) {
		//print all even number from 1 to 50
		int i;
		
		System.out.println("List of even number from 1 to 50:");
		
		for (i=1;i<=50;i++) {
			//logic to check if the number is even or not
			if(i%2==0)
			{
				System.out.println(i+"");
			}
			
		}
	}

}
