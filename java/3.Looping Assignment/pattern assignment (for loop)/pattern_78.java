/* Q78. Write a java program to print this pattern.

A	B	C	D	E	D	C	B	A	
A	B	C	D	  	D	C	B	A	
A	B	C    			C	B	A
A	B     					B	A
A       						A
A	B     					B	A
A	B	C  				C	B	A
A	B	C	D 		D	C	B	A
A	B	C	D	E	D	C	B	A

 */

public class pattern78

   {
    public static void main(String[] args) 
	{
        for (int i = 1; i <= 9; i++) 
		{
			
            for (int j = 1; j <= 9; j++) 
			{
				
                if (j<7-i && j<6 && i<6) 
				{
                   System.out.print(" "+(char)(64+j));
                }
				
				else if (j>=4+i && j>4 && i<6) 
				{
                   System.out.print(" "+(char)(74-j));
                }
				
				else if (j<=i-4 && j<7 && i>4) 
				{
                 System.out.print(" "+(char)(64+j));
                }
				
				else if (j>=14-i && j>=5 && i>=5) 
				{
                   System.out.print(" "+(char)(74-j));
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
