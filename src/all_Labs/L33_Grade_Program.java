package all_Labs;

import java.util.Scanner;

public class L33_Grade_Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mark  =sc.nextInt();

        if(mark>90){
            System.out.println("A+ garde");
        }
        else if (mark>89){
            System.out.println("A grade");
        }
        else if (mark>79) {

            System.out.println("B Grade");
        }
        else if (mark >69) {
            System.out.println("C grade");
        }
        else if (mark > 59){
            System.out.println("D grade");
        }
        else if (mark >49) {
            System.out.println("E grade");
        }
        else {
            System.out.println("Fail");
        }

    }


}
