# Recursion on Array

## Code Links

1. [Q1. Write a Java program to find the second largest number in an array using a function](#q1-write-a-java-program-to-find-the-second-largest-number-in-an-array-using-a-function)
2. [Q2. Write a Java program to count the frequency of each element in an array using a function](#q2-write-a-java-program-to-count-the-frequency-of-each-element-in-an-array-using-a-function)
3. [Q3. Write a Java program to reverse an array using a function](#q3-write-a-java-program-to-reverse-an-array-using-a-function)
4. [Q4. Write a Java program to check if two arrays are equal (same elements in same order) using a function](#q4-write-a-java-program-to-check-if-two-arrays-are-equal-same-elements-in-same-order-using-a-function)
5. [Q5. Write a Java program that finds the sum of even and odd elements in an array using functions](#q5-write-a-java-program-that-finds-the-sum-of-even-and-odd-elements-in-an-array-using-functions)

## Q1. Write a Java program to find the second largest number in an array using a function

Example Input:
- arr = {12, 45, 23, 51, 19, 8}

Output:
- Second Largest: 45

```java
import java.util.*;

public class Q1 {
    public static int show(int a[], int index, int fmax, int smax) {
        if (index == a.length)
            return smax;

        if (a[index] > fmax) {
            smax = fmax;
            fmax = a[index];
        } else {
            if (a[index] != fmax && a[index] > smax) {
                smax = a[index];
            }
        }

        return show(a, index + 1, fmax, smax);
    }

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];

        System.out.print("enter the values in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int res = show(a, 0, 0, 0);
        System.out.print("Second max: " + res);
    }
}
```

## Q2. Write a Java program to count the frequency of each element in an array using a function

Example Input:
- arr = {1, 2, 2, 3, 1, 4, 2}

Output:
- 1 → 2 times
- 2 → 3 times
- 3 → 1 time
- 4 → 1 time

```java
import java.util.*;

public class Q2 {
    public static int show(int a[], int index, int count) {
        if (index == a.length)
            return count;

        for (int k = index; k < a.length; k++) {
            if (a[index] == a[k]) {
                count++;
            }
        }

        System.out.println(a[index] + "-->" + count + " times");
        return show(a, index + 1, 0);
    }

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.print("enter the values in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        show(a, 0, 0);
    }
}
```

## Q3. Write a Java program to reverse an array using a function

Example Input:
- arr = {5, 10, 15, 20, 25}

Output:
- Reversed Array: 25 20 15 10 5

```java
import java.util.*;

public class Q3 {
    public static void show(int a[], int start, int end) {
        if (start >= end)
            return;

        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;

        show(a, start + 1, end - 1);
    }

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.print("enter the values in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        show(a, 0, a.length - 1);

        System.out.print("Reversed Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
```

## Q4. Write a Java program to check if two arrays are equal (same elements in same order) using a function

Example Input:
- a = {1, 2, 3, 4}
- b = {1, 2, 3, 4}

Output:
- Arrays are equal.

```java
import java.util.*;

public class Q4 {
    static int count = 0;

    public static void show(int a[], int b[], int index) {
        if (index == a.length)
            return;

        if (a[index] == b[index]) {
            count++;
        }

        show(a, b, index + 1);
    }

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        int b[] = new int[size];

        System.out.print("enter the values in array 1: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("enter the values in array 2: ");
        for (int i = 0; i < a.length; i++) {
            b[i] = sc.nextInt();
        }

        show(a, b, 0);

        if (count == a.length)
            System.out.print("Arrays are equal");
        else
            System.out.print("Arrays are not equal");
    }
}
```

## Q5. Write a Java program that finds the sum of even and odd elements in an array using functions

Example Input:
- arr = {10, 15, 8, 7, 9, 12}

Output:
- Sum of Even: 30
- Sum of Odd: 31

```java
import java.util.*;

public class Q5 {
    public static void show(int a[], int index, int sumEven, int sumOdd) {
        if (index == a.length) {
            System.out.println("Sum of Even: " + sumEven);
            System.out.println("Sum of Odd: " + sumOdd);
            return;
        }

        if (a[index] % 2 == 0) {
            sumEven += a[index];
        } else {
            sumOdd += a[index];
        }

        show(a, index + 1, sumEven, sumOdd);
    }

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.print("enter the values in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        show(a, 0, 0, 0);
    }
}
```