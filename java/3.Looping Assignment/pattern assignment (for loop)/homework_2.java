/*
02-09-2025 Homework Assignment : 
===========================================================

 
Q1. Write a java program to print this pattern.

	#	# 	#	#	#
	*	*	*	*
	#	#	#
	*	*
	#
*/

public class Pattern1 
{
    public static void main(String[] args) 
	{
        int n = 5; // Number of rows
        
        for (int i = n; i >= 1; i--) 
		{
            // Print either # or * depending on row
            char ch = (i % 2 == 1) ? '#' : '*';
            
            for (int j = 1; j <= i; j++) 
			{
                System.out.print(ch + "\t");
            }
            System.out.println();
        }
    }
}


/*
Q2. Write a java program to print this pattern.

*	*	*	*	*
*	*	*	*	#
*	*	*	#	#
*	*	#	#	#
*	#	#	#	#

public class Pattern2 
{
    public static void main(String[] args) 
	{
        int n = 5; // number of rows and columns

        for (int i = 0; i < n; i++) 
		{     // row loop
            for (int j = 0; j < n; j++) 
			{ // column loop
                if (j < n - i) 
				{
                    System.out.print("*\t");
                } else 
				{
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
    }
}


Q3. Write a java program to print this pattern.

			 *******
			 ******
 			 *****
 			 ****
 			 ***
 			 **
 			 *
 			 **
 			 ***
 			 ****
 			 *****
 			 ******
 			 *******
			 
public class Pattern3 
{
    public static void main(String[] args) 
	{
        int n = 7; // Maximum stars in first row

        // Upper part (decreasing stars)
        for (int i = n; i >= 1; i--) 
		{
            for (int j = 1; j <= i; j++) 
			{
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part (increasing stars, starting from 2)
        for (int i = 2; i <= n; i++) 
		{
            for (int j = 1; j <= i; j++) 
			{
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


			 

Q4. Write a java program to print this pattern.

		*	*	*	*	*
		*	#	#	#	*
		*	#	#	#	*
		* 	#	#	#	*
		*	*	*	*	*



public class Pattern4 
{
    public static void main(String[] args) 
	{
        int n = 5; // size of square

        for (int i = 1; i <= n; i++) 
		{        // row loop
            for (int j = 1; j <= n; j++) 
			{    // column loop
                // border condition
                if (i == 1 || i == n || j == 1 || j == n) 
				{
                    System.out.print("*\t");
                } 
				else 
				{
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
    }
}



Q5. Write a java program to print this pattern.

		#	#	#	#	#
		#	#
		#		#
		#			#
		#				#
		
		
public class Pattern5 
		{
    public static void main(String[] args) 
	{
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) 
		{        // row loop
            for (int j = 1; j <= n; j++)
				{    // column loop
                // Print # if it's first column, first row, or diagonal
                if (i == 1 || j == 1 || i == j) 
				{
                    System.out.print("#\t");
                } 
				else 
				{
                    System.out.print("\t"); // space inside
                }
            }
            System.out.println();
        }
    }
}

		
*/		