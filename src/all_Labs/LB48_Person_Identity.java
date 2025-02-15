package all_Labs;

import java.util.Scanner;

public class LB48_Person_Identity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");

        if(sc.hasNextInt())
        {
            int age = sc.nextInt();

            if(age>0 && age<=12){
                System.out.println("Child");
            } else if (age >=13 && age <= 20) {
                System.out.println("Teenager");
            } else if (age >20 && age <= 64) {
                System.out.println("Adult");
            }
            else{
                System.out.println("Senior Citizen");
            }

        }
        else {
            System.out.println("Age should be a number");
        }


    }

}
