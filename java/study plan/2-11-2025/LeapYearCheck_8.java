/* Q8. Check Whether a Year is a Leap Year or Not */

import java.util.*;

public class LeapYearCheck_8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}

/* java LeapYearCheck_8.java
Enter a year: 2024
Leap year */
