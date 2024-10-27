package ru.vsu.cs.erokhov_v_e.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private int pageAmount;
    private String genre;
    private double price;
    private List<Category> categories = new ArrayList<>();
    private int copiesNumber = 1; //кол-во экземпляров
    private int numberInStack = 0; //номер в шкафу, счет ведется с нижней полки слева
    private List<Integer> stackNumbers = new ArrayList<>(); //номер шкафов, где есть книга

    /*
    Категорию можно добавить потом
     */
    public Book(String name, String author, int pageAmount, String genre, double price) {
        this.name = name;
        this.author = author;
        this.pageAmount = pageAmount;
        this.genre = genre;
        this.price = price;
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = -(price);
        } else {
            this.price = price;
        }
    }

    public List<Category> getCategories() {
        return List.copyOf(categories);
    }

    public void setCategories(List<Category> categories) {
        this.categories = List.copyOf(categories);
    }

    public int getCopiesNumber() {
        return copiesNumber;
    }

    public void setCopiesNumber(int copiesNumber) {
        this.copiesNumber = copiesNumber;
    }

    public int getNumberInStack() {
        return numberInStack;
    }

    public void setNumberInStack(int numberInStack) {
        this.numberInStack = numberInStack;
    }

    public List<Integer> getStackNumbers() {
        return List.copyOf(stackNumbers);
    }

    public void setStackNumbers(int number) {
        this.stackNumbers.add(number);
    }
}
