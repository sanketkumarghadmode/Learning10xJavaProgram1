package Opps_Abstraction;

public class ConstructorCheck  {

    ConstructorCheck(){

        System.out.println("Constructor without parameter");

    }

    ConstructorCheck(int a)
    {

        System.out.println("Constructor with parameters");


    }

    public static void main(String[] args) {

        ConstructorCheck obj = new ConstructorCheck();
        ConstructorCheck obj1 = new ConstructorCheck(10);
    }

}

class defaultConstructor{

    void display(){
        System.out.println("Example of default constructor");
    }

    public static void main(String[] args) {

        defaultConstructor obj = new defaultConstructor();
        obj.display();

    }


}
