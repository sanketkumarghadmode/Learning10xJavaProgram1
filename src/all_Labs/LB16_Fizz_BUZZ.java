package all_Labs;

public class LB16_Fizz_BUZZ {

public static void main(String [] args) {

    /* Write a program that prints numbers from 1 to 100. However,
      for multiples of 3, print "Fizz" instead of the number, and for multiples of 5,
      print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
     (for loop, if else) */

    // need for loop and if else condition
    // Rufe logic we need to check the number of i is divided by 3 and 5 if the
    // remender is 0 the it is the mutiples of both the numbers
    // then single check for 3
    // single check for 5


    for (int i = 1; i <= 50; i++) {

        if(i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 5 == 0) {
            System.out.println("BUZZ");
        } else if  (i % 3 == 0) {
            System.out.println("FIZZ");
        } else {
            System.out.println(i);
        }


    }
}
}
