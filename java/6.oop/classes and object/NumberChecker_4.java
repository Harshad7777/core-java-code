/* 4. Check Even or Odd Create a class NumberChecker with a method isEven that checks if a number is even or odd. Explanation: Focuses on using modulus operator in logic.
 */

public class NumberChecker_4
{
	public void isEven(int n)
	{
		if(n%2 == 0)
		{
			System.out.println(n+ " is even");
		}
			
		else
		{
			System.out.println(n+ " is odd");
		}
		
	}
	
	public static void main(String x[])
	{
		NumberChecker_4 obj = new NumberChecker_4();
		obj.isEven(7);
	}
}