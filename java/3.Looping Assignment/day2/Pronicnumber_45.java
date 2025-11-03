/* Q45. Write a Java program to print all Pronic numbers between 1 and n.
 A Pronic number is the product of two consecutive integers, i.e., n(n+1).
 Example: 2 (1×2), 6 (2×3), 12 (3×4) etc.
Explanation:
 Use a loop to check for each number from 1 to n. For each, use another loop to find if it can be expressed as x*(x+1).
 */

import java.util.*;

public class Pronicnumber_45 
{
    public static void main(String x[])
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt(); 

        for (int i = 1; i <= num; i++) 
		{
            int sum = 0;

            // find proper divisors of i
            for (int j = 1; j <= i / 2; j++)
				{
                if (i % j == 0) 
				{
                    sum += j;
                }
            }

            // check if abundant
            if (sum > i)
				{
					System.out.println(i);
				}
        }	
    }
}
