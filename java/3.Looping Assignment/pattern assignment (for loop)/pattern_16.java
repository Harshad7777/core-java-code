/* Today’s ( 11/09/2025 ) Practical Assignment : 
===========================================================

Q1. Write a java program to print this pattern.

					1	
				2	3	2
			3	4	5	4	3
        4	5	6	7	6	5	4
	5	6	7	8	9	8	7	6	5
 */
 
/* 
public class pattern16
{
	public static void main (String x[])
	{
		int num = 1;
	
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(j<=5)
				{
					if(j>=6-i)
					{
						System.out.print(num);
							num++;
							if(i>2)
								--num;
					} 
					else
					{
						
					System.out.print(" ");
					}
				}
				else
				{
					if(j>=4+i)
				   {
				System.out.print("");
						
				}
				else
				{
					System.out.print("");
				}
				}
				
			}
			System.out.println();
			
		}
	}
}  */
/* 
public class pattern16 
{
    public static void main(String x[]) {
        int n = 5; 

        for (int i = 1; i <= n; i++) {
          
            for (int s = 1; s <= n - i; s++) {
                System.out.print("\t");
            }

            int num = i; 

            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(num + "\t");

                if (j < i) { 
                    num++; 
					
                } else {
                    num--; 
                }
            }
            System.out.println(); 
        }
    }
}

 */