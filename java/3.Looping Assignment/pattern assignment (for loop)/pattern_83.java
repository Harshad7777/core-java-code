/* Q83. Write a java program to print this pattern.


1	A	2	B	3  
  C   4   D   5  
    6	E	7  
  F   8   G   9  
H	10	I	11	J

  */
public class pattern83 {
    public static void main(String[] args) {
        int num = 1;
        char ch = 'A';
        boolean flag = true; // true → print number, false → print letter

        int rows = 5; // total rows

        for (int i = 1; i <= rows; i++) {

            // --- indentation logic ---
            int spaces = 0;
            if (i == 2 || i == 4) spaces = 2;
            else if (i == 3) spaces = 4;

            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            // --- element count per row ---
            int elements;
            if (i == 1 || i == 5) elements = 5;
            else elements = 3;

            for (int j = 1; j <= elements; j++) {
                if (flag) {
                    System.out.print(num + "\t");
                    num++;
                    flag = false; // next → letter
                } else {
                    System.out.print(ch + "\t");
                    ch++;
                    flag = true; // next → number
                }
            }
            System.out.println();
        }
    }
}
