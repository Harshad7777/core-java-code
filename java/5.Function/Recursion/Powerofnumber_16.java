
/* Q16. Write a java program to find power of a number. */


import java.util.*;
public class Powerofnumber_16
{
    // Recursive function to calculate power
    static int power(int base, int exponent)
    {
        // Base case: anything raised to power 0 is 1
        if (exponent == 0)
            return 1;

        // Recursive case
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int b = sc.nextInt();

        System.out.print("Enter the power: ");
        int p = sc.nextInt();

        int result = power(b, p);

        System.out.println("Power of the number is: " + result);
    }
}


/* java Powerofnumber_16.java
Enter the base: 5
Enter the power: 3
Power of the number is: 125 */

