package Newpackageage;

public class FibonacciSeries {

    public static void main(String[] args) {

        int num1 = 0, num2 = 0, num3 =1;

        for (int i = 0; i<=10; i++){

            System.out.println(num2+" ");

            num1 = num2 + num3;
            num2 = num3;
            num3 = num1;

        }
    }
}

