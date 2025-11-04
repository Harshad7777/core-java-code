/* Q8. Print “Pass” or “Fail” based on score */

import java.util.*;

public class PassOrFail_8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student score: ");
        int score = sc.nextInt();

        if (score >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}

/* java PassOrFail_8.java
Enter student score: 40
Pass */
