package ru.vsu.cs.erokhov_v_e.task_1;

public abstract class BookStorage {
    private static String someString = Util.setAndCheck("ХРАНИЛИЩЕ!");

    private int myAge = Util.setAndCheck(91);
    private static int someInt;
    static {
        someInt = Util.setAndCheck(99);
    }
    abstract void addBook(Book book);
    abstract void addBooks(Book... books);

}
