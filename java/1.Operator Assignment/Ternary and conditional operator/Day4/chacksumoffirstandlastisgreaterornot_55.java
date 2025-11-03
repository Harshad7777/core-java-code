/*
Q55. Take a three-digit number and print whether the middle digit is greater than the sum of the first and last digits using the ternary operator.
*/

import java.util.*;
public class chacksumoffirstandlastisgreaterornot_55
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the three-digit number");
		double a = sc.nextDouble();
		
		String print;
		double firstdigit = a/100;
		double middledigit = (a/10)%10;
		double lastdigit = a%10;
		
		double add = firstdigit +lastdigit;
	
		if(middledigit>add)
		{
			print = "GREATER";
		}
		else 
		{
			print = " NOT GREATER";
		}
		
		System.out.println("middle digit is "+ print +" than the sum of the first and last digits  " );
	}
}


>javac chacksumoffirstandlastisgreaterornot55.java

>java chacksumoffirstandlastisgreaterornot55
enter the three-digit number
123
middle digit is  NOT GREATER than the sum of the first and last digits

>java chacksumoffirstandlastisgreaterornot55
enter the three-digit number
132
middle digit is  NOT GREATER than the sum of the first and last digits