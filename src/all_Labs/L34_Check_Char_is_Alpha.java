package all_Labs;

import java.util.Scanner;

public class L34_Check_Char_is_Alpha {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char A = sc.next().charAt(0);

        // there are two condition one is to check number between the 65 to 90 and 90 to 122 which
        // the ASCII number of Small and Capital Alphabets and as we know the character is also hold the
        // ASCII value

        if ((A >= 60 && A <= 90) || (A >= 97 && A <= 122)) {
            System.out.println(A + " is Alphabet");
        } else {
            System.out.println(A + " is not Alphabet");
        }

        char B = sc.next().charAt(0);

       if (Character.isLetter(B)){
           System.out.println(B+" is the Alphabet");
       }else {
           System.out.println(B+" is not the Alphabet");
       }


    }
}
