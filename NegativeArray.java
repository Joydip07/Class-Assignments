package arrayexamples;

import java.util.Scanner;

public class NegativeArray {

public static void main(String[] args) {
//Runtime Initialization
int arr[]= new int[5];
Scanner sc = new Scanner (System.in);
System.out.println("Enter array elements");
for(int i=0; i<arr.length;i++)//inserting value
{
arr[i]=sc.nextInt();

}//end of for[1]
for (int i=0;i<5;i++)
{
if (arr[i]<0)//condition
{
System.out.println(arr[i]);//printing the output
}
}//end of for[2]

}

}
