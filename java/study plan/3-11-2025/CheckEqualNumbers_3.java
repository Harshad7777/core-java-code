/*  Q3. Write a java program to accept two integers and check whether they are equal or not. */
 
import java.util.*;

public class CheckEqualNumbers_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 == num2)
            System.out.println("Both numbers are equal.");
        else
            System.out.println("Numbers are not equal.");
    }
}
/* java CheckEqualNumbers_3.java
Enter first number: 10
Enter second number: 10
Both numbers are equal. */
