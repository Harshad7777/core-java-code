/* Q1. Write a Java program to check whether a number is even or odd. */

import java.util.*;

public class EvenOddCheck_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}


/* java EvenOddCheck_1.java
Enter a number: 2
Even number */
