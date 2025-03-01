    package Arrays;

    public class Arraysort {

        public static void main(String[] args) {

           int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};


          for(int i = 0;i<numbers.length;i++)
          {

              for(int j = 0; j<=numbers.length; j++) {

                  if(numbers[j]>numbers[j+1])
                  {
                      System.out.println(numbers[i]);

                  }

              }
              }
        }

    }

