package oop.Aggregation;

public class Book {

    private String title;
    private int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title + " (" + this.pages + "Pages)";
    }

}
