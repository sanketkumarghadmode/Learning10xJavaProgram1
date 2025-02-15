package all_Labs;

public class L40_Amstrong_number {

public static void main(String [] args) {

    int b = 153;
    int num = 0, num2 = 0, num3 = b;


        for(int i = 0 ; i<= 3; i++) {

            num = b%10;
            num2 += num*num*num;
            b = b/10;

        }

   if(num3 == num2){
       System.out.println(num2+" is the armstrong number");
   }
   else {
       System.out.println(num2+" is not the armstrong number");
   }

}
}
