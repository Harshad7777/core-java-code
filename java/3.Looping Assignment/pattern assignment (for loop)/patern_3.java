/*
Q3. Write a java program to print this pattern.

	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
	*	#	*	#	*
	
*/

public class patern3
{
	public static void main (String x[])
	{
		
		for (int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j%2==0)
				{
					System.out.print("\t#");
				}
				else
				{
					System.out.print("\t*");  //space
				}
			}
			System.out.print("\n");  //new line
		}
	}
}	


/*
>javac patern3.java

>java patern3
        *       #       *       #       *
        *       #       *       #       *
        *       #       *       #       *
        *       #       *       #       *
        *       #       *       #       *

*/

