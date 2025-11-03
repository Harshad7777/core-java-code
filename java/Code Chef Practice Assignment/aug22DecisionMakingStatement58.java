/*
Code Chef Practice Assignment

Problem Statement First 

The chef has to travel to another place. For this, he can avail any one of two cab services.
•	The first cab service charges XX rupees.
•	The second cab service charges YY rupees.
The chef wants to spend the minimum amount of money. Which cab service should Chef take?
Input Format
•	The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.
Output Format
For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.
You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).
Constraints
1<=T<=100
1<X<Y<=100
Sample 1:
Input	Output:
3
30 65        First 
42 42        Any
90  50        Second
Explanation:
Test case 11: The first cab service is cheaper than the second cab service.
Test case 22: Both the cab services have the same price.
Test case 33: The second cab service is cheaper than the first cab service.

-------------1 code--------------------------------------------------------------------/
*/

import java.util.*;

public class aug22DecisionMakingStatement58 {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first cab service charges (XX rupees): ");
        int firstCab = sc.nextInt();

        System.out.println("Enter second cab service charges (YY rupees): ");
        int secondCab = sc.nextInt();

        if (firstCab < secondCab) 
        {
            System.out.println("The first cab service is cheaper than the second cab service.");
        } 
        else if (firstCab > secondCab) 
        {
            System.out.println("The second cab service is cheaper than the first cab service.");
        } 
        else 
        {
            System.out.println("Both cab services have the same charges.");
        }

      
    }
}
/*
-------------1  output -------------------------------------------------------------------//

>javac aug22DecisionMakingStatement58.java
>java aug22DecisionMakingStatement58
Enter first cab service charges (XX rupees): 
50
Enter second cab service charges (YY rupees): 
100
The first cab service is cheaper than the second cab service.

>java aug22DecisionMakingStatement58
Enter first cab service charges (XX rupees): 
100
Enter second cab service charges (YY rupees): 
100
Both cab services have the same charges.
*/