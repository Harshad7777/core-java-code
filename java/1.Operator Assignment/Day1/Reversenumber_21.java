/*
Q21. Write a Java program to reverse a number without using loop.
Input a number: 123 Reverse number: 321
*/

import java.util.*;
public class Reversenumber_21
	{
		public static void main (String x[])
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int num = sc.nextInt();
		
		int c = num%10;
		int b = (num/10)%10;
		int a =num/100;
		
		System.out.println("Reverse number "+c+b+a);
	}
	}


>javac Reversenumber.java

>java Reversenumber
Enter an integer:
123
Reverse number 321
	