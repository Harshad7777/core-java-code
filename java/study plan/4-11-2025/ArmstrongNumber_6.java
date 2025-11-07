/* 6.Write a program to check if a number is an Armstrong number.

(Armstrong = sum of cubes of digits equals the number, e.g., 153 = 1³ + 5³ + 3³) */

import java.util.*;
public class ArmstrongNumber_6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt(); //153
		
		int count=0;
		int sum = 0;
		int temp = num ;
		
		while(num>0)
		{
			num = num/10; //153, 15, 1
			count++;  //1,2,3
		}
		
		num=temp;
		while(num>0)
		{	
			int digit = num %10;  //3,5,1
			
			int digitpower = 1;
			
			for(int i=1; i<=count; i++)
				{
					digitpower = digitpower* digit;
				}
			
			sum = sum + digitpower;
			num/=10;
		}
		
		if(sum == temp)
		{
			System.out.println( temp +" Armstrong Number ");
		}
		else
		{
			System.out.println(temp +" not Armstrong Number ");
		}
	}
}
