/* Q81. Write a java program to print this pattern.

A	B	C	D	E	D	C	B	A
A								A
A								A
A								A
A								A
 */
  
public class pattern81

   {
    public static void main(String[] args) 
	{
        for (int i = 1; i <= 5; i++) 
		{
            for (int j = 1; j <= 9; j++) 
			{
                if (i == 1) 
				{
                    if (j <= 5) 
					{
                        System.out.print((char)('A' + j - 1) + "\t");
                    } 
					else 
					{
                        System.out.print((char)('A' +  9 - j) + "\t");
                    }
                }
				else 
				{
                    if (j == 1 || j == 9) 
					{
                        System.out.print("A\t");
                    } else {
                        System.out.print(" \t");
                    }
                }
            }
            System.out.println();
        }
    }
}
