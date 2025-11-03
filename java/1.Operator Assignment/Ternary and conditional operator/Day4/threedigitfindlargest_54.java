/*
Q54. Take a three-digit number and print the larger digit among first and last digit using ternary operator.
*/


import java.util.*;
public class threedigitfindlargest_54
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the three-digit number");
		double a = sc.nextDouble();
		
		String print;
		double firstdigit = a/100;
		double lastdigit = a%10;
	
		if(firstdigit>lastdigit)
		{
			print = "first digit is  larger";
		}
		else 
		{
			print = "last digit is  larger";
		}
		
		System.out.println("from this three-digit number " +print);
	}
}

>javac threedigitfindlargest54.java
>java threedigitfindlargest54
enter the three-digit number
123
from this three-digit number last digit is  larger

>java threedigitfindlargest54
enter the three-digit number
321
from this three-digit number first digit is  larger

>
