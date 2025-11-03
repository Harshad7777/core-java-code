/*
Q56. Write a Java expression using arithmetic and assignment operators to calculate net salary if:
basicSalary = 35000
taxRate = 12%
 Find netSalary.
 */
 
 import java.util.*;
 public class netSalary_56
 {
	 public static void main (String x[])
	 {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println ("enter basic salary");
		int salary = sc.nextInt();
		
		int tax = 12;
		int taxamt = salary*tax/100;
		int netSalary = salary - salary*tax/100;
		
		System.out.println("after applying net salary is "+netSalary);
		System.out.println("tax is " +taxamt);
	 }
 }
 
>javac netSalary56.java
>java netSalary56
enter basic salary
35000
after applying net salary is 30800
tax is 4200
 