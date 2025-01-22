package all_Labs;

public class L16_MaxNumber {
    public static void main(String[] args) {
        //Find the max number form the 3 number

        int n1 =17 , n2 = 50 , n3 = 345;

        int max = n1 > n2?(n1>n3?n1:n3):(n2>n3?n2:n3);

        System.out.println(max);

    }
}
