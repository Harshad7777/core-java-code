/*
Q2. Write a java program to print this pattern.
		

*  *  *  *  *  *  *  *  *
   *  *  *  *  *  *  *
      *  *  *  *  *
	     *  *  *
		    *
		 
		 
*/
		 
		 
public class pattern5
{
    public static void main(String x[] ) 
	{
        int i, j;
        for (i = 1; i <= 5; i++) 
		{ // rows
            for (j = 1; j <= 9; j++) 
			{ // columns
		
                if (i<=j && i+j<=10) 
				{ 
                    System.out.print(" * ");
                } else 
				
				{
                    System.out.print("   ");
                }
            }
            System.out.println(); // new line
        }
    }
}