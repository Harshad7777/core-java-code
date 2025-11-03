/* 
Q1. Alphabet Pyramid Pattern */
public class PatternA {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = n; s > i; s--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print((char)(64 + j) + " ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n; s > i; s--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print((char)(64 + j) + " ");
            System.out.println();
        }
    }
}

/* 🌟 Q2. Hollow Star Pattern */
public class HollowDiamond {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s < i; s++)
                System.out.print(" ");
            for (int j = i; j <= n; j++) {
                if (i == 1 || j == i || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
/* 
💪 Q3. Sum of Strong Numbers (1 to 1000) */
public class StrongSum {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += fact(d);
            n /= 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (isStrong(i))
                sum += i;
        }
        System.out.println("Sum of Strong Numbers between 1 and 1000: " + sum);
    }
}

/* 🔢 Q4. Count Even & Odd Digits */
import java.util.*;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int even = 0, odd = 0;

        while (num > 0) {
            int d = num % 10;
            if (d % 2 == 0)
                even++;
            else
                odd++;
            num /= 10;
        }

        System.out.println("Even Count: " + even + "   Odd Count: " + odd);
    }
}
/* 
🔁 Q5. Fibonacci Series */
import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
/* 
⚖️ Q6. Rearrange Array Alternately (Without ArrayList or Built-in) */
public class RearrangePosNeg {
    public static void main(String[] args) {
        int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int n = arr.length;
        int pos[] = new int[n];
        int neg[] = new int[n];
        int p = 0, q = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0)
                pos[p++] = arr[i];
            else
                neg[q++] = arr[i];
        }

        int i = 0, j = 0, k = 0;
        boolean flag = true;

        while (i < p && j < q) {
            if (flag)
                arr[k++] = pos[i++];
            else
                arr[k++] = neg[j++];
            flag = !flag;
        }

        while (i < p) arr[k++] = pos[i++];
        while (j < q) arr[k++] = neg[j++];

        System.out.print("Rearranged Array: ");
        for (int x = 0; x < n; x++)
            System.out.print(arr[x] + " ");
    }
}

/* 🥉 Q7. Third Largest Element (Without Arrays.sort) */
public class ThirdLargest {
    public static void main(String[] args) {
        int arr[] = {1, 14, 2, 16, 10, 20};
        int n = arr.length;

        // Simple bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Third Largest Element: " + arr[n - 3]);
    }
}

/* 🧮 Q8. Check if Two Arrays are Anagrams (Without Arrays.sort or equals) */
public class ArrayAnagram {
    public static void main(String[] args) {
        int a1[] = {2, 4, 1, 3};
        int a2[] = {1, 2, 3, 4};
        int n1 = a1.length, n2 = a2.length;

        if (n1 != n2) {
            System.out.println("Arrays are not anagrams.");
            return;
        }

        // Sort manually using bubble sort
        for (int i = 0; i < n1 - 1; i++) {
            for (int j = 0; j < n1 - 1 - i; j++) {
                if (a1[j] > a1[j + 1]) {
                    int temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                }
                if (a2[j] > a2[j + 1]) {
                    int temp = a2[j];
                    a2[j] = a2[j + 1];
                    a2[j + 1] = temp;
                }
            }
        }

        boolean same = true;
        for (int i = 0; i < n1; i++) {
            if (a1[i] != a2[i]) {
                same = false;
                break;
            }
        }

        if (same)
            System.out.println("Arrays are anagrams.");
        else
            System.out.println("Arrays are not anagrams.");
    }
}

/* 🔁 Q9. Palindrome Array Check */
public class PalindromeArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};
        boolean flag = true;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Array is palindrome.");
        else
            System.out.println("Array is not palindrome.");
    }
}

/* 🔄 Q10. Swap First Two and Last Two Elements */
public class SwapElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        for (int i = 0; i < 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 2 + i];
            arr[n - 2 + i] = temp;
        }

        System.out.print("Array after swapping: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}