/* Q79. Write a java program to print this pattern.

A
B	C
C		D
D			E
E	F	G	H	I
 */
 
public class pattern79

   {
    public static void main(String[] args) 
	{
		char ch = 'A';
        for (int i = 1; i <= 5; i++) 
		{
			
            for (int j = 1; j <= 5; j++) 
			{
                if (j == 1 ||( i==5 || i==j)) 
				{
				
                   System.out.print(" "+ch++);
				  if(i==j && i>1)
				  {
				--ch;
				  }
				  
                }
				else{
					 System.out.print("  ");
				}
            }
            System.out.println();
        }
    }
}
