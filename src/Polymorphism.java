public class Polymorphism {


    //polymorphism this is the one of the pillar of the opps
    //Poly means meany and morphism form it means many form

    //Polymorphism means that the same object can behave in different ways
    // at different times in its life. In Java, it helps us use one thing in many forms.


  //Threr  are two type of

    // compile time : - When a method’s declaration gets linked to its definition at the time of compilation,
    // it’s called Compile-Time Polymorphism. This is also known as Method Overloading in Java.
    //runtime


    public void m1(){
        System.out.println("sanket");
    }

    public void m1(String a)
    {
        System.out.println("Ghadmode");
    }

    public static void main(String[] args) {

        Polymorphism obj = new Polymorphism();
        obj.m1();
        obj.m1("Print the name ");
    }
}
