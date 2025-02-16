package Loops_Programs;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Prime_number {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        for(int i = 2 ; i<num; i++)
        {
           if(num%i ==0)
           {
              count++;
           }
        }
        if(num >1 && count ==0)
        {
            System.out.println(num+" is prime number");
        }
        else {
            System.out.println(num+" is not prime number");
        }
    }



}
