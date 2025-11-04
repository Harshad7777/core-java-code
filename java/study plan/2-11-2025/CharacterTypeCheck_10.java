/* Q10. Check Whether a Character is Alphabet, Digit, or Special Character */

import java.util.*;

public class CharacterTypeCheck_10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Alphabet");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}
/* 
java CharacterTypeCheck_10.java
Enter any character: 0
Digit */
