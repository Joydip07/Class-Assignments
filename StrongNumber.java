package basicprograms;

import java.util.Scanner;

public class StrongNumber {
	//method to check strong number
	public static void checkStrongNo(int n) {
	
	//variable declarations
	int i,fact,rem,sum = 0,temp;
	temp=n;
		while(n>0)
		{
			//getting reminder
			rem = n%10;//5
			fact=1;// assigning 1 in fact variable before calculating the factorial
			//calculating factorial of reminder
			for(i=1;i<=rem;i++) {
				fact=fact*i;
			}
			//sum of all factorial
			sum=sum+fact;
			n=n/10;//dividing number with 10 to get the quotient value
		}
		if(temp==sum)//check actual value and sum value equal or not
			{
			System.out.println("the number is Strong");
			
		}
		else
		{
			System.out.println("The number is not Strong");
		}
		}
			public static void main (String[]args) {
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check strong or not:");
		i=sc.nextInt();//taking input from user
		//temp=i; //we are storing the value for future use
            checkStrongNo(i);// invoking method

			
		

}



	}

