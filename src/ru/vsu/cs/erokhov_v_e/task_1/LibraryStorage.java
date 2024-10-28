package ru.vsu.cs.erokhov_v_e.task_1;

import java.util.Map;
import java.util.TreeMap;

public class LibraryStorage extends BookStorage {
    private String name;
    private Map<String, BookCloset> bookMap = new TreeMap<>();
    @Override
    public void addBook(Book book) {
        bookMap.putIfAbsent(Character.toString(book.getName().charAt(0)), new BookCloset());
        bookMap.get(Character.toString(book.getName().charAt(0))).addBook(book);
    }

    @Override
    public void addBooks(Book... books) {
        for (Book book : books) {
            addBook(book);
        }
    }

    @Override
    public String toString() {
        return bookMap.toString();
    }

    public void showBooks(String key) {
        System.out.println(bookMap.get(key).toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, BookCloset> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<String, BookCloset> bookMap) {
        this.bookMap = bookMap;
    }


}
