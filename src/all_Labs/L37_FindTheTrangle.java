    package all_Labs;

    import java.util.Scanner;

    public class L37_FindTheTrangle {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int side1  = sc.nextInt(), side2 = sc.nextInt(), side3 = sc.nextInt();

            if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
           {

            if(side1 == side2 && side2 == side3)
            {
                System.out.println("This is the Perfect Trangle all the side's are equal"+side1+" "+side2+" "+side3);

            }
            else if (side1!=side2 && side2!=side3 && side1!=side3)
            {
                System.out.println("This is the Scalene Triangle all the side's are different"+side1+" "+side2+" "+side3);
            }
            else {
                System.out.println("This is the Isosceles Triangle two side's are equal"+side1+" "+side2+" "+side3);
            }
        }
           else {
               System.out.println("Invalid input to form the triangle ");
           }

        }
    }
