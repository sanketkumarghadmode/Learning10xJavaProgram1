package all_Labs;

import java.util.Scanner;

public class L32_LipYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+" is the leap year");
        }
        else {
            System.out.println(year+" is not the leap year");
        }

    }

}
