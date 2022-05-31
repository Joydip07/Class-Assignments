package basicprograms;

import java.util.Scanner;

public class parameter {
public static void main(String[]args)
{
	float l,b,p;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length");
	l=sc.nextFloat();
	System.out.println("Enter the breadth");
	b=sc.nextFloat();
	p=2*(l+b);
	System.out.println("The Parameter is:" +p);
	
	
	
}

}
