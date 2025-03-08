package StaticKeyword;

import java.sql.SQLOutput;

public class MainClass {

    public static void main(String[] args) {

        NewStatic ob = new NewStatic("sanket", 1234);
        NewStatic ob1 = new NewStatic("ganesh", 3456);




        System.out.println(ob.Collage());
        System.out.println(ob1.Collage());
        System.out.println(ob.getStudent_name());


    }

}
