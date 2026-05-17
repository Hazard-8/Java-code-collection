package oop.Aggregation;

public class Aggregation_45 {
    public static void main(String [] args){

        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure,
        //               But the contained object/s can exist independently.

        // There is a concept called composition, In this case if I delete the Library class,
        // The books can exist outside the library independently.

        Book book1 = new Book("The Fellow of the Ring", 432);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library", 1897, books);// This is where aggregation takes place

        library.displayInfo();


    }
}
