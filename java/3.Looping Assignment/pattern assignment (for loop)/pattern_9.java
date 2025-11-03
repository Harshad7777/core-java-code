/*
Q3. Write a java program to print this pattern.

	*	*	*	*	*	*	
      *   *	 *    *   *        
		*	*	*	*
		   *   *   *
			 *   *
			   *
				  
*/


public class pattern9
{
    public static void main(String x[]) 
	{
      boolean flag = true;

        for (int i = 1; i<= 6; i++) 
		{
            for (int j = 1; j <=11; j++) 
			{
                if (((i<=j && j<=6) || (j>6 && j<=12-i)) && flag) 
				{   
					flag = false;
                    System.out.print(" * ");
                } 
				else 
				{
					flag = true;
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

/*
C:\Users\harsh\Downloads\java course notes\java\3.Looping Assignment\pattern assignment (for loop)>java pattern9.java
 *     *     *     *     *     *
    *     *     *     *     *
       *     *     *     *
          *     *     *
             *     *
                *
				
*/				
