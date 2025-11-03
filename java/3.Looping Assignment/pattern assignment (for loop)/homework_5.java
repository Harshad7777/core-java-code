/* 05-09-2025 Homework Assignment : 
===========================================================

 Q1. Write a java program to print this pattern.

	5	4	3	2	1
		4	3	2	1
			3	2	1	
				2	1	
					1 
*/
/* 
public class homework5 
{
    public static void main(String x[] ) 
	{int count = 5 ;
		int count1 = 5;
        for (int i = 1; i <= 5; i++) 
		{
			count = count1;
            for (int j = 1; j <= 5; j++) 
			{
				if(j>=i)
				{
					System.out.print(count-- +"\t");
				}
				else
				{
					System.out.print("\t");
				}
            }
			count1--;
            System.out.println();
        }
    }
} */


/* 
Q2. Write a java program to print this pattern.
			
			1
		  1   2
	 	1	2	3
      1   2	  3   4
	1	2	3	4	5 
*/

/* public class homework5 
{
    public static void main(String x[] ) 
	{
        for (int i = 1; i <= 5; i++) 
		{
            for (int s = 1; s <= 5 - i; s++) 
			{
                System.out.print("  "); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "   "); 
            }
            System.out.println();
        }
    }
} *//*  
public class homework5 
{
    public static void main(String x[] ) 
	{
        

        for (int i = 1; i <= 5; i++) 
		{
            for (int j = 1; j <= 5; j++) 
			{
                if (j <= 5 - i) 
				{
                    System.out.print("  "); // print spaces
                } else 
				{
                    System.out.print((j - (5 - i)) + "   "); // print numbers
                }
            }
            System.out.println();
        }
    }
} */


/* Q3. Write a java program to print this pattern.

	1	2	3	4	5	6	7	8	9
		1	2	3	4	5	6	7
			1	2	3	4	5	
				1	2	3
					1 
 */

 /* 
public class homework5 
{
    public static void main(String x[] ) 
	{
        for (int i = 1; i <= 5; i++) 
		{
			int count = 0 ;
            for (int j = 1; j <= 9; j++) 
			{
				if(j>=i && j<=5)
				{
					System.out.print(++count+"\t");
				}
				else if(j<=10-i && j>5)
				{
					System.out.print(++count+"\t");
				}
				else
				{
					System.out.print("\t");
				}
            }
            System.out.println();
        }
    }
} */

/* Q4. Write a java program to print this pattern.
	
	1	*	*	*	*
	2	2	*	*	*
	3	3	3	*	* 
	4	4	4	4	*
	5	5	5	5	5
*/
/*
public class homework5 
{
    public static void main(String x[] ) 
	{
        for (int i = 1; i <= 5; i++) 
		{
            for (int j = 1; j <= 5; j++) 
			{
				if(j<=i)
				{
					System.out.print(i+"\t");
				}				
				else
				{
					System.out.print("*\t");
				}
            }
            System.out.println();
        }
    }
}  */

/* 
Q5. Write a java program to print this pattern.

	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1
 */
 
 /* public class homework5 
 {
    public static void main(String[] args) 
	{
        for (int i = 5; i >= 1; i--) 
		{  
            for (int j = 1; j <= i; j++) {  
                if (j % 2 == 1) 
				{   
                    System.out.print(i + "\t");
                } 
				else 
				{            
                    System.out.print("*\t");
                }
            }
            System.out.println(); 
        }
    }
} */
