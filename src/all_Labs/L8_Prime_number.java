package all_Labs;

public class L8_Prime_number {

    public static void main(String[] args) {

        int a = 10;
        int count = 0;

        {
        for(int i = 1; i<=10; i++) {
            count = 0;

            for (int j = 1; j <=10; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
        if(count ==2)
        {
            System.out.println("prime number"+i);
        }

        }

        }
    }

}
