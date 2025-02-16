package Loops_Programs;

public class Inverted_Pyramid_Pattern {

    public static void main(String[] args) {


        for (int i = 0;i<=3; i++)
        {

            for (int l=0;l<=i;l++)
            {
                System.out.print(" ");
            }

            for (int k=2; k>=i;k--)
            {
                System.out.print("*");
            }

            for (int j =3;j>=i;j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
