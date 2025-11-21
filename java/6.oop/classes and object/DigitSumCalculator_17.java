/* 17. Calculate Sum of Digits
Create a class DigitSumCalculator with a method calculateSum that computes the sum of digits of a number.
Explanation: Practices loops for digit extraction.
 */
public class DigitSumCalculator_17 
{
    public int calculateSum(int n) 
	{
        int sum = 0;
        while (n > 0) 
		{
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) 
	{
        DigitSumCalculator_17 obj = new DigitSumCalculator_17();
		
        System.out.println("Sum of digits: " + obj.calculateSum(987));
    }
}

/* java DigitSumCalculator_17.java
Sum of digits: 24 */