package all_Labs;

import java.util.Scanner;

public class L31_Find_Small_of_Three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 < num2 && num1<num3) {
            System.out.println(num1 + " is small number");
        }
        else if(num2<num3)
        {
            System.out.printf(num2+" is the small number");
        }
        else {
            System.out.println(num3+" is the small number");
        }

    }
}
