/* 5.Write a program to count the number of digits in a given number. */


import java.util.*;
public class CountDigit_5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		
		int count = 0;
		for(;n!=0; n=n/10)
		{
			count++;
		}
		System.out.println("Number  of digits :"+count);
	}
}

/* java CountDigit_5.java
enter the number:
123
Number  of digits:3 */
