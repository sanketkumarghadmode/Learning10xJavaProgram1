package Newpackageage;

public class scopeofvariables {

    int a;
    static int b;

    public static void main(String [] args)
    {

        scopeofvariables.m1();
        m1();

    }

    public static void m1(){


        System.out.println(b= 20);
    }

    public void m2(){
        System.out.println(a);
        System.out.println(b);
    }
 }
