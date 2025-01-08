package all_Labs;

public class L9_Rever_number {

    public static void main(String[] args) {

        System.out.println();

        int a =321;
       int c = 0;
        while(a!=0)
        {
            c = a%10;
            a = a/10;
            System.out.print(c);
        }

    }


}
