package ru.vsu.cs.erokhov_v_e.task_1;

import java.util.ArrayList;
import java.util.List;

public class Stack { //компановщик
    //создать метод Хранилиша, от которого будут наследрваться классы Шкафа и Stack (Stack - хранилище шкафов),
    //передавая книгу в Stack он раскидывает книгу по шкафам по алфамиту(допустим по первой юукве фамилии автора, либо по первой букве названии), методы
    //добавления книг будут в классе Хранилища
    private int serialNumber; // порядковый номер (нужен, если бы перебирали все шкафы)
    private int maxNumberOfBooks; // максимальное кол-во книг, которое можно поместить в шкаф
    private List<Book> books = new ArrayList<>(); // список книг, который хранится в шкафу

    // создать просто шкаф
    public Stack(int serialNumber, int maxNumberOfBooks) {
        this.serialNumber = serialNumber;
        this.maxNumberOfBooks = maxNumberOfBooks;
    }

    public int getBooksAmount() {
        return books.size();
    }

    public void addBook(Book book) {
        if (books.size() < maxNumberOfBooks) {
            books.add(book);
            boolean isUniq = true;
            for (int i = 0; i < book.getStackNumbers().size(); i++) {
                if (book.getStackNumbers().get(i) == this.serialNumber) {
                    isUniq = false;
                }
            }
            if (isUniq) {
                book.setStackNumbers(this.serialNumber);
            }
            if (books.size() > 1) {
                boolean isUnique = true;
                for (int i = 0; i < books.size(); i++) {
                    if (books.get(i).equals(book)) {
                        isUnique = false;
                        break;
                    }
                }
                if (!isUnique) {
                    book.setCopiesNumber(book.getCopiesNumber() + 1);
                }
            }
        } else {
            System.out.println("Шкаф переполнен!");
        }
    }

    public void addBooks(Book... addingBooks) {
        for (int i = 0; i < addingBooks.length; i++) {
            addBook(addingBooks[i]);
        }
    }

    // найти книги определенного автора, которые лежат в данном шкафу
    public ArrayList<Book> findBookByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                booksByAuthor.add(books.get(i));
            }
        }
        return booksByAuthor;
    }

    // найти книги определенного жанра, которые лежат в данном шкафу
    public ArrayList<Book> findBookByGenre(String genre) {
        ArrayList<Book> booksByGenre = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getGenre().equals(genre)) {
                booksByGenre.add(books.get(i));
            }
        }
        return booksByGenre;
    }

    // найти конкретную книгу, кол-во страниц, цена могут отличаться
    public boolean hasExactBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(book.getAuthor()) && books.get(i).getName().equals(book.getName()) &&
                    books.get(i).getGenre().equals(book.getGenre())) {
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

    public int getMaxNumberOfBooks() {
        return maxNumberOfBooks;
    }

    public void setMaxNumberOfBooks(int maxNumberOfBooks) {
        this.maxNumberOfBooks = maxNumberOfBooks;
    }

    public List<Book> getBooks() {
        return List.copyOf(books);
    }

    public void setBooks(List<Book> books) {
        this.books = List.copyOf(books);
    }
}