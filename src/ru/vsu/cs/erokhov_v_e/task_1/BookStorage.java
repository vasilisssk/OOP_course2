package ru.vsu.cs.erokhov_v_e.task_1;

public abstract class BookStorage {
    private static int someInt;
    private static int someInt2;
    static {
        someInt = Util.setAndCheck(99);
        someInt2 = Util.setAndCheck(100);
    }
    private String myName = Util.setAndCheck("Walter White!");
    private int myAge = Util.setAndCheck(1919);
    private static String someString = Util.setAndCheck("ХРАНИЛИЩЕ!");
    private static String someString2 = Util.setAndCheck("ЭТО ВТОРОЕ ХРАНИЛИЩЕ!");
    abstract void addBook(Book book);
    abstract void addBooks(Book... books);
}