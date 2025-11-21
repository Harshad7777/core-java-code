/* 10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius. */


public class CircleArea_10
{
	public double findArea(double r)
	{
		return 3.14159*r*r;
	}
	public static void main(String x[])
	{
		CircleArea_10 obj = new CircleArea_10();
		
		System.out.println("Area :"+obj.findArea(5));
	}

}
/* 
java CircleArea_10.java
Area :78.53975 */