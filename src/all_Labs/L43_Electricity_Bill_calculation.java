package all_Labs;

import java.util.Scanner;

public class L43_Electricity_Bill_calculation {

    public static void main(String[] args) {

        double cal = 0.0d;
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();


        if(bill <=100)
        {
             cal = bill * 0.50;
            System.out.println(cal);

        }
        else if(bill >= 101 && bill <=200){

            cal = (100 * 0.5)+(bill - 100) * 0.75;

            System.out.println(cal);
        }
        else if (bill >=201 && bill <=300)
        {
            cal = (100 * 0.5)+(bill * 0.75)+(bill - 200)*1.20;
            System.out.println(cal);

           //  cal = (50.0)+(201*0.75)+(201 - 200) * 1.20
           //  cal = (50.0)+(150.75)+(1)*1.20
           //  cal = (200.75)+(1.20)
           //  cal = 201.95

        }
        else if(bill > 300)
        {
            cal =  (100*0.50)+(100*0.75)+(100 * 1.20)+(bill -300)*1.50;
            System.out.println(cal);
        }

    }




}
