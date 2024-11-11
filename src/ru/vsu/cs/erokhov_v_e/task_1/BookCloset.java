package ru.vsu.cs.erokhov_v_e.task_1;

import java.util.*;

public class BookCloset extends BookStorage {
    private static String someString = Util.setAndCheck("ШКАФ!");
    private static String someString2 = Util.setAndCheck("ЭТО ВТОРОЙ ШКАФ!");
    private int myAge = Util.setAndCheck(19);
    private String myName = Util.setAndCheck("Hiesenberg!");
    private static int someInt;
    private static int someInt2;
    static {
        someInt = Util.setAndCheck(9);
        someInt = Util.setAndCheck(10);
    }
    private int serialNumber;
    private int maxBooksNumber = 3;
    private List<Book> bookList = new ArrayList<>();

    public BookCloset(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void addBook(Book book) {
//        int newCopiesNumber = 1;
        if (!isFull()) {
//            for (Book bookInList : bookList) {
//                if (bookInList.equals(book)) {
//                    newCopiesNumber+=1;
//                }
//            }
//            book.setCopiesNumber(newCopiesNumber);
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
        } else {
            System.out.printf("Шкаф переполнен! Книга %1s не вместилась\n", book.toString());
        }
    }

    @Override
    public void addBooks(Book... bookList) {
        for (Book book : bookList) {
            addBook(book);
        }
    }

    public boolean isFull() {
        return bookList.size() >= maxBooksNumber;
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

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getMaxBooksNumber() {
        return maxBooksNumber;
    }

    public void setMaxBooksNumber(int maxBooksNumber) {
        this.maxBooksNumber = maxBooksNumber;
    }

    public List<Book> getBookList() {
        return List.copyOf(bookList);
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = List.copyOf(bookList);
    }
}
