Q18. Find the First and Last Digit of a Number (Using Recursion)

import java.util.*;

public class FirstAndLastDigit_18
{
    // Recursive function to find the first digit
    static int firstDigit(int num)
    {
        // Base case: when number has only one digit left
        if (num < 10)
            return num;
        return firstDigit(num / 10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int last = num % 10;
        int first = firstDigit(num);

        System.out.println("First digit: " + first);
        System.out.println("Last digit: " + last);
    }
}
