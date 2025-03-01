package Wrapper_Class;

public class WrapperClass {

    int num = 10;     // autoboxing
    Integer Wnum = num;

    Double du = 10.00D;          // unboxing
    double d = du;


    void Wrappermethod()
    {
        System.out.println(Wnum);
        System.out.println(Wnum.equals(10));

        System.out.println(d);
    }

    public static void main(String [] args)
    {
        WrapperClass obj = new WrapperClass();
        obj.Wrappermethod();

    }
}
