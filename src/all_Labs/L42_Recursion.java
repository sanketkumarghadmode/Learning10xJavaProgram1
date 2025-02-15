package all_Labs;

import java.util.Scanner;

public class L42_Recursion {


    public static void main(String []agrs) {

       m1(3);

    }

    public static void m1(int n){

        if(n==0)
        {
            return;
        }

        System.out.println("sanket");
        m1(n-1);
    }

}
