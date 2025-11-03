/*
Q41. Write a java program to find maximum between three numbers.
*/

import java.util.*;
public class maxbetweenthreenum_41
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		int a, b, c, max;
		System.out.println("enter first numbers");
		a = sc.nextInt ();
		
		System.out.println("enter second numbers");
		b = sc.nextInt ();
		
		System.out.println("enter third	numbers");
		c = sc.nextInt ();
		
		if(a>b && a>c)
		{
			max=a;
		}
		else if(b>a && b>c)
		{
			max=b;
		}
		else
		{
			max=c;
		}	
		{
			System.out.println("maximum value between three value is " +max);
		}
	}
}

>java maxbetweenthreenum
enter first numbers
10
enter second numbers
20
enter third numbers
30
maximum value between three value is 30