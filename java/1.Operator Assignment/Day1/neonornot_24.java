/*
Q24. Write a java program to check whether number is neon or not.
Input : 9
Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
*/
import java.util.*;
public class neonornot_24
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int number = sc.nextInt();
		
		int square = (number*number);
		
		int digit1 = (square%10);
		int digit2 = (square/10);
		
		int add = digit1+digit2;
		
		String msg = (add==number)?"number is neon ":"number is not neon.";
		
		System.out.println( ""+msg);
        
	}
}

/* >javac neonornot.java

>java neonornot
enter  number
9
number is neon */