package basicprograms;

import java.util.Scanner;

public class FindMaxusingIfElse {
	
	public void findmax(int x,int y,int z)
	{
if(x>y)//t
{
	if(x>z)//t
	{
		System.out.println("x is greater");
	}
	else
	{
		System.out.println("z is greater");
	}
} //external if

	}
	public static void main(String[] args)
	{
		//declare variables
		int x,y,z;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter three numbers : ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		

		
		//invoking method
		FindMaxusingIfElse max=new FindMaxusingIfElse();
		
	 
		max.findmax(x, y, z);
	
	}
}
	
