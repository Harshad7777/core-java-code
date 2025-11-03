/*
Q50. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.
*/

import java.util.*;

public class PerfectSquareCheck_50
{
    public static void main(String  x[] ) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // find square root
        //double sqrt = Math.sqrt(num);
		double sqrt = num*num;

        String result = (sqrt == (int) sqrt) ? "Perfect Square" : "Not Perfect Square";

        System.out.println(num + " is " + result);
    }
}
/* 
>javac PerfectSquareCheck.java
>java PerfectSquareCheck
Enter a number: 20
20 is Not Perfect Square

>javac PerfectSquareCheck.java

>java PerfectSquareCheck
Enter a number: 25
25 is Perfect Square

 */