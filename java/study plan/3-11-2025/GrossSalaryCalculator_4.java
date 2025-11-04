/*  Q4. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
                               	Basic Salary <= 10000 : HRA = 20%, DA = 80%
                               	Basic Salary <= 20000 : HRA = 25%, DA = 90%
                               	Basic Salary > 20000 : HRA = 30%, DA = 95% */
								
import java.util.*;

public class GrossSalaryCalculator_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra, da, gross;

        if (basic <= 10000)
        {
            hra = basic * 0.20;
            da  = basic * 0.80;
        }
        else if (basic <= 20000)
        {
            hra = basic * 0.25;
            da  = basic * 0.90;
        }
        else
        {
            hra = basic * 0.30;
            da  = basic * 0.95;
        }

        gross = basic + hra + da;

        System.out.println("HRA = " + hra);
        System.out.println("DA  = " + da);
        System.out.println("Gross Salary = " + gross);
    }
}

/* java GrossSalaryCalculator_4.java
Enter Basic Salary: 30000
HRA = 9000.0
DA  = 28500.0
Gross Salary = 67500.0 */
