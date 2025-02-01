package all_Labs;

import java.util.Scanner;

public class L36_ATM_Simulator {


    public static void main(String[] args) {

    /* initialize the account balance with a fixed amount (e.g., ₹10,000).
       Take user input for the amount they want to withdraw.
       Check withdrawal conditions:

       The amount should be greater than zero.

       The amount should be a multiple of 100 (common ATM rule).

       The amount should not exceed the account balance.
       Deduct the amount from the balance if conditions are met.
       Display the updated balance or an error message if the withdrawal fails.*/

         final double balance = 10000d;
         Scanner sc = new Scanner(System.in);
         double Withdraw = sc.nextDouble();

         if(Withdraw > 0 && Withdraw%100 == 0 && Withdraw <= balance)
         {
             double last = balance - Withdraw;
             System.out.println("The amout "+Withdraw+" Debited form your acount"+"\n"+" your" +
                     " current balance is "+last);
         } else if (Withdraw>balance)
         {
             System.out.println("insufficient balance");
         } else {
             System.out.println("Please enter the correct amount and try again");
         }





    }
}
