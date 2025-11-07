/* 3.Write a program to print reverse of a number using for loop. */

import java.util.*;
public class reversenumber_3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter any number");
		int n = sc.nextInt();
		
		int rev =0;
		 for(int i=1; n!=0; n=n/10)
		 {
			 int digit = n % 10; //get last digit
			 rev = rev * 10 + digit;
			 
		 }
		System.out.println("Reverseed number :"+rev);
	}
}
