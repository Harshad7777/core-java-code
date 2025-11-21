/* 5. Calculate Simple Interest Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time. Explanation: Demonstrates mathematical formula implementation. */

public class simpleInterst_5
{
	public double calculate(double p,double r, double t)
	{
		return(p*r*t)/100;
	}
	
	public static void main (String[] args)
	{
		simpleInterst_5 obj = new simpleInterst_5();
		
		System.out.println("simple intrest :" +obj.calculate(1000, 5 ,2));
	}
}