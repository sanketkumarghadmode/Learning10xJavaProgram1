package Inheritances;

public class ClassC  extends ClassB{

    public void Sanke()
    {
        System.out.println("Snake");
    }

    public static void main(String[] args) {

        ClassC obj = new ClassC();
        obj.Dog();
        obj.cat();
        obj.Sanke();
        // here ClassC Extend the Class B which already extend the ClassA this is know as the multi level inheritances
    }

}
