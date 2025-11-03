/* 

Q32. Write a java program to display 1 to nth Strong Number.

 */
import java.util.*;
public class display1tonthStrongNumber_32
{
	 public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" enter number");
		int num = sc.nextInt(); 
		
	for(int i=1; i<=num; i++)
		{
			int sum=0;
			int temp = i;
			int n = temp; //145
		
			
			while(n!=0)
			{	
				int rem = n % 10; //5,4,1
				
				
				int f = 1;
				while(rem!=0)
				{
					f=f*rem;
					rem--;
				}
				/* 
				int f = 1;
				for (int j=1; j<=rem; j++) 
				{
					f*=j;				
				}
				 */
				sum+=f;
			
				n/=10;
				
			}
				if(sum==temp)
				{
					System.out.println(temp +" ");
				}
		}
		
	}	
}

/* >java display1tonthStrongNumber32
 enter number
500
1
2
145		 */
