/*
Q57. Question:
If performance rating > 8, give 15% bonus; else if rating > 5, give 10% bonus; otherwise, no bonus. Use relational operators to implement logic.
*/

import java.util.*;
 public class performancerating_57
 {
	 public static void main (String x[])
	 {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println ("enter performance rating");
		int rating	 = sc.nextInt();
		
		System.out.println ("enter Net salary");
		int salary	 = sc.nextInt();
		
		int salaryplusbonus,bonus;
		
		if(rating>=8)
		{
			salaryplusbonus = salary + salary*15/100;
			bonus = salary*15/100;
		}
		else if (rating>=5)
		{
			salaryplusbonus = salary + (salary*10/100);
			bonus = salary*10/100;
		}
		else
		{
			salaryplusbonus = salary + (salary*0/100);
			bonus = salary*0/100;
		}
		
		System.out.println("according to your rating "+rating);
		System.out.println("your bonus is "+bonus);
		System.out.println("and your salary plus bonus is "+salaryplusbonus);
	 }
 }
 
 
>javac performancerating57.java

>java performancerating57
enter performance rating
9
enter Net salary
10000
according to your rating 9
your bonus is 1500
and your salary plus bonus is 11500

>java performancerating57
enter performance rating
6
enter Net salary
10000
according to your rating 6
your bonus is 1000
and your salary plus bonus is 11000

>java performancerating57
enter performance rating
4
enter Net salary
10000
according to your rating 4
your bonus is 0
and your salary plus bonus is 10000