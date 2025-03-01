package Wrapper_Class;

public class ConvertionOfdatatype {


    public static void main(String[] args) {

        String num = "10";
        int b = Integer.parseInt(num);

         int a = 10;

         String num1 = String.valueOf(a);

        System.out.println(" String to number = "+num+" \n "
                +"Number to string ="+a);


        boolean bo = true;
        String num3 = String.valueOf(bo);

        String bo2 = "true";
        boolean bb = Boolean.parseBoolean(bo2);
        System.out.println(bb);

    }
}
