package all_Labs;


import java.util.Scanner;
public class L27Max_of_two{


    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        int result = num1>num2?num1:num2;

        System.out.println(result+" is the big number");

    }
}