package Polymorphism;

public class Poly1 {



    public  void m1()
    {
        System.out.println("Example of method overloading and compile time polymorphism");
        System.out.println("car");
    }
    public void m1(int a)
    {
        System.out.println("car2");
    }
    public void m1(int b,int c)
    {
        System.out.println("car3");
    }

    public static void main(String[] args) {

        Poly1 obj = new Poly1();
        obj.m1();
        obj.m1(10);
        obj.m1(20, 30);
    }

}
