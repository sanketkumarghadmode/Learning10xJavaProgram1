package all_Labs;

import java.util.Scanner;

public class Travel_Eligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age<0){
            System.out.println("Age must be positive number");
            System.exit(0);
        }

        System.out.println("Enter the visa status");
        String status = sc.next();



        if(age >=18 && status.equalsIgnoreCase("valid"))
        {
            System.out.println("You are eligible to travel");
        }
        else {
            System.out.println("You are not eligible to travel");
        }


    }

}
