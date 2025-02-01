package all_Labs;
import java.util.Scanner;
public class L26_Voting_eligiblity {


    public static void main(String [] args)

    {
        Scanner sc = new Scanner(System.in);



        if(sc.hasNextInt())
        {
            int age = sc.nextInt();
            String check  =  age>=18? " Person is eligible to vote":"Person is Not eligible to vote";
            System.out.println(check+" Age is "+age);

        }
        else {

            System.out.println("Enter the valid age");
        }

    }


}
