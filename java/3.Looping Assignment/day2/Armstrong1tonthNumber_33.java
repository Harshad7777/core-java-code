/*
Q33. Write a java program to display 1 to nth Armstrong Number.
Example : A strong number is one in which the factorial sum of the digits equals the number itself. 1, 2
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.
*/

import java.util.*;

public class Armstrong1tonthNumber_33
{
    public static void main(String x[])
    {	
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        for (int j = 1; j <= num; j++)
        {
            int temp = j;
            int n = j;
            int count = 0;

            // Count digits
            while (n != 0)
            {
                n /= 10;
                count++;
            }

            int sum = 0;
            n = j;

            // Calculate Armstrong sum
            while (n != 0)
            {
                int digit = n % 10;

                int pow = 1;
                for (int i = 1; i <= count; i++)
                {
                    pow = pow * digit;
                }

                sum += pow;
                n /= 10;
            }

            // Check Armstrong number
            if (sum == temp)
            {
                System.out.println(j);
            }
        }
    }
}

/* 
C:\Users\harsh\Downloads\java course notes\java\3.Looping Assignment\day2>java Armstrong1tonthNumber33.java
Enter the number:
10000
Armstrong numbers from 1 to 10000 are:
1
2
3
4
5
6
7
8
9
153
370
371
407
1634
8208
9474
 */