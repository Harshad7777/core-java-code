/* Q9. Grade using nested ternary operators */

import java.util.*;

public class GradeUsingTernary_9
{
    public static void main(String x[] )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score (out of 100): ");
        int score = sc.nextInt();

        String result = (score >= 90) ? "Excellent" :
                        (score >= 75) ? "Good" :
                        (score >= 50) ? "Average" : "Poor";

        System.out.println("Grade: " + result);
    }
}

/* java GradeUsingTernary_9.java
Enter score (out of 100): 90
Grade: Excellent */