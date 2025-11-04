/* Q7. Write a Java program to input cost price and selling price of a product and check profit or loss. */

import java.util.*;

public class ProfitLossCheck_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter selling price: ");
        double sp = sc.nextDouble();

        if (sp > cp)
            System.out.println("Profit of " + (sp - cp));
        else if (sp < cp)
            System.out.println("Loss of " + (cp - sp));
        else
            System.out.println("No profit, no loss");
    }
}


/* java
Enter cost price: 10
Enter selling price: 20
Profit of 10.0 */
