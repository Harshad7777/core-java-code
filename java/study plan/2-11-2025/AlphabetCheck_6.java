/* Q6. Check Whether a Character is Alphabetic or Not */

import java.util.*;

public class AlphabetCheck_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Alphabet character");
        else
            System.out.println("Not an alphabet character");
    }
}
/* java AlphabetCheck_6.java
Enter a character: a
Alphabet character
 */