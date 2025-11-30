/* Practical Assignment Using Pojo Class 
====================================================================

Q1. Problem
Create a POJO class Student with fields rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks  35).
Explanation
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations. */


import java.util.*;

class Student
{
    private int rollNo;
    private String name;
    private int marks[]; // marks of 3 subjects

    public Student(int rollNo, String name, int marks[])
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getTotalMarks()
    {
        int sum = 0;
        for(int m : marks)
        {
            sum += m;
        }
        return sum;
    }

    public float getAverage()
    {
        return getTotalMarks() / 3.0f;
    }

    public boolean isFail()
    {
        for(int m : marks)
        {
            if(m < 35)
                return true;
        }
        return false;
    }

    public void show()
    {
        System.out.print("RollNo: " + rollNo + ", Name: " + name + ", Marks: ");
        for(int m : marks)
        {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}

public class StudentApp_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student students[] = new Student[5];

        // Accept 5 students
        for(int i = 0; i < 5; i++)
        {
            System.out.println("\nEnter details for Student " + (i+1) + ":");
            System.out.print("Roll No: ");
            int r = sc.nextInt();

            System.out.print("Name: ");
            String n = sc.next();

            int m[] = new int[3];
            System.out.println("Enter 3 subject marks:");
            for(int j = 0; j < 3; j++)
            {
                m[j] = sc.nextInt();
            }
            students[i] = new Student(r, n, m);
        }

        // 1️⃣ Total marks of each student
        System.out.println("\n--- Total Marks of Each Student ---");
        for(Student s : students)
        {
            s.show();
            System.out.println("Total Marks: " + s.getTotalMarks());
            System.out.println();
        }

        // 2️⃣ Student with highest average
        Student top = students[0];
        for(int i = 1; i < students.length; i++)
        {
            if(students[i].getAverage() > top.getAverage())
                top = students[i];
        }

        System.out.println("\n--- Student with Highest Average ---");
        top.show();
        System.out.println("Average Marks: " + top.getAverage());

        // 3️⃣ Students who failed
        System.out.println("\n--- Students Who Failed in Any Subject (<35) ---");
        boolean foundFail = false;
        for(Student s : students)
        {
            if(s.isFail())
            {
                s.show();
                foundFail = true;
            }
        }

        if(!foundFail)
            System.out.println("No student failed.");
    }
}
/* 
java StudentApp_1.java

Enter details for Student 1:
Roll No: 1
Name: harshad
Enter 3 subject marks:
10 10 10

Enter details for Student 2:
Roll No: 2
Name: sahil
Enter 3 subject marks:
10 20 20

Enter details for Student 3:
Roll No: 3
Name: rakshe
Enter 3 subject marks:
3 1 2

Enter details for Student 4:
Roll No: 4
Name: soham
Enter 3 subject marks:
4 2 5

Enter details for Student 5:
Roll No: 5
Name: don
Enter 3 subject marks:
5 2 4

--- Total Marks of Each Student ---
RollNo: 1, Name: harshad, Marks: 10 10 10
Total Marks: 30

RollNo: 2, Name: sahil, Marks: 10 20 20
Total Marks: 50

RollNo: 3, Name: rakshe, Marks: 3 1 2
Total Marks: 6

RollNo: 4, Name: soham, Marks: 4 2 5
Total Marks: 11

RollNo: 5, Name: don, Marks: 5 2 4
Total Marks: 11


--- Student with Highest Average ---
RollNo: 2, Name: sahil, Marks: 10 20 20
Average Marks: 16.666666

--- Students Who Failed in Any Subject (<35) ---
RollNo: 1, Name: harshad, Marks: 10 10 10
RollNo: 2, Name: sahil, Marks: 10 20 20
RollNo: 3, Name: rakshe, Marks: 3 1 2
RollNo: 4, Name: soham, Marks: 4 2 5
RollNo: 5, Name: don, Marks: 5 2 4
 */