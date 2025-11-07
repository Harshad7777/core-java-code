/* 1.Write a program to print Fibonacci series up to n terms. */

import java.util.*;
public class FibonacciSeries_1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        
		for (int i = 1; i <= n; i++)
		{
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
/* 
| Iteration (i) | a | b | Printed value | next = a + b | New a | New b |
| ------------- | - | - | ------------- | ------------ | ----- | ----- |
| 1             | 0 | 1 | 0             | 1            | 1     | 1     |
| 2             | 1 | 1 | 1             | 2            | 1     | 2     |
| 3             | 1 | 2 | 1             | 3            | 2     | 3     |
| 4             | 2 | 3 | 2             | 5            | 3     | 5     |
| 5             | 3 | 5 | 3             | 8            | 5     | 8     |



Enter number of terms: 5
Fibonacci Series: 0 1 1 2 3 */
