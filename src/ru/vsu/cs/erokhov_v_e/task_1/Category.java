package ru.vsu.cs.erokhov_v_e.task_1;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private String name;
    private int booksAmount = 0;
    private List<Book> books = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        booksAmount++;
        books.add(book);
        book.addCategory(this);
    }

    public void addBooks(Book... addingBooks) {
        for (int i = 0; i < addingBooks.length; i++) {
            books.add(addingBooks[i]);
            booksAmount++;
            addingBooks[i].addCategory(this);
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
         return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBooksAmount() {
        return booksAmount;
    }

    public void setBooksAmount(int booksAmount) {
        this.booksAmount = booksAmount;
    }

    public List<Book> getBooks() {
        return List.copyOf(books);
    }

    public void setBooks(List<Book> books) {
        this.books = List.copyOf(books);
    }
}
