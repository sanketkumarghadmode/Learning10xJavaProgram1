package Opps_Abstraction;

public class PrintMyBook extends Book{

    PrintMyBook(String name, String author, double price) {
        super(name, author, price);
    }

    @Override
    public void getDetails() {

        System.out.println("Book name: "+name);
        System.out.println("Book author: "+author);
        System.out.println("Book price: "+price);

    }

    public static void main(String[] args) {

        Book bo = new PrintMyBook("Wing of the fire","APJ abdul Kalam", 360.0);
        bo.getDetails();
    }

}
