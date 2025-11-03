/*
Q1. Write a java program to print this pattern.

	*
	*	*
	*	*	*
	*
	*	*
	*	*	*
*/

/* 
public class homework4
{
	public static void main(String x[])
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=3; j++)
			{
				if(j<=i && i<=3)
				{
					System.out.print("\t*");
				}
				 else if(j<=i-3 )
				{
					System.out.print("\t*");
				} 
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
} 
*/ 
/*  
public class homework4
{
	public static void main(String x[])
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=3; j++)
			{
				if((i==1 || i==3) || (i==2 && j==2)||(i==5 && j==2))
				{
					System.out.print("*");
				}
				else
				{
					
				}
			}
			System.out.println("");
		}
	}
} */
/*
Q2. Write a java program to print this pattern.
					*
				*		*
			*		*		*
		*		*		*		*
	*		*		*		*		*
		*		*		*		*
			*		*		*
				*		*
					*
*/
/* 
public class homework4
{
	public static void main(String x[])
	{
		boolean flag = true;
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if((j>=6-i && j<=4+i && i<=5 )&& flag)
				{
					System.out.print("*");
					flag = false;
				}
				 else if((j>=i-4 && j<=14-i && i>5)&& flag)
				{
					System.out.print("*");
					flag = false;
				} 
				else
				{
					System.out.print(" ");
					flag = true;
				}
			}
			System.out.println("");
		}
	}
}  
*/
/*

Q3. Write a java program to print this pattern.

	#	*	*	*	#
	*	#	*	#	*
	*	*	#	*	*
	*	#	*	#	*
	#	*	*	*	#
	
*/
/*
 public class homework4
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==j || j==6-i)
				{
					System.out.print("\t#");
				}
				else
				{
					System.out.print("\t*");
				}
			}
			System.out.println("");
		}
	}
}   
*/

/* Q4. Write a java program to print this pattern.

	*	*	*	*	*	*	*
	*	*				*	*
	*		*		*		*
	*			*			*
	*		*		*		*
	*	*				*	*
	*	*	*	*	*	*	*
 */
 /* 
public class homework4
{
	public static void main(String x[])
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if(j==1 || j==7 || i==1 || i==7 || i==j || j==8-i)
				{
					System.out.print("\t*");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println("");
		}
	}
}    
*/
 /* 
Q5. Write a java program to print this pattern.

					*
				#	#
			*	*	*
		#	#	#	#
	*	*	*	*	*
 */
/*  
public class homework4
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j>=6-i && i%2==1)
				{
					System.out.print("*");
				}
				else if (j>=6-i && i%2==0)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			System.out.println("");
		}
	}
}    */

public class homework4
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j>=6-i && i%2==1)
				{
					System.out.print("*");
				}
				else if (j>=6-i && i%2==0)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			System.out.println("");
		}
	}
} 
 






