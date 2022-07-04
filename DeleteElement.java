package arrayexamples;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
        int size,pos,i,num=0;
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many elements you want in an array!");
        size=sc.nextInt(); //5
        System.out.println("Enter "+size + "elements in an array");
        for( i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position");
        pos=sc.nextInt();
        //check position valid or not
        if(pos<size+1||pos<0)
        {
            System.out.println("\nour size is :"+size+" please choose position according to size");

        }
      /* else
        {
        	
            System.out.println("enter value:");
            num=sc.nextInt();
        }*/
            
            //shifting the elements
            for(i=pos-1;i<size-1;i++)
            {
            	arr[i]=arr[i+1];
            }
            //decreasing the size
            size --;
            //new array
            System.out.println("After deleting ,new array will be:");
            for(i=0;i<size;i++)
            {
            	System.out.println(arr[i]);
            }
            
        
        
		

	}

}

