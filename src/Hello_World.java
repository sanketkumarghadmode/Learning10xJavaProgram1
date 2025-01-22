public class Hello_World {

    public static void main(String[] args) {
        int a=10,b=25,c=15;
        int largestNumber = (a>=b && a>=c) ? a : (b>=a && b>=c) ? b : c;
        System.out.println(largestNumber);
    }


}
