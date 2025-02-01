package all_Labs;
import java.util.Scanner;

public class L25_Even_Odd_number {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if(sc.hasNextInt()){

        int num = sc.nextInt();
        if (num % 2 == 0) {

            System.out.println(num + " is the Even number");
        } else {
            System.out.println(num + " is the Odd Number");

        }
    }
   else
    {
        System.out.println("Please enter the integer value only");
    }
}
}
