/* Q3. Check Whether a Triangle is Equilateral, Isosceles or Scalene */

import java.util.*;

public class TriangleTypeCheck_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("Equilateral triangle");
        else if (a == b || b == c || a == c)
            System.out.println("Isosceles triangle");
        else
            System.out.println("Scalene triangle");
    }
}

/* java TriangleTypeCheck_3.java
Enter three sides of triangle: 10
10
10
Equilateral triangle
 */