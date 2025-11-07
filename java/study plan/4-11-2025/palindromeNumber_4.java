/* 4.Write a program to check if a number is a palindrome or not. */

import java.util.*;
public class palindromeNumber_4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter any number:");
		int n = sc.nextInt();
		
		int original = n;
		
		int rev = 0;
		 for(int i=1; n!=0; n = n/10)
		 {
			 int digit = n % 10; //get last digit
			 rev = rev * 10 + digit;
			 
		 }
		 
		 if(original == rev)
		 { 
			System.out.println(original +" is a palindrome number.");
		 }
		else
		{
			System.out.println(original + "is not palindrome number.");
		}	
	}
}

/* java palindromeNumber_4.java
enter any number:121
121 is a palindrome number. */