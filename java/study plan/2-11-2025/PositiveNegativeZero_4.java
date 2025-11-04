/* Q4. Check Whether a Number is Positive, Negative or Zero
 */
import java.util.*;

public class PositiveNegativeZero_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("Positive number");
        else if (num < 0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");
    }
}
/* 
java PositiveNegativeZero_4.java
Enter a number: 1
Positive number */