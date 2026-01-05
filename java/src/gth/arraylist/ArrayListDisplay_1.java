

//Q1. Create an ArrayList of integers. Add 5 numbers and display all elements using a loop.
//Explanation:
//	This helps you understand:
//How to declare an ArrayList
//How to add elements using add()
//How to traverse an ArrayList using for loop

package gth.arraylist;
import java.util.ArrayList;

public class ArrayListDisplay_1 
{
 public static void main(String x[]) 
 {
     // step 1: Declare an ArrayList of integers
     ArrayList<Integer> list = new ArrayList<>();

     // step 2: Add 5 numbers to the ArrayList
     list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);
     list.add(50);

     // step 3: Display all elements using a loop
     for (int i = 0; i < list.size(); i++) 
         {
             System.out.println(list.get(i));
         }
 }
}

//10
//20
//30
//40
//50

