# Recursion Loop

## Code Links

1. [Q1. Write a Java program to print all natural numbers from 1 to n using recursion](#q1-write-a-java-program-to-print-all-natural-numbers-from-1-to-n-using-recursion)
2. [Q2. Write a Java program to count the number of digits in a number](#q2-write-a-java-program-to-count-the-number-of-digits-in-a-number)
3. [Q3. Write a Java program to calculate the sum of digits in a number](#q3-write-a-java-program-to-calculate-the-sum-of-digits-in-a-number)
4. [Q4. Write a Java program to calculate the product of digits in a number](#q4-write-a-java-program-to-calculate-the-product-of-digits-in-a-number)
5. [Q5. Write a Java program to enter a number and print its reverse](#q5-write-a-java-program-to-enter-a-number-and-print-its-reverse)
6. [Q6. Write a Java program to check whether a number is palindrome or not](#q6-write-a-java-program-to-check-whether-a-number-is-palindrome-or-not)
7. [Q7. Write a Java program to print all ASCII characters with their values](#q7-write-a-java-program-to-print-all-ascii-characters-with-their-values)
8. [Q8. Write a Java program to find power of a number](#q8-write-a-java-program-to-find-power-of-a-number)
9. [Q9. Write a Java program to find all factors of a number](#q9-write-a-java-program-to-find-all-factors-of-a-number)
10. [Q10. Write a Java program to find the first and last digit of a number](#q10-write-a-java-program-to-find-the-first-and-last-digit-of-a-number)
11. [Q11. Write a Java program to find the sum of the first and last digit of a number](#q11-write-a-java-program-to-find-the-sum-of-the-first-and-last-digit-of-a-number)
12. [Q12. Write a Java program to swap first and last digits of a number](#q12-write-a-java-program-to-swap-first-and-last-digits-of-a-number)
13. [Q13. Write a Java program to check Number Is Prime Number or Not](#q13-write-a-java-program-to-check-number-is-prime-number-or-not)
14. [Q14. Write a Java program to Check Number Is Perfect Number or Not](#q14-write-a-java-program-to-check-number-is-perfect-number-or-not)
15. [Q15. Write a Java program to Check Number Is Duck Number or Not](#q15-write-a-java-program-to-check-number-is-duck-number-or-not)
16. [Q16. Check Number is Strong Number or Not using Recursion](#q16-check-number-is-strong-number-or-not-using-recursion)
17. [Q17. Write a Java program to Check Number Is Armstrong Number or Not](#q17-write-a-java-program-to-check-number-is-armstrong-number-or-not)
18. [Q18. Write a Java program to Check Number Is Neon Number or Not](#q18-write-a-java-program-to-check-number-is-neon-number-or-not)
19. [Q19. Write a Java program to Check Number Is Spy Number or Not](#q19-write-a-java-program-to-check-number-is-spy-number-or-not)
20. [Q20. Write a Java program to display 1 to nth Prime Number](#q20-write-a-java-program-to-display-1-to-nth-prime-number)
21. [Q21. Write a Java program to print all alphabets from a to z using recursion](#q21-write-a-java-program-to-print-all-alphabets-from-a-to-z-using-recursion)
22. [Q22. Write a Java program to print all even numbers between 1 to 100 using recursion](#q22-write-a-java-program-to-print-all-even-numbers-between-1-to-100-using-recursion)
23. [Q23. Write a Java program to print all odd numbers between 1 to 100](#q23-write-a-java-program-to-print-all-odd-numbers-between-1-to-100)
24. [Q24. Write a Java program to find the sum of all natural numbers between 1 to n](#q24-write-a-java-program-to-find-the-sum-of-all-natural-numbers-between-1-to-n)
25. [Q25. Write a Java program to find the sum of all even numbers between 1 to n](#q25-write-a-java-program-to-find-the-sum-of-all-even-numbers-between-1-to-n)
26. [Q26. Write a Java program to find the sum of all odd numbers between 1 to n](#q26-write-a-java-program-to-find-the-sum-of-all-odd-numbers-between-1-to-n)
27. [Q27. Write a Java program to print a multiplication table of any number](#q27-write-a-java-program-to-print-a-multiplication-table-of-any-number)

## Q1. Write a Java program to print all natural numbers from 1 to n using recursion

```java
import java.util.*;
public class Q1
{
    public static void show(int i, int n)
    {
        if(i>n)
            return;

        System.out.print(i + " ");
        show(i + 1, n);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        show(1, n);
    }
}
```

## Q2. Write a Java program to count the number of digits in a number.

```java
import java.util.*;
public class Q10
{
    public static int show(int n)
    {
        if(n==0)
            return 0;

        return 1 + show(n/10);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        if (n == 0)
            System.out.println("Count: 1");
        else
        {
            int res = show(n);
            System.out.println("Count: "+res);
        }
    }
}
```

## Q3. Write a Java program to calculate the sum of digits in a number.

```java
import java.util.*;
public class Q11
{
    public static int show(int n)
    {
        if(n==0)
            return 0;

        int rem = n%10;
        return rem + show(n/10);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        int res = show(n);
        System.out.print("sum of digits in number: "+res);
    }
}
```

## Q4. Write a Java program to calculate the product of digits in a number.

```java
import java.util.*;
public class Q12
{
    public static int show(int n)
    {
        if(n==0)
            return 1;

        int rem = n%10;
        return rem * show(n/10);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        int res = show(n);
        System.out.print("product of digits in number: "+res);
    }
}
```

## Q5. Write a Java program to enter a number and print its reverse.

```java
import java.util.*;
public class Q13
{
    public static int show(int rev, int n)
    {
        if(n==0)
            return rev;

        int rem = n%10;
        rev = rev*10+rem;
        return show(rev, n/10);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int res = show(0, n);
        System.out.print("Reverse Number: "+res);
    }
}
```

## Q6. Write a Java program to check whether a number is palindrome or not.

```java
import java.util.*;
public class Q14
{
    public static int show(int rev, int n)
    {
        if(n==0)
            return rev;

        int rem = n%10;
        rev = rev*10+rem;
        return show(rev, n/10);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int res = show(0, n);

        if(res==n)
            System.out.print("Palindrom Number");
        else
            System.out.print("Not Palindrom Number");
    }
}
```

## Q7. Write a Java program to print all ASCII characters with their values.

```java
public class Q15
{
    public static void show(char ch, int n)
    {
        if(ch>255)
            return;

        System.out.println(n+"-->"+ch);
        n++;
        show((char)(ch+1), n);
    }

    public static void main(String x[])
    {
        show((char)1, 1);
    }
}
```

## Q8. Write a Java program to find power of a number.

```java
import java.util.*;
public class Q16
{
    public static int show(int n, int p)
    {
        if(p==1)
            return n;

        return n * show(n, p-1);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        System.out.print("enter the power: ");
        int p = sc.nextInt();

        int res = show(n,p);
        System.out.print("Power of Number: "+res);
    }
}
```

## Q9. Write a Java program to find all factors of a number.

```java
import java.util.*;
public class Q17
{
    public static int show(int n, int i)
    {
        if(i==n)
            return i;

        if(n%i==0)
            System.out.print(i+" ");
        return show(n, i+1);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        System.out.print("Factors: ");
        show(n, 1);
    }
}
```

## Q10. Write a Java program to find the first and last digit of a number.

```java
import java.util.*;
public class Q18
{
    public static int show(int n)
    {
        if(n<10)
            return n;
        return show(n/10);

    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int last=n%10;
        int res = show(n);
        System.out.print("First: "+res+"\tLast: "+last);
    }
}
```

## Q11. Write a Java program to find the sum of the first and last digit of a number.

```java
import java.util.*;
public class Q19
{
    public static int show(int n)
    {
        if(n<10)
            return n;
        return show(n/10);

    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int last=n%10;
        int res = show(n);
        System.out.print("Sum of First and Last Digit: "+(res+last));
    }
}
```

## Q12. Write a Java program to swap first and last digits of a number.

```java
import java.util.*;
public class Q20
{
    public static int show(int n)
    {
        if(n<10)
            return n;
        return show(n/10);

    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();//12345
        int temp=n;
        int last=n%10;
        int first = show(n);
        int count=0;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        int p=1;
        for(int i=1; i<count; i++)
        {
            p=p*10;
        }
        int firstDigit=temp/p;
        int mid = temp%p;
        mid = mid/10;

        int ans = last*p+mid*10+firstDigit;
        System.out.print("Swap Number: "+ans);
    }
}
```

## Q13. Write a Java program to check Number Is Prime Number or Not.

```java
import java.util.*;
public class Q21
{
    public static int show(int n, int i, int count)
    {
        if(i>n)
            return count;

        if(n%i==0)
            count++;

        return show(n, i+1, count);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int res = show(n, 1, 0);

        if(n<1)
            System.out.print("Not Prime Number");
        else if(res==2)
            System.out.print("Prime Number");
        else
            System.out.print("Not Prime Number");
    }
}
```

## Q14. Write a Java program to Check Number Is Perfect Number or Not.

```java
import java.util.*;
public class Q22
{
    public static int show(int n, int i, int sum)
    {
        if(i>=n)
            return sum;

        if(n%i==0)
            sum+=i;

        return show(n, i+1, sum);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int res = show(n, 1, 0);

        if(n<1)
            System.out.print("Not Perfect Number");
        else if(n==res)
            System.out.print("Perfect Number");
        else
            System.out.print("Not Perfect Number");
    }
}
```

## Q15. Write a Java program to Check Number Is Duck Number or Not.

```java
import java.util.*;
public class Q23
{
    public static boolean show(int n)
    {
        if(n==0)
            return false;

        int rem = n%10;
        if(rem==0)
            return true;

        return show(n/10);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        if (String.valueOf(n).charAt(0) == '0') {
            System.out.println("Not Duck Number");
            return;
        }

        if(show(n))
            System.out.print("Duck Number");
        else
            System.out.print("Not Duck Number");
    }
}
```

## Q16. Check Number is Strong Number or Not using Recursion

```java
import java.util.*;
public class Q24
{
    public static int fact(int n)
    {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static int show(int n)
    {
        if (n == 0)
            return 0;

        int rem = n % 10;
        return fact(rem) + show(n / 10);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = show(n);

        if (sum == n)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}
```

## Q17. Write a Java program to Check Number Is Armstrong Number or Not.

```java
import java.util.*;
public class Q25
{
    public static int power(int base, int index)
    {
        if(index==0)
            return 1;

        return base * power(base, index-1);
    }

    public static int show(int n, int count)
    {
        if (n == 0)
            return 0;

        int rem = n%10;
        return power(rem, count) + show(n / 10, count);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp=n;
        int count=0;
        while(temp!=0)
        {
            count++;
            temp/=10;
        }

        int sum = show(n, count);

        if (sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
```

## Q18. Write a Java program to Check Number Is Neon Number or Not.

```java
import java.util.*;
public class Q26
{
    public static int show(int sq, int sum)
    {
        if(sq==0)
            return sum;

        int rem = sq%10;
        sum +=rem;

        return show(sq/10, sum);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        int sq = n*n;

        int sum = show(sq, 0);

        if(sum==n)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
    }
}
```

## Q19. Write a Java program to Check Number Is Spy Number or Not.

```java
import java.util.*;
public class Q28
{
    public static int show(int n, int sum, int product)
    {
        if(n==0)
        {
            if(sum==product)
                return 1;
            else
                return 0;
        }

        int rem = n%10;
        sum +=rem;
        product *=rem;

        return show(n/10, sum, product);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        int res = show(n, 0, 1);

        if(res==1)
        {
            System.out.print("Spy Number");
        }
        else
        {
            System.out.print("Not Spy Number");
        }
    }
}
```

## Q20. Write a Java program to display 1 to nth Prime Number.

```java
import java.util.*;
public class Q29
{
    public static int checkPrime(int n, int i)
    {
        if (i == n)
            return 1;

        if (n % i == 0)
            return 0;

        return checkPrime(n, i + 1);
    }

    public static void show(int n, int i)
    {
        if (i > n)
            return;

        if (i > 1 && checkPrime(i, 2) == 1)
            System.out.print(i + " ");

        show(n, i + 1);
    }

    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to display: ");
        int n = sc.nextInt();

        show(n, 1);
    }
}
```

## Q21. Write a Java program to print all alphabets from a to z using recursion

```java
public class Q3
{
    public static void show(char ch)
    {
        if(ch>'z')
            return;

        System.out.print(ch+" ");
        show((char)(ch+1));
    }

    public static void main(String x[])
    {
        show('a');
    }
}
```

## Q22. Write a Java program to print all even numbers between 1 to 100 using recursion

```java
public class Q4
{
    public static void show(int i)
    {
        if(i>100)
            return ;

        System.out.print(i+" ");
        show(i+2);
    }

    public static void main(String x[])
    {
        show(2);
    }
}
```

## Q23. Write a Java program to print all odd numbers between 1 to 100.

```java
public class Q5
{
    public static void show(int i)
    {
        if(i>100)
            return ;

        System.out.print(i+" ");
        show(i+2);
    }
    public static void main(String x[])
    {
        show(1);
    }
}
```

## Q24. Write a Java program to find the sum of all natural numbers between 1 to n.

```java
import java.util.*;
public class Q6
{
    public static int show(int i, int n)
    {
        if(i>n)
            return 0;

        return i + show(i+1, n);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        int res = show(1, n);
        System.out.print("Sum: "+res);
    }
}
```

## Q25. Write a Java program to find the sum of all even numbers between 1 to n.

```java
import java.util.*;
public class Q7
{
    public static int show(int i, int n)
    {
        if(i>n)
            return 0;

        return i + show(i+2, n);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        int res = show(2, n);
        System.out.print("Sum: "+res);
    }
}
```

## Q26. Write a Java program to find the sum of all odd numbers between 1 to n.

```java
import java.util.*;
public class Q8
{
    public static int show(int i, int n)
    {
        if(i>n)
            return 0;

        return i + show(i+2, n);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        int res = show(1, n);
        System.out.print("Sum: "+res);
    }
}
```

## Q27. Write a Java program to print a multiplication table of any number.

```java
import java.util.*;
public class Q9
{
    public static void show(int i, int n)
    {
        if(i>10)
            return ;

        System.out.println(n+" x "+i+" = "+(n*i));
        show(i+1, n);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        show(1, n);
    }
}
```

//Q16. Write a java program to find power of a number.


import java.util.*;
public class Q16
{
	public static int show(int n, int p)
	{
		if(p==1)
			return n;

		return n * show(n, p-1);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		System.out.print("enter the power: ");
		int p = sc.nextInt();
		
		int res = show(n,p);
		System.out.print("Power of Number: "+res);
	}
}

//Q16. Write a java program to find power of a number.


import java.util.*;
public class Q16
{
	public static int show(int n, int p)
	{
		if(p==1)
			return n;

		return n * show(n, p-1);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		System.out.print("enter the power: ");
		int p = sc.nextInt();
		
		int res = show(n,p);
		System.out.print("Power of Number: "+res);
	}
}

//Q17. Write a java program to find all factors of a number.


import java.util.*;
public class Q17
{
	public static int show(int n, int i)
	{
		if(i==n)
			return i;
		
		if(n%i==0)
			System.out.print(i+" ");
		return show(n, i+1);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		System.out.print("Factors: ");
		show(n, 1);
	}
}

//Q18. Write a java program to find the first and last digit of a number.


import java.util.*;
public class Q18
{
	public static int show(int n)
	{
		if(n<10)
			return n;
		return show(n/10);
	
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int last=n%10;
		int res = show(n);
		System.out.print("First: "+res+"\tLast: "+last);
	}
}

//Q19. Write a java program to find the sum of the first and last digit of a number.



import java.util.*;
public class Q19
{
	public static int show(int n)
	{
		if(n<10)
			return n;
		return show(n/10);
	
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int last=n%10;
		int res = show(n);
		System.out.print("Sum of First and Last Digit: "+(res+last));
	}
}

//Q20. Write a java program to swap first and last digits of a number.


import java.util.*;
public class Q20
{
	public static int show(int n)
	{
		if(n<10)
			return n;
		return show(n/10);
	
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();//12345
		int temp=n;
		int last=n%10;
		int first = show(n);
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		int p=1;
		for(int i=1; i<count; i++)
		{
			p=p*10;
		}
		int first=temp/p;
		int mid = temp%p; 
		mid = mid/10;
		
		int ans = last*p+mid*10+first;
		System.out.print("Swap Number: "+ans);
	}
}

//Q21.  Write a java program to check Number Is Prime Number or Not.


import java.util.*;
public class Q21
{
	public static int show(int n, int i, int count)
	{
		if(i>n)
			return count;
		
		if(n%i==0)
		 count++;
		
		return show(n, i+1, count);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int res = show(n, 1, 0);
		
		
		if(n<1)
			System.out.print("Not Prime Number");
		else if(res==2)
			System.out.print("Prime Number");
		else
			System.out.print("Not Prime Number");
		
	}
}

//Q22. Write a java program to Check Number Is Perfect Number or Not.


import java.util.*;
public class Q22
{
	public static int show(int n, int i, int sum)
	{
		if(i>=n)
			return sum;
		
		if(n%i==0)
		 sum+=i;
		
		return show(n, i+1, sum);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int res = show(n, 1, 0);
		
		if(n<1)
			System.out.print("Not Perfect Number");
		else if(n==res)
			System.out.print("Perfect Number");
		else
			System.out.print("Not Perfect Number");
		
	}
}

//Q23. Write a java program to Check Number Is Duck Number or Not.


import java.util.*;
public class Q23
{

	public static boolean show(int n)
	{
		if(n==0)
			return false;
	
	
		int rem = n%10;
		if(rem==0)
			return true;
		
		
		return show(n/10);
		
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		if (String.valueOf(n).charAt(0) == '0') {
            System.out.println("Not Duck Number");
            return;
        }

		
		if(show(n))
			System.out.print("Duck Number");
		else
			System.out.print("Not Duck Number");
		
	}
}

// Q24. Check Number is Strong Number or Not using Recursion


import java.util.*;
public class Q24
{
    public static int fact(int n)
    {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static int show(int n)
    {
        if (n == 0)
            return 0;

        int rem = n % 10;                 
        return fact(rem) + show(n / 10);
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = show(n);

        if (sum == n)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}

//Q25. Write a java program to Check Number Is Armstrong Number or Not.


import java.util.*;
public class Q25
{
	public static int power(int base, int index)
	{
		if(index==0)
			return 1;
		
		return base * power(base, index-1);
	}
	
	
    public static int show(int n, int count)
    {
        if (n == 0)
            return 0;
		
		int rem = n%10;
		return power(rem, count) + show(n / 10, count);
			
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
		
		int temp=n;
		int count=0;
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		
        int sum = show(n, count);

        if (sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}


//Q26. Write a java program to Check Number Is Neon Number or Not.


import java.util.*;
public class Q26
{
	public static int show(int sq, int sum)
	{
		if(sq==0)
			return sum;
		
		int rem = sq%10;
		sum +=rem;
		
		return show(sq/10, sum);
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int sq = n*n;
		
		int sum = show(sq, 0);
	
		if(sum==n)
		{
			System.out.print("Neon Number");
		}
		else
		{
			System.out.print("Not Neon Number");
		}
	}
}

//Q28. Write a java program to Check Number Is Spy Number or Not.


import java.util.*;
public class Q28
{
	public static int show(int n, int sum, int product)
	{
		if(n==0)
		{
			if(sum==product)
			return 1;
			else
			return 0;
		}
			
		int rem = n%10;
		sum +=rem;
		product *=rem;
			
		return show(n/10, sum, product);
			
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();//1412
		
		int res = show(n, 0, 1);
		
		if(res==1)
		{
			System.out.print("Spy Number");
		}
		else
		{
			System.out.print("Not Spy Number");
		}
	}
}

//Q29. Write a java program to display 1 to nth Prime Number.

import java.util.*;
public class Q29
{
    public static int checkPrime(int n, int i)
    {
        if (i == n)
            return 1;

        if (n % i == 0)
            return 0;

        return checkPrime(n, i + 1);
    }

    public static void show(int n, int i)
    {
        if (i > n)
            return;

        if (i > 1 && checkPrime(i, 2) == 1)
            System.out.print(i + " ");

        show(n, i + 1);
    }

    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to display: ");
        int n = sc.nextInt();

        show(n, 1);
    }
}

//Q3. Write a java program to print all alphabets from a to z. - using recurison


public class Q3
{
	public static void show(char ch)
	{
		if(ch>'z')
			return;
		
		System.out.print(ch+" ");
		show((char)(ch+1));
	}

	public static void main(String x[])
	{
		show('a');
	}
}

//Q4. Write a java program to print all even numbers between 1 to 100.- using recurion


public class Q4
{
	public static void show(int i)
	{
		if(i>100)
		 return ;
		
		System.out.print(i+" ");
		show(i+2);
	}

	public static void main(String x[])
	{
		show(2);
	}
}

//Q5. Write a java program to print all odd numbers between 1 to 100.


public class Q5
{
	public static void show(int i)
	{
		if(i>100)
		 return ;
		
		System.out.print(i+" ");
		show(i+2);
	}
	public static void main(String x[])
	{
		show(1);
	}
}


//Q6. Write a java program to find the sum of all natural numbers between 1 to n.


import java.util.*;
public class Q6
{
	public static int show(int i, int n)
	{
		if(i>n)
		 return 0;
		
		return i + show(i+1, n);
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int res = show(1, n);
		System.out.print("Sum: "+res);
		
	}
}

//Q7. Write a java program to find the sum of all even numbers between 1 to n.


import java.util.*;
public class Q7
{
	public static int show(int i, int n)
	{
		if(i>n)
			return 0;
			
		return i + show(i+2, n);
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int res = show(2, n);
		System.out.print("Sum: "+res);
	}
}

//Q8. Write a java program to find the sum of all odd numbers between 1 to n.



import java.util.*;
public class Q8
{
	public static int show(int i, int n)
	{
		if(i>n)
			return 0;
			
		return i + show(i+2, n);
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int res = show(1, n);
		System.out.print("Sum: "+res);
	}
}

//Q9. Write a java program to print a multiplication table of any number.



import java.util.*;
public class Q9
{
	public static void show(int i, int n)
	{
		if(i>10)
			return ;
			
		System.out.println(n+" x "+i+" = "+(n*i));
		show(i+1, n);
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		show(1, n);
	}
}