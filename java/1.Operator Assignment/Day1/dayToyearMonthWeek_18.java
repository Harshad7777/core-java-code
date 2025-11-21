/*
Q18. Write a Java program to convert days to years, month and week.
*/

import java.util.*;

public class dayToyearMonthWeek_18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter days");
		double totaldays = sc.nextInt();
		
		
		double years = totaldays / 365;              // 1 years = 1day
        double month = (totaldays % 365) / 30;     // Remaining month
        double week = totaldays % 7;   
		
		System.out.println("days to years"+years);
		System.out.println("remaining"+month);
		System.out.println("remaining"+week);
	}
}
/* 
>java dayToyearMonthWeek
enter days
365
days to years1.0
remaining12.166666666666666
remaining52.142857142857146 */