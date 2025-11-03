/*
01-09-2025 Homework Assignment : 
===========================================================

Q1. Write a java program to print this pattern.

*
**
***
****
*****

*/
/*
public class homework1
{
	public static void main(String x[])
	{
		int i,j;
		
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
			System.out.print("\t");
			}
		System.out.println();
		}
	}
}
*/


/*
Q2. Write a java program to print this pattern.

*****
****
***
**
*

*/
/*

public class homework1
{
	public static void main(String x[])
	{
		int i,j;
		
		for(i=5; i>=1; i--)
		{
			for(j=1; j<=5; j++)
			{
				if(j<=i)
				{
					System.out.print("*");
				}
			System.out.print("\t");
			}
		System.out.println();
		}
	}
}
*/
/*
Q3. Write a java program to print this pattern.

		 *
       * *
     * * *
   * * * *
 * * * * *
 
*/
/*
public class homework1 
{
    public static void main(String  x[] ) 
	{
        int n = 5; 

        for (int i = 1; i <= n; i++) 
		{           
            for (int j = 1; j <= n; j++) 
			{      
                if (j <= n - i) 
				{
                    System.out.print(" ");     
                }
				else 
				{
                    System.out.print("*");     
                }
            }
            System.out.println(); 
        }
    }
}
*/

/*
Q4. Write a java program to print this pattern.

*****
 ****
  ***
   **
    *
*/
/*	
public class homework1 
{
   public static void main(String x[] )
   {
        int n = 5; 

        for (int i = 1; i <= n; i++)
			{        
            for (int j = 1; j <= n; j++) 
			{      
                if (j < i) 
				{
                    System.out.print(" ");     
                } 
				else 
				{
                    System.out.print("*");     
                }
            }
            System.out.println(); // move to next line
        }
    }
}
*/

/*	
Q5. Write a java program to print this pattern.

#
#	*
#	*	#
#	*	#	*
#	*	#	*	#

*/

public class homework1
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=5; i++ )
		{
			for(int j=1; j<=i; j++)
			{
				if(j%2==0)
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




