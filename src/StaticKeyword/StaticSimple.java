package StaticKeyword;

public class StaticSimple {


    static int a =20;
    int b;

    public void m1(int b)
    {
        this.b=b;
        System.out.println(b);
        System.out.println("static value = "+a);

    }


    public static void main(String[] args) {

        StaticSimple sm = new StaticSimple();
        sm.m1(20);
        StaticSimple sm1 = new StaticSimple();
        sm1.m1(30);

    }
}
