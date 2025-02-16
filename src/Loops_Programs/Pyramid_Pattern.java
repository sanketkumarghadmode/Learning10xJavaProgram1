package Loops_Programs;

public class Pyramid_Pattern {


    public static void main(String[] args) {


        for(int i =0; i<=3; i++)
        {

            for (int k =3;k>=i; k--)
            {
                System.out.print(" ");
            }

          for(int j = 0; j<=i; j++)
          {
              System.out.print("*");
          }

          for (int l =1; l<=i;l++)
          {
              System.out.print("*");
          }


            System.out.println();
        }


    }
}
