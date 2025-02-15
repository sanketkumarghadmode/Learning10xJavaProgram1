package all_Labs;

import java.util.Scanner;

public class L48_URls_Types {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Url");
        String url = sc.next();


        if(url.contains(".com"))
        {
            System.out.println("The website type is: Commercial website");

        } else if(url.contains(".org")){
            System.out.println(" The website type is: Non-profit organization");

        } else if (url.contains(".gov")) {
            System.out.println(" The website type is: Government website");

        } else if (url.contains(".edu")) {
            System.out.println("The website type is: Educational institution");

        }
        else {
            System.out.println(" The website type is: Unknown or other types of websites");
        }


    }
}
