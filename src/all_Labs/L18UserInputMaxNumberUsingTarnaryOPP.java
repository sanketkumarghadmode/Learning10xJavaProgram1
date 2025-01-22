package all_Labs;

public class L18UserInputMaxNumberUsingTarnaryOPP {

    public static void main(String[] args) {

      String N1 = args[0];
      int num1 = Integer.parseInt(N1);

      String N2 = args[1];
      int num2  = Integer.parseInt(N2);


      int result = num1 > num2 ? num1:num2;
        System.out.println(result);


    }
}