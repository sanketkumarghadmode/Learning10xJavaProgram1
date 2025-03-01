package Encapsulation;

import java.sql.SQLOutput;

public class Encaps2 {

    private long account_number;
    private double accoun_balance;

    Encaps2(long account_number, double accoun_balance)
    {
         this.accoun_balance = accoun_balance;
         this.account_number= account_number;
    }

    public void setAccoun_balance(double accoun_balance, long enteraccountnumer) {
        if(account_number == enteraccountnumer)
        {
            this.accoun_balance = accoun_balance;
        }
        else {

            System.out.println("Incorrect account number, Your account will block after 3rd ivalid account number");
        }

    }

    public double getAccoun_balance(long enterAccountNumber){

      if(account_number == enterAccountNumber) {
          return accoun_balance;
      }
      else {
          System.out.println("Enter valid account number");
      }
        return 0;
    }



}
