package Newpackageage;

public class Grade_Program {

    public static void main(String[] args) {


     // simple one liner  // condition ? expression : expression
    // Nestead // condition ? expression : (condition)? expression:(condition)? expression :expression

        /*
        * A = 90 to 100
        * B = 80 to 89
        * C = 70 to 79
        * D = 60 to 69
        * F = 0 to 59
        * */

        int b = 60;
      String Grades = (b >=90)?"A":(b>=80 && b<=89)?"B":(b>=70 && b<=79)?"C":(b>=60 && b<=69)?"D":"F";
      System.out.println(Grades);
    }
}
