package Functions;

public class MainClass {

    public static void main(String[] args) {

        All_Four_Types_of_Functions obj = new All_Four_Types_of_Functions();

        obj.m1();

        String name =  obj.m2();
        System.out.println(name);

        obj.m3("With Parameter no return type", 25);

        int c =  obj.m4(10,25);
        System.out.println("Ruturn type with parameter "+c);


    }

}


