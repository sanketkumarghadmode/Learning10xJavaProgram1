    package all_Labs;

    import java.util.Scanner;

    public class L35_is_Prime {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            boolean isPrime = true;

            if(num>1) {
                for (int i = 2; i <= Math.sqrt(num); i++) {

                    if(num%i==0)
                    {
                      isPrime = false;

                    }
                }
                if(isPrime == false)
                {
                    System.out.println(num+" is not prime number");
                }
                else {
                    System.out.println(num+" is the prime number");
                }
            }

        }


    }

