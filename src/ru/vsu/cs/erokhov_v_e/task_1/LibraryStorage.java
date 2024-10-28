package ru.vsu.cs.erokhov_v_e.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LibraryStorage extends BookStorage {
    private String name;
    private Map<String, List<BookCloset>> bookMap = new TreeMap<>();

    public LibraryStorage(String name) {
        this.name = name;
    }

    @Override
    public void addBook(Book book) {
        String bookKey = Character.toString(book.getName().charAt(0));
        bookMap.putIfAbsent(Character.toString(book.getName().charAt(0)), new ArrayList<>());
        if (bookMap.get(bookKey).size() == 0) {
            BookCloset bookCloset = new BookCloset(bookMap.get(bookKey).size()+1);
            bookMap.get(bookKey).add(bookCloset);
        }
        else if (bookMap.get(bookKey).get(bookMap.get(bookKey).size()-1).isFull()) {
            BookCloset bookCloset = new BookCloset(bookMap.get(bookKey).size()+1);
            bookMap.get(bookKey).add(bookCloset);
        }
        bookMap.get(Character.toString(book.getName().charAt(0))).get(bookMap.get(bookKey).size()-1).addBook(book);
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
}
