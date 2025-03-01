package Polymorphism;

public class Poly2 extends Poly1{

    public void m1()
    {
        System.out.println("Example of method overriding and run time polymorphism");
    }

    public static void main(String[] args) {

        Poly2 obj = new Poly2();
        obj.m1();

        Poly1 obj1 = new Poly1();
        obj1.m1();
    }

}
