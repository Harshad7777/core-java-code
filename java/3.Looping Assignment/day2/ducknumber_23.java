/*
Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.

*/

import java.util.*;
public class ducknumber_23
{
	 public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" enter duck number contain at lest one zero");
		
		boolean flage = false;
		int rem = 0;
		
		int num = sc.nextInt(); //1021
		int temp = num;
		
		while(num!=0)
		{
			rem = num%10;  // 1,2,0true,1,0;
			num = num/10;  //102,10,1,0;
			
			if(rem ==0) //0==come flag become true
			{
				flage = true;
			}
		}
			num = temp;
			if(flage)    //flag true print first condition
				{
					System.out.println(num+ " is a duck number");
				}
			else
				{
					System.out.println(num+" is a not duck number");
				}
		
	}
}

/*
>javac ducknumber23.java
>java ducknumber23
 enter duck number contain at lest one zero
1021
1021 is a duck number

*/
