/*
Q2. Write a java program to print this pattern.

					*
				*		*
			*				*
		*						*
	*	*	*	*	*	*	*	*	*
	
*/		
	
public class pattern8
{
	public static void main(String x[])
	{
		int i,j;
		for (i=1; i<=5; i++ )
		{
			for(j=1; j<=9; j++)
			{   
				if((i==5 || i<=5 &&  j==6-i ) || ( j>5 && j==4+i ))
				//if(i==5 || j==6-i  || (j>5 && j==4+i   ))
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

C:\Users\harsh\Downloads\java course notes\java\3.Looping Assignment\pattern assignment (for loop)>javac pattern8.java

C:\Users\harsh\Downloads\java course notes\java\3.Looping Assignment\pattern assignment (for loop)>java pattern8
                                  
C:\Users\harsh\Downloads\java course notes\java\3.Looping Assignment\pattern assignment (for loop)>javac pattern8.java

C:\Users\harsh\Downloads\java course notes\java\3.Looping Assignment\pattern assignment (for loop)>java pattern8
    *
   * *
  *   *
 *     *
*********

*/

