/* 
Q1. Write a java program to print this pattern. 
 
      A 
     A  B 
    A  B  C 
   A  B  C  D 
  A  B  C  D  E 
   A  B  C  D 
    A  B  C  
     A  B 
      A  
 
Q2. Write a java program to print this pattern. 
 
*  *   *   *  * 
 *           * 
   *       * 
     *   *  
       *   
 
Q3. Write a java program to calculate the sum of 1 to 1000 Strong number. 
 
Q4. Write a java program to count the even & odd digit in a number. 
 Input : 12345 
 Even Count : 2                   Odd Count : 3 
 
Q5. Write a Java program to display the Fibonacci series up to n terms. 
If the user enters n = 7, 
then the output should be: 
0 1 1 2 3 5 8 
 
Q6. Given an array arr[] of size n, the task is to rearrange it in alternate positive and negative 
manner without changing the relative order of positive and negative numbers. In case of extra 
positive/negative numbers, they appear at the end of the array. 
 
Giri’s Tech Hub, Pune. 
Core Java Machine Test 
Batch: August-25 Date : 08/10/2025 
Time : 02 to 05 Pm. 
Note: The rearranged array should start with a positive number and 0 (zero) should be 
considered as a positive number. 
 
Examples:  
Input:  arr[] = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8] 
Output: arr[] = [5, -5, 2, -2, 4, -8, 7, 1, 8, 0] 
  
Q7. Given an array of n integers, the task is to find the third largest element. All the elements in 
the array are distinct integers.  
 
Examples :  
Input: arr[] = {1, 14, 2, 16, 10, 20} 
Output: 14 
Explanation: Largest element is 20, second largest element is 16 and third largest element is 14. 
 
Q8. Write a Java program to check whether two integer arrays are anagrams of each other. 
 
Example: 
Input: Array 1: [2, 4, 1, 3] 
Array 2: [1, 2, 3, 4] 
 Output: Arrays are anagrams. 
 
Q9. Write a Java program to check whether the given array is a palindrome array or not. 
Example: 
 Input: arr = {1, 2, 3, 2, 1} 
Output : Array is palindrome. 
 
Q10. Write a Java program to swap the first two elements with the last two elements of an 
integer array. 
 
Example: 
Input array:  int arr[] = {1, 2, 3, 4, 5, 6}; 
Output array after swapping first two with last two: 5 6 3 4 1 2 
 
 -----ALL THE BEST-----  */
/*  
public class secondmock_1
{
    public static void main(String[] args)
	{
        int n = 5;
        // Upper half
        for (int i = 1; i <= n; i++) 
		{
            for (int s = n; s > i; s--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print((char)(64 + j) + " ");
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--)
		{
            for (int s = n; s > i; s--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print((char)(64 + j) + " ");
            System.out.println();
        }
    }
} */


/* public class secondmock_1 {
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
} */

/* public class secondmock_1 {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (n > 0) {
            sum += fact(n % 10);
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
 */
/* import java.util.*;

public class secondmock_1 {
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
 */
/* import java.util.*;
public class secondmock_1 
{
    public static void main(String[] args) 
	{
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
} */
/* import java.util.*;

public class secondmock_1 {
    public static void main(String[] args) {
        int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int i = 0, j = 0, k = 0;
        boolean positiveTurn = true;
        while (i < pos.size() && j < neg.size()) {
            if (positiveTurn) arr[k++] = pos.get(i++);
            else arr[k++] = neg.get(j++);
            positiveTurn = !positiveTurn;
        }

        while (i < pos.size()) arr[k++] = pos.get(i++);
        while (j < neg.size()) arr[k++] = neg.get(j++);

        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }
}

*/

/* import java.util.*;
public class secondmock_1 
{
    public static void main(String[] args) {
        int arr[] = {1, 14, 2, 16, 10, 20};
        Arrays.sort(arr);
        System.out.println("Third Largest Element: " + arr[arr.length - 3]);
    }
}
 */
/*  
import java.util.*;

public class secondmock_1 {
    public static void main(String[] args) {
        int a1[] = {2, 4, 1, 3};
        int a2[] = {1, 2, 3, 4};

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2))
            System.out.println("Arrays are anagrams.");
        else
            System.out.println("Arrays are not anagrams.");
    }
} 
*/
/* 
public class secondmock_1 
{
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
*/
/* 
import java.util.*;

public class SwapElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        // Swap first two with last two
        for (int i = 0; i < 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 2 + i];
            arr[n - 2 + i] = temp;
        }

        System.out.println("Array after swapping: " + Arrays.toString(arr));
    }
} */

