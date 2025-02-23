package Opps_Abastraction;

public abstract class Book {


    //Book class which has an abstract method getDetails(),name, author, price.
    //
    //PrintMyBook class that inherits from the Book class. abstract
    //
    //Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
    //
Book(){

    String name ;
    String author;
    int price;
}

    public abstract void getdetail(String name, String author, int price);





}
