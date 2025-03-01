import java.sql.SQLOutput;

public class ThisKeyword {


    int a;
    String b;

    ThisKeyword(int a, String b)
    {
        this.a=a;
        this.b=b;

    }

    public void m1()
    {
        System.out.println(a+"  "+b);
    }


    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(1, "sanket");
        obj.m1();

    }
}
