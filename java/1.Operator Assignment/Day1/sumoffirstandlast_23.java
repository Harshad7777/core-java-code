
/*
Q23. Write a program to calculate sum of first and last digit of a number without using loop.
Input : 123
Output : 4
*/

import java.util.*;
public class sumoffirstandlast_23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number");
        int n = sc.nextInt();

        int last = n % 10;

        while(n >= 10)
        {
            n = n / 10;
        }

        int first = n;

        System.out.println("sum of first and last digit = " + (first + last));
    }
}

/* 
import java.util.*;
public class sumoffirstandlast_23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter three digit number");
		int digit = sc.nextInt();
		
		int first = (digit/100);
		int last = (digit%10);
		int add =(first + last);
		
		System.out.println("sum of first and last digit = " + add);
        
	}
} */

/* >javac sumoffirstandlast.java

>java sumoffirstandlast
enter three digit number
123
sum of first and last digit = 4
 */
