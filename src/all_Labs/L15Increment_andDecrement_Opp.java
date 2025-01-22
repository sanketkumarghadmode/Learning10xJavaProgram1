package all_Labs;

public class L15Increment_andDecrement_Opp {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);   //13

        int ab = 20;
        System.out.println(--ab + ab++ + ab--);
        System.out.println(ab);// 19
    }
}
