/* Q7. Find the maximum between two numbers */

import java.util.*;

public class MaxBetweenTwoNumbers_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2)
            System.out.println("Maximum number is: " + num1);
        else
            System.out.println("Maximum number is: " + num2);
    }
}

/* java MaxBetweenTwoNumbers_7.java
Enter first number: 10
Enter second number: 20
Maximum number is: 20 */
