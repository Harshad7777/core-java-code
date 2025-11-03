/*
Today’s ( 02/09/2025 ) Practical Assignment : 
===========================================================

Q1. Write a java program to print this pattern.
			
			*
		 *  *  *
      *  *  *  *  *
   *  *  *  *  *  *  *
*  *  *  *  *  *  *  *  *


*/

public class pattern4 
{
    public static void main(String x[] ) 
	{
        int i, j;
        for (i = 1; i <= 5; i++) 
		{ // rows
            for (j = 1; j <= 9; j++) 
			{ // columns
		//if (j >= 6 - i && j<=5 || j <= 4 + i && j=<6)
                if (j >= 6 - i &&j <= 4 + i) 
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

class Main {
   static void pattern7(int N)
{
    // This is the outer loop which will loop for the rows.
    for (int i = 0; i < N; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<N-i-1; j++)
        {
            System.out.print(" ");
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*i+1;j++){
            
            System.out.print("*");
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<N-i-1; j++)
        {
            System.out.print(" ");
        }
       

        // As soon as the stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        System.out.println();
    }
}

    public static void main(String[] args) {
        
        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int N = 5;
        pattern7(N);
    }
}
