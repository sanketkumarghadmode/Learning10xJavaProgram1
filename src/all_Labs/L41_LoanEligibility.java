package all_Labs;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class L41_LoanEligibility {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int age = Valid_Age(sc);
        int C_score = Valid_Age(sc);
        double salary = Valid_Salary(sc);


        if (age > 17 && age <= 80 && salary >= 30000 && C_score >= 650 && C_score <= 850) {

            // System.out.println("age is"+age+"\n"+"Salary is "+salary+"\n"+" Credit Score is "+C_score+" ");
            System.out.println("Your are Eligible for the loan");
        } else {
            // System.out.println("age is"+age+"\n"+"Salary is "+salary+"\n"+" Credit Score is "+C_score+" ");
            System.out.println("Your are Not Eligible for the loan");

        }
    }

    public static int Valid_Age(Scanner sc) {

        if(!sc.hasNextInt())
        {
            System.out.println("Enter valid input");
            System.exit(0);
        }
        return sc.nextInt();
    }

    public  static double Valid_Salary(Scanner sc)
    {
        if(!sc.hasNextDouble()){

            System.out.println("Enter valid input");
            System.exit(0);
        }
         return sc.nextDouble();

    }

}
