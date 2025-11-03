/* Q42. Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.

A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45  

 */
import java.util.*;

public class Kaprekarnumberornot_42 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt(); 

        int original = num; 

      //digits
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

      
        long square = (long) num * num;

      
        long pow = 1;
        for (int i = 1; i <= count; i++) {
            pow *= 10;
        }

       
        long right = square % pow;
        long left = square / pow;

        if ((left + right) == num) {
            System.out.println(original + " is a Kaprekar number");
        } else {
            System.out.println(original + " is NOT a Kaprekar number");
        }
    }
}
