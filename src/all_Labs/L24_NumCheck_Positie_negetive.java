package all_Labs;
import java.util.Scanner;
public class L24_NumCheck_Positie_negetive {

    public static void main(String [] args)
    {


        Scanner s  = new Scanner(System.in);

        if(s.hasNextDouble())
        {
            double num = s.nextDouble();

            if(num > 0)
            {
                System.out.println(num+" "+" is the positive number");

            }
            else if (num <0){

                System.out.println(num+" "+" Is the Negetie number ");

            }
            else
            {
                System.out.println(num+" "+" is 0");
            }
        }

    }

}
