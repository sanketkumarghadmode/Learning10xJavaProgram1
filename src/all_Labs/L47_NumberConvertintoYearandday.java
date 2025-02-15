package all_Labs;

import java.util.Scanner;

public class L47_NumberConvertintoYearandday {


    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int num= 0;
        int Year =0;
        int rem_day =0;
        int month = 0;
        int days =0;

        System.out.println("Enter a number");
        if(!sc.hasNextInt())
        {
            System.out.println("Enter valid number");
            System.exit(0);
        }
        else {
             num = sc.nextInt();
        }

            Year = num / 365;
            rem_day = num % 365;
            month = rem_day / 30;
            days = rem_day % 30;
            String cal = Year + " Years " + month + " Month " + days + " Days";
            System.out.printf(cal);

    }
}
