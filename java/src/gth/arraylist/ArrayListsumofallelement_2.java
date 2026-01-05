//Q2. Create an ArrayList of integers and calculate the sum of all elements.

// Explanation:
// This question practices:
// Iterating over ArrayList
// Performing arithmetic operations
// Using get(index) method

package gth.arraylist;
import java.util.*;
public class ArrayListsumofallelement_2 
{
	public static void main(String x[])
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int sum = 0;
		for(int i=0; i<list.size(); i++)
		{
			sum+= list.get(i);
		}
		System.out.println("sum of all element "+sum);
	}
}
//Sum of all elements: 150


