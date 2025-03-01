package Inheritances;

public class ClassB  extends ClassA{


    public void cat()
    {
        System.out.println("Cat");
    }

    public static void main(String[] args) {

        ClassB obj = new ClassB();
        obj.Dog(); // here we can user this method of classA because classB extend(inherit) the ClassA
        // this is know as single level inheritances
        obj.cat();
        //obj.Snake(); this will not accessible because it's not inherited
    }

}
