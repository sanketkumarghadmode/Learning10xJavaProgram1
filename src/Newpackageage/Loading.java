package Newpackageage;

import java.util.Scanner;

public class Loading {

    public static void main(String[] args) throws InterruptedException {

      Scanner sc = new Scanner(System.in);

      String[] l = {"*", "**", "***","****"};
        int a = 0;

        System.out.println("enter num1 and num2 for the addition");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while (a < 20) {
            System.out.print("Loading please wait " + l[a % l.length]); // Cycle through array
            System.out.print('\r');
            Thread.sleep(300);
            a++;
        }
        System.out.print("\r");
        System.out.print("num1 "+"+ num2"+" = "+(num1+num2));





    }
}