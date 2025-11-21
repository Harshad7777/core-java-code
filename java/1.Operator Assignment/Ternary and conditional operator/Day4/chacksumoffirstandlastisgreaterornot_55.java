/*
Q55. Take a three-digit number and print whether the middle digit is greater than the sum of the first and last digits using the ternary operator.
*/
import java.util.*;

public class SwapTwoNumWithoutThirdVariable_15
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.println("Enter second number (b): ");
        int b = sc.nextInt();

        // Swapping without using third variable
        a = a + b;  // Step 1
        b = a - b;  // Step 2
        a = a - b;  // Step 3

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


/* 
>javac chacksumoffirstandlastisgreaterornot55.java

>java chacksumoffirstandlastisgreaterornot55
enter the three-digit number
123
middle digit is  NOT GREATER than the sum of the first and last digits

>java chacksumoffirstandlastisgreaterornot55
enter the three-digit number
132
middle digit is  NOT GREATER than the sum of the first and last digits */