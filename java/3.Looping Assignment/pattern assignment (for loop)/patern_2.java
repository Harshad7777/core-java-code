/*
Q2. Write a java program to print this pattern.

	*	*	*	*	*
	*				*
	*				*
	*				*
	*	*	*	*	*
	
*/


public class patern2 
{
    public static void main(String x[]) 
	{
        for (int i = 1; i <= 5; i++) 
		{      // row loop
            for (int j = 1; j <= 5; j++) 
			{  // column loop
                // Print star for first row, last row, first column, last column
                if (i == 1 || i == 5 || j == 1 || j == 5) 
				{
                    System.out.print("*\t");
                } 
				
				else 
				{
                    System.out.print("\t");
                }
            }
            System.out.println(); // move to next line
        }
    }
}

/*

>javac patern2.java

>java patern2
*       *       *       *       *
*                               *
*                               *
*                               *
*       *       *       *       *

*/

