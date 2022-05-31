//Print natural number from 1 to10;

package basicprograms;

import java.util.Scanner;

public class PrintNaturalNo {
	public static void main(String[] args) {
		int i,n;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the range to print natural no: ");
        n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
		System.out.println(i);
		}
		
		
	}

}
