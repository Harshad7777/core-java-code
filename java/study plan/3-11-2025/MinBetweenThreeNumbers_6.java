/* Q6. Find the minimum between three numbers */
import java.util.*;

public class MinBetweenThreeNumbers_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int min;

        if (a <= b && a <= c)
            min = a;
        else if (b <= a && b <= c)
            min = b;
        else
            min = c;

        System.out.println("Minimum number is: " + min);
    }
}
/* 
java MinBetweenThreeNumbers_6.java
Enter first number: 10
Enter second number: 0
Enter third number: 30
Minimum number is: 0
 */