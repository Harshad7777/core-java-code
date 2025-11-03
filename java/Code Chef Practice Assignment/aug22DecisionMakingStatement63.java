
/*---------------------------------------------- 6 problem ------------------------------------------------//
Assignment 6
Problem
There is a group of NN friends who wish to enroll in a course together. The course has a maximum capacity of MM students that can register for it. If there are KK other students who have already enrolled in the course, determine if it will still be possible for all the NN friends to do so or not.
Input Format
•	The first line contains a single integer TT - the number of test cases. Then the test cases follow.
•	Each test case consists of a single line containing three integers NN, MM and KK - the size of the friend group, the capacity of the course and the number of students already registered for the course.
•	Output Format
•	For each test case, output Yes if it will be possible for all the NN friends to register for the course. Otherwise output No.
•	You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical).

Constraints
1<=N<=M <=100
0<=K<=M
Sample1
Input				Output
2	50	27		Yes	
5	40	38		NO
100	100	0		Yes

Explanation:
Test Case 1: The 22 friends can enroll in the course as it has enough seats to accommodate them and the  27  other students at the same time.

Test Case 2: The course does not have enough seats to accommodate the 55 friends and the 3838 other students at the same time.

-------------------------------6 code --------------------------*/
import java.util.*;
public class aug22DecisionMakingStatement63
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);        
        System.out.println("enter students already registered for the course.");
        int Ae = sc.nextInt();

        System.out.println("enter capacity of the course");
        int c = sc.nextInt();

        System.out.println("enter friends who want to enroll in the course");
        int We = sc.nextInt();

          if(c>=Ae+We)
          {
            System.out.println("yes");
          }
          else
          {
              System.out.println("no");
          }
    }
}
/*------------------------- 6output------------------------//
>javac aug22DecisionMakingStatement63.java

>java aug22DecisionMakingStatement63
enter students already registered for the course.      
2
enter capacity of the course
50
enter friends who want to enroll in the course
27
yes



>java aug22DecisionMakingStatement63
enter students already registered for the course.
5
enter capacity of the course
40
enter friends who want to enroll in the course
no



>java aug22DecisionMakingStatement63
enter students already registered for the course.
100
enter capacity of the course
100
enter friends who want to enroll in the course
0
yes



>java aug22DecisionMakingStatement63
enter students already registered for the course.
5
enter capacity of the course
40
enter friends who want to enroll in the course
38
no


>java aug22DecisionMakingStatement63
enter students already registered for the course.
100
enter capacity of the course
100
enter friends who want to enroll in the course
0
yes

*/