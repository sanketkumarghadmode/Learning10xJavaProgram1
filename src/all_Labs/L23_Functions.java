package all_Labs;

public class L23_Functions {



   // Without parameter and return type
   public static void M1(){
       System.out.println("Sanket");
   }

 // with parameter and without return type
    public static void m2(String s){
        System.out.println(s);
    }
 // with return type with out parameters
    public static String m3() {
       return "Sanket";
    }
//  with parameter and return type
    public static String m4(String a,String b){
       return a+" "+b;
    }

    public static void main(String[] args) {

        M1();

        m2("Sanket");

        String name = m3();
        System.out.println(name);

        String c =  m4("Sanket","Ghadmode");
        System.out.println(c);





    }
}
