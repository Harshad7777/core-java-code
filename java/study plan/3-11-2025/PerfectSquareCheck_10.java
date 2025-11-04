/* Q10. Check if a number is a Perfect Square (using ternary operator) */

import java.util.*;

public class PerfectSquareCheck_10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        double sqrt = Math.sqrt(num);
        String result = (sqrt == (int)sqrt) ? "Perfect Square" : "Not Perfect Square";

        System.out.println(result);
    }
}
/* 
java PerfectSquareCheck_10.java
Enter a number: 49
Perfect Square */