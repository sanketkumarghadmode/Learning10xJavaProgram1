package Opps_Abstraction;

public abstract class Book {

    String name, author;
    double price;

    Book(String name, String author, double price){

        this.author=author;
        this.name=name;
        this.price=price;
    }

    public abstract void getDetails();

}
