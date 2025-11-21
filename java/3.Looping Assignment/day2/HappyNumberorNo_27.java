/*
Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps where in each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.
*/

import java.util.*;
	public class HappyNumberorNo_27
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter number ");
			int n = sc.nextInt();
			
			int num = n; 

			while(n!=1 && n!=4)
			{
				int sum = 0;
				
				while(n!= 0) //19
				{
					int digit = n%10; //9
					sum+=digit*digit; //9*9=81
					n/=10; //1
				}
				
			n = sum;
			System.out.println("next value = "+n) ;
			}
			
			if(n==1)
			{
				System.out.println("Happy Number = "+num) ;
			}
			else
			{
				System.out.println("NOt Happy Number = "+num) ;
			}
		}
	}
	
/* C:\Users\harsh\Downloads\java course notes\java\3.Looping Assignment\day2>java HappyNumberorNo27.java
enter number
19
next value = 82
next value = 68
next value = 100
next value = 1
Happy Number = 19
 */