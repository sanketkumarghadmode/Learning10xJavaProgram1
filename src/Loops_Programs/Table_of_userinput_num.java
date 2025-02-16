package Loops_Programs;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Table_of_userinput_num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = 0 ;
        if(sc.hasNextInt()){

            num = sc.nextInt();

            for(int i =1; i<=10; i++)
            {
                System.out.println(num*i);
            }


        }
        else {
            System.out.println("Enter only a number");
        }

    }

}

