/*  Q1. Write a java program to find a maximum between three numbers. */

 import java.util.*;
 public class maxBetweenThreeNumbers_1
 {
	 public static void main(String x[])
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("enter first num:");
		 int num1= sc.nextInt();
		 
		 System.out.print("enter second num:");
		 int num2= sc.nextInt();
		 
		 System.out.print("enter third num:");
		 int num3= sc.nextInt();
		 
		 int max;
		 
		 if(num1>=num2 && num1>=num3)
			 max = num1;
		 else if(num2>=num1 && num2>=num3)
			 max = num2;
		 else
			 max = num3;
		 System.out.println("the max num is "+max);
	 }
 }
 
/* java maxBetweenThreeNumbers_1.java
enter first num:10
enter second num:20
enter third num:30
the max num is 30 */