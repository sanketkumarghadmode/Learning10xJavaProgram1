package CollectionProgram;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inputInAraayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List arr = new ArrayList();

        String check  = "Y";

        while (check.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter Name");
            String name = sc.nextLine();
            arr.add(name);


            System.out.println("Do you want to continue adding the Name: Y/N");
            check= sc.nextLine();


        }

        for (Object ar:arr)
        {
            System.out.println(ar);
        }







    }

}
