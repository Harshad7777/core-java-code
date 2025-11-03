/*
Q25. Write a java program to check whether number is palindrome or not. 
*/
import java.util.Scanner;
public class Palindrome_25
{
 public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number: ");
 int num = sc.nextInt();
 
	int first = num%10;
	int last = num / 100; 

 //compare first  and last digit in 3number variable if it come same then it is palindrome
 //last become first
 //fist become last
 //int pal = num%10*100 + ((num/10)%10)*10 + num / 100;
 

 String res = (first == last )? "Palindrome" : "Not - Palindrome";
 System.out.println(res);
 }
}

/* >javac Palindrome.java
>java Palindrome
enter the number:
123
Not - Palindrome

>java Palindrome
enter the number:
121
Palindrome */

