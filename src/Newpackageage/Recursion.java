package Newpackageage;

public class Recursion {

  static   int c = 10;

    public static void main(String[] args) {
        m1(5);
    }

    public static void m1(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        m1(n - 1);

    }

}
