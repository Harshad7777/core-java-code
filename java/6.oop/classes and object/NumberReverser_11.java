/* 11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.
 */

public class NumberReverser_11
{
	public int reverse(int n)
	{
		int rev = 0;
		while (n>0)
		{
			int d=n%10;
			rev = rev *10+d;
			n= n/10;
		}
		return rev;
	}
	public static void main(String x[])
	{
		NumberReverser_11 obj = new NumberReverser_11();


		System.out.println("Reverse : "+obj.reverse(12345));
	}
}
/* 
java NumberReverser_11.java
Reverse : 54321 */