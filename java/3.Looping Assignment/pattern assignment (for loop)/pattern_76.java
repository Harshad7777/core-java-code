/* Q76. Write a java program to print this pattern.

					A
				#	#	#
			A	B	C	B	A
		#	#	#	#	#	#	#
	A	B	C	D	E	D	C	B	A
		#	#	#	#	#	#	#
			A	B	C	B	A
				#	#	#
					A


  */
 public class pattern76
   {
    public static void main(String x[] ) 
	{
        for (int i = 1; i <= 9; i++) 
		{
			char ch ='A';
            for (int j = 1; j <= 9; j++) 
			{
				if (j>=6-i && j<6 && i<6)
				{
                   System.out.print("\t"+ch++);
                }
				 else if (j>=4+i && j>5 && i<6) 
				{
                   System.out.print(" "+(--ch));
                }
				
				
				/*
                if (j<7i && j<6 && i<6) 
				{
                   System.out.print(" "+(char)(64+j));
                }
				
				else if (j>=4+i && j>4 && i<6) 
				{
                   System.out.print(" "+(char)(74-j));
                }
				
				else if (j<=i-4 && j<7 && i>4) 
				{
                 System.out.print(" "+(char)(64+j));
                }
				
				else if (j>=14-i && j>=5 && i>=5) 
				{
                   System.out.print(" "+(char)(74-j));
                } */
				
				else
				{
					 System.out.print("\t");
				}
            }
            System.out.println();
        }
    }
} 
/* 
public class pattern76 {
    public static void main(String[] args) {
        int n = 5; // Maximum alphabet is 'E'

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            printLine(i, n);
        }
        // Loop from n-1 down to 1
        for (int i = n - 1; i >= 1; i--) {
            printLine(i, n);
        }
    }

    static void printLine(int i, int n) {
        // Leading spaces
        for (int s = 1; s <= n - i; s++) {
            System.out.print("\t");
        }

        if (i % 2 == 0) {
            // Print hashes (#)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("#\t");
            }
        } else {
            // Print alphabets
            // Increasing part
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j) + "\t");
            }
            // Decreasing part
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)(64 + j) + "\t");
            }
        }
        System.out.println();
    }
}

 */
 