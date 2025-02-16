package Arrays;

import java.util.Arrays;

public class TwoD_Array {

    public static void main(String[] args) {

        int num [][] = { {1,2},{3,8,4} };

       for (int i = 0; i<num.length; i++)
       {

           for (int j = 0; j<num[i].length; j++){

               System.out.println(num[i][j]);
       }

       }


    }
}
