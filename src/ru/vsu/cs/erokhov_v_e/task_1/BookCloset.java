package ru.vsu.cs.erokhov_v_e.task_1;

import java.util.*;

public class BookCloset extends BookStorage {
    private int serialNumber;
    private int maxBooksNumber;
    private List<Book> bookList = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        bookList.add(book);
        bookList.sort(new Comparator<Book>() {
            @Override
            public int compare(Book fBook, Book sBook) {
                if (fBook.getName().compareTo(sBook.getName()) > 0) {
                    return 1;
                } else if (fBook.getName().compareTo(sBook.getName()) == 0) {
                    return 0;
                }
                else {
                    return -1;
                }
            }
        });
    }

    @Override
    public void addBooks(Book... bookList) {
        for (Book book : bookList) {
            addBook(book);
        }
    }

    @Override
    public String toString() {
        return bookList.toString();
    }

    public ArrayList<Book> findBookByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().equals(author)) {
                booksByAuthor.add(bookList.get(i));
            }
        }
        return booksByAuthor;
    }

    // найти книги определенного жанра, которые лежат в данном шкафу
    public ArrayList<Book> findBookByGenre(String genre) {
        ArrayList<Book> booksByGenre = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getGenre().equals(genre)) {
                booksByGenre.add(bookList.get(i));
            }
        }
        return booksByGenre;
    }

    // найти конкретную книгу, кол-во страниц, цена могут отличаться
    public boolean hasExactBook(Book book) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().equals(book.getAuthor()) && bookList.get(i).getName().equals(book.getName()) &&
                    bookList.get(i).getGenre().equals(book.getGenre())) {
                return true;
            }
        }
        return false;
    }
}
