package basicprograms;

import java.util.Scanner;
//cost price= 2000
//selling price= 2500
//profit=500


public class CalculateProfitorLoss {
	public static void main(String[] args)
	{ 
		float cp,sp,p;
	Scanner	sc=new Scanner(System.in);
// input cost price and selling price of a product		
		System.out.println("Enter the cost price");
		cp=sc.nextFloat();
		
		System.out.println("Enter the selling price");
		sp=sc.nextFloat();
		
		if(sp>cp) {
		//calculate profit//
			p=sp-cp;
		System.out.println("The profit is:" +p);}
		else if (cp>sp) {
		//calculate loss
			p=cp-sp;
			System.out.println("The loss is: "+p);
		}
	//Neither profit nor loss
		else System.out.println("No profit no loss");
	}

}
