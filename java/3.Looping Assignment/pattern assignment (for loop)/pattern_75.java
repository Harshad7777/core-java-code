/* Q75. Write a java program to print this pattern.

A
1	2	1
A	B	C	B	A
1	2	3	4	3	2	1
A	B	C	D	E	D	C	B	A
 */

public class pattern75
   {
    public static void main(String x[] ) 
	{
        for (int i = 1; i <= 9; i++) 
		{
			char ch ='A';
            for (int j = 1; j <= 9; j++) 
			{
				if (j>=6-i && j<6 && i<6)
				{
                   System.out.print("\t"+ch++);
                }
				 else if (j>=4+i && j>5 && i<6) 
				{
                   System.out.print(" "+(--ch));
                }
				else
				{
					 System.out.print("\t");
				}
            }
            System.out.println();
        }
    }
} 
