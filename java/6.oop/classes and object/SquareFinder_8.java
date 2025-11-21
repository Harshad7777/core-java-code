/* 8. Find Square of a Number
Create a class SquareFinder with a method square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods. */


public class SquareFinder_8
{
	public int Square(int n)
	{
		return n*n;
	}
	
	public static void main(String x[])
	{
		SquareFinder_8 obj = new SquareFinder_8();
		
		System.out.println("square : "+obj.Square(7));
	}
}


/* java SquareFinder_8.java
square : 49 */
