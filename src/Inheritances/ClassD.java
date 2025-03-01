package Inheritances;

public class ClassD extends ClassA{


    public void joker()
    {
        System.out.println("Jocker");
    }

    public static void main(String[] args) {

        ClassD obj = new ClassD();
        obj.joker();
        obj.Dog();
        //Here the classD and ClassB extend the same ClassA this is know as the Hierarchical inheritances

    }
}
