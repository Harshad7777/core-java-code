/* Q82. Write a java program to print this pattern.


         1    
		A B   
	   2   3  
      B	    C
     4 5 6 7 8
	 
 */	  
public class pattern82
{
    public static void main(String x[]) 
	{
        int count = 1;
		char ch = 'A';
		boolean flag = true;

		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(((j==6-i || j==4+i || i==5) && i<=5) && flag)
					{
						if(i%2==1)
						{
						System.out.print(count+"");
						count++;
						}
						else
						{
							if (i==4 && j==2)
							{
								System.out.print(--ch);
							}
							else if(i==4 && j==8)
							{ ++ch;
							System.out.print(ch);
						   
							}
						
							else
							{
							System.out.print(""+ch);
						    ch++;
							}
					
						}
						
						flag = false;
					}
					
					else
					{
						System.out.print(" ");
						flag = true;
					}
			}
		   System.out.println(" ");
		} 
    }
}