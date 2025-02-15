package all_Labs;

import java.util.Scanner;

public class L44_Bonus_salary {

    public static void main(String[] args) {

        double cal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no of experiences ");
        float year = sc.nextFloat();


        if (year >= 1.3) {
            System.out.println("enter your salary");
            double salary = sc.nextDouble();

            if (year >= 1.3 && year <= 4.6) {

                cal = (5*salary)/100;
                System.out.println(cal+" is your bonus 5% ");
                cal+=salary;
                System.out.println(cal+" is your salary with bonus ");
            }
            else if (year > 4.6 && year < 6.0 ) {

                cal = (10*salary)/100;
                System.out.println(cal+" is your bonus 10% ");
                cal+=salary;
                System.out.println(cal+" is your salary with bonus ");

            }
            else if (year >=6.0) {

                cal = (15%salary)/100;
                System.out.println(cal+" is your salary with 15% bonus");
                cal+= salary;
                System.out.println(cal+" is your salary with bonus");

            }
        }
        else {
            System.out.println("No bonus");
        }
    }
    }
