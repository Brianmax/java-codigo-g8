package Ejercicio4;

import herencia.Persona;

public class Book extends LibraryItem {
    private String author;

    Book(String title, int itemId, boolean isLoaned, String author) {
        super(title, itemId, isLoaned);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Author :" + author);
    }
}
