/* Q84. Write a java program to print this pattern.


	D
	D	C
	D	C	B
	D	C	B	A
	D	C	B
	D	C
	D
 */
public class pattern84
{
    public static void main(String x[]) 
	{
		for(int i=1; i<=7; i++)
		{
			char ch = 'D';
		
			for(int j=1; j<=4; j++)
			{
				if(j<=i && i<=4)
				{
					 System.out.print(ch--);
				}
				else if(j<=8-i && i>4)
				{
					System.out.print(ch--);
				}
				else
				{
					System.out.print(" ");
				}
			}
		   System.out.println(" ");
		} 
    }
}

/* 
public class PatternDiamond {
    public static void main(String[] args) {
        char last = 'D';  // topmost letter
        int n = last - 'A' + 1; // total rows in half (4 here)

        // Upper half (including middle row)
        for (int i = 1; i <= n; i++) {
            for (char ch = 'D'; ch >= 'D' - i + 1; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (char ch = 'D'; ch >= 'D' - i + 1; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
 */