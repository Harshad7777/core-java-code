/* 6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.
 */

public class MaxFinder_6
{
	public int findMax(int a,int b,int c)
	{
		if(a>=b && a>=c)
			return a;
		else if(b>=c)
			return b;
		else
			return c;
		
	}
	public static void main (String x[])
	{
		MaxFinder_6 obj = new MaxFinder_6();
		
		System.out.println("max :"+obj.findMax(10,20,30));
	}
	
	}
