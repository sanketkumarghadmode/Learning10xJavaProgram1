package Newpackageage;

public class Bitwise_and_logical_operators {

  public static void main(String [] args) {

    int a =2;
    int b = 20;
    int c=100;
    boolean flag = a==b || a<=b;
    boolean flag2 = a==b && a!=b;

        System.out.println(flag);
      System.out.println(flag2);

      boolean flag3 = a < b & ++a !=c;
      System.out.println(flag3);

      System.out.println((a & c) !=30);


  }


}
