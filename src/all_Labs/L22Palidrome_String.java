package all_Labs;

public class L22Palidrome_String {

    public static void main(String[] args) {

        //Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)

        // for loop, lenght of string, if condition , two string variables

        /*get the lenght of string use for loop store the string in rever
        order and compair with the main string if it's match then it's palidrome string */

        String name = "naman";

        String rev = "";
        for(int i = name.length() -1 ;i>=0;i--){

            rev += name.charAt(i);
        }

        if(rev.equals(name)){
            System.out.println(rev+" is the Paliodrome String");
        }



    }
}
