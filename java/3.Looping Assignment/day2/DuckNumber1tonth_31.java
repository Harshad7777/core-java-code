/*
 
Q31. Write a java program to display 1 to nth Duck Number.

 */

import java.util.*;
public class DuckNumber1tonth_31
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			boolean duck = false;
			int i2=i;
			while(i2>0)
			{
				
				if(i2%10==0)
				{
					duck = true;
					break;
				}
				i2/=10;
			
			}	
				
				if(duck)
				{
					System.out.print(i2+",");
				}
		}
	}
}
/* 
>java DuckNumber1tonth31.java
enter number
100
10,20,30,40,50,60,70,80,90,100, */