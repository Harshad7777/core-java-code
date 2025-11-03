/*
Today’s ( 03/09/2025 ) Practical Assignment : 
===========================================================

Q1. Write a java program to print this pattern.

	*	*	*	*	*
	*			*
	*		*
	*	*
	*

*/

public class pattern7
{
	public static void main(String x[])
	{
		int i,j;
		for (i=1; i<=5; i++ )
		{
			for(j=1; j<=5; j++)
			{
				if(i==1 ||j==1 || j==6-i )
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
/*
C:\Users\harsh\Downloads\java course notes\java\3.Looping Assignment\pattern assignment (for loop)>java pattern7
*****
*  *
* *
**
*

*/