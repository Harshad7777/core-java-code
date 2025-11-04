/* Q2. Check Whether a Triangle is Valid or Not

(A triangle is valid if the sum of any two sides is greater than the third side) */
import java.util.*;

public class ValidTriangleCheck_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Triangle is valid");
        else
            System.out.println("Triangle is not valid");
    }
}

/* java ValidTriangleCheck_2.java
Enter three sides of triangle: 2
2
2
Triangle is valid */

