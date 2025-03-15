/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author nicko
 */
import java.util.List;
import java.util.ArrayList;

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void loanBook(Book book, int loanCount) {
        book.decrementCopies(loanCount);
    }

    public void displayLibrary() {
        System.out.println("Library Inventory:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}