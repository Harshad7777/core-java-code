/* Q5. Find the minimum between two numbers */

import java.util.*;

public class MinBetweenTwoNumbers_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 < num2)
            System.out.println("Minimum number is: " + num1);
        else
            System.out.println("Minimum number is: " + num2);
    }
}

/* java MinBetweenTwoNumbers_5.java
Enter first number: 10
Enter second number: 20
Minimum number is: 10 */