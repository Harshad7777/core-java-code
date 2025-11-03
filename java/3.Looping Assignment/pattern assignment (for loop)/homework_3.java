/*
03-09-2025 Homework Assignment : 
===========================================================

Q1. Write a java program to print this pattern.

	*						*
	*	*				*	*
	*		*		*		*
	*			*			*
	*		*		*		*
	*	*				*	*
	*						*
	

/
public class homework3
{
    public static void main(String x[]) 
	{
		int i, j;
        for ( i = 1; i<=7; i++) 
		{
            for ( j = 1; j <=7; j++) 
			{
                if (j==7 || j==1 || i==j || (j==8-i)) 
				{   
                    System.out.print("\t*");
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
*/
/*
Q2. Write a java program to print this pattern.

	*	*	*	*	*
	*			*	*
	*		*		*
	*	*			*
	*	*	*	*	*
	


public class homework3
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if( j==1 || j==5 || i==1 || i==5 || j==6-i )
				{
					System.out.print("\t*");
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
*/

/*
Q3. Write a java program to print this pattern.

	*	*	*	*	*
	  *	          *
		*       *
		  *   *
			*  
			
*/		
/*
public class homework3
{
	public static void main(String x[])
	{
		boolean flag = true;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if((i==1 || j==i || j==10-i) && flag)
				{
					System.out.print("*  ");
					flag = false;
				}
				else
				{
					System.out.print("   ");
					flag = true;
				}	
			}
			System.out.println();
		}
	}
}
*/
/*
public class homework3
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if((i==1 && j%2==1 || i==j) || ( j>5 && (j==10-i )))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		 System.out.println();
		}
	}
}	
*/

/*
Q4. Write a java program to print this pattern.

			*
		  *   *
		*	*	*
	  *  *    *   *
	*	*	*	*	*
	
*/	

/*
public class homework3
{
	public static void main(String x[])
	{
		boolean flag = true;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if((j>=6-i && j<=4+i) && flag)
				{
					System.out.print("* ");
					flag = false;
				}
				else
				{
					System.out.print("  ");
					flag = true;
				}
			}
			System.out.println();
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
	#	*	#	*
	#	*	#	
	#	*
	#
*/

/*
public class homework3 
{
    public static void main(String x[] ) 
	{
        for (int i = 1; i <= 9; i++) 
		{
			for(int j=1; j <= 5; j++)
			{
            if(j<=i && i<=5)
			{
                System.out.print(j%2==1 ? "#":"*");
            }
			else if(j<=10-i && i>=6)
            {
                System.out.print(j%2==0 ? "*":"#");
            }
			else
			{
			  System.out.print("   ");
			}
		}
        System.out.println();
        }
    }
}
*/
/*

if (j<=i && j<=10-i && j%2==1)
	#
else if (j%2==0 && j<=i && j<=10-i)
	*
else
{
	("   ")
}

*/

