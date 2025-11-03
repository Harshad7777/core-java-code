/* Q77. Write a java program to print this pattern.

A 	B 	C 	D
A     		D
A			D
A	B	C	D	
 */

public class pattern77

   {
    public static void main(String[] args) 
	{
        for (int i = 1; i <= 4; i++) 
		{
			
            for (int j = 1; j <= 4; j++) 
			{
				
                if (j==1 || j==4 || i==1 || i==4) 
				{
                   System.out.print(" "+(char)(64 + j));
                }
				else
				{
					 System.out.print("  ");
				}
            }
            System.out.println();
        }
    }
}
