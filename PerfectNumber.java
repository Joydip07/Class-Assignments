package basicprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean checkPerfectNo(int n)
	{
	int i,sum=0;
	for(i=1;i<n;i++);//i=1<6t
		{
		if(n%i==0) { //6%1==0t
			//sum=sum+i;//0+1=1sum=1
			sum+=i;
		}
		
	}
		/*if(n==sum)
			return true;
		else
			return false;*/
		boolean b=(n==sum)?true: false;
		return b;
	}
public static void main (String[] args) {
	int num;
	boolean result;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number to check perfect or not!: ");
	num= sc.nextInt();//6
    result=PerfectNumber.checkPerfectNo(num);
    System.out.println(result);
}
}
