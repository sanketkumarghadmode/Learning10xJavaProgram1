package all_Labs;

public class L39_Palidrome_number {

    public static void main(String[] args) {

        int num = 141;
        int num2 = 0;
        int num3 = 0;
        int num4 = num;
        while(num!=0)
        {
            num2 = num%10; //   num 32   num2 =2;
            num3= num2+(num3*10);  // num3 = 2 num2 3 +(2*10) = 52
            num = num/10;          // 32/10

           // System.out.print(num2);
        }
        if (num3 == num4){
            System.out.println(num3+" Is the Palindrome number");
        }
        else{

            System.out.println(num3+" Is not the Palindrome number");
        }

    }
}
/*
*     0 = 325%10;
*     0 = 5+(0*10) = 5
*     325 = 325/10 = 32
*
*     5 = 32%10 = 2
*     5 = 2+(5*10) = 52;
*     32 = 32/10 = 3
*
*     2 = 3%10  = 3
*
*
* */


