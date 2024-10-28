package ru.vsu.cs.erokhov_v_e.task_1;

public class Main {

    public static void main(String[] args) {
        Book GCaPoG = new Book("Гарри Чпокер и узник Гулага", "Джоан Боулинг", 500, "Фэнтези", 600);
        Book GK = new Book("Зеленый километр", "Стивен Квин", 350, "Фэнтези", 550);
        Book AHS = new Book("Весь Холм Шерлокс (разборник)", "Андрей Каноэ Дойл", 700, "Детектив", 1150);
        Book WK = new Book("Ходячий ключ", "Хеллоу Митыдзаки", 200, "Аниме", 350);
        Book SChA = new Book("Приключения матроса Честнягагеля", "Андрей Красов", 178, "Приключения", 123);
        Book GCaPS = new Book("Гарри Чпокер и физматовский камэнь", "Джоан Боулинг", 200, "Фэнтези", 520);
        Book GCaSmoA = new Book("Гарри Чпокер и азбука СВО", "Джоан Боулинг", 354, "Фэнтези", 399);

        Category bestseller = new Category("bestseller");
        Category forKids = new Category("forKids");
        Category magic = new Category("magic");
        Category forAdults = new Category("forAdults");
        Category discount = new Category("discount");
        bestseller.addBooks(GCaPoG, GK, AHS, GCaPS);
        forKids.addBooks(GCaPoG, AHS, WK, SChA, GCaPS);
        magic.addBooks(GCaPoG, GCaPS);
        forAdults.addBooks(GK);
        discount.addBooks(WK, GCaPS);
        System.out.println("Книги категории bestseller: " + bestseller.getBooks().toString() + " | " + bestseller.getBooksAmount());
        System.out.println("Книги категории forKids: " + forKids.getBooks().toString() + " | " + forKids.getBooksAmount());
        System.out.println("Книги категории magic: " + magic.getBooks().toString() + " | " + magic.getBooksAmount());
        System.out.println("Книги категории forAdults: " + forAdults.getBooks().toString() + " | " + forAdults.getBooksAmount());
        System.out.println("Книги категории discount: " + discount.getBooks().toString() + " | " + discount.getBooksAmount());
        System.out.print("\n");
        System.out.println("Категории книги GCaPoG: " + GCaPoG.getCategories().toString());
        System.out.println("Категории книги GK: " + GK.getCategories().toString());
        System.out.println("Категории книги AHS: " + AHS.getCategories().toString());
        System.out.println("Категории книги WK: " + WK.getCategories().toString());
        System.out.println("Категории книги SChA: " + SChA.getCategories().toString());
        System.out.println("Категории книги GCaPS: " + GCaPS.getCategories().toString());
        System.out.print("\n");

        BookCloset bookCloset1 = new BookCloset(1);
        BookCloset bookCloset2 = new BookCloset(2);
        bookCloset1.addBooks(GCaPoG, GK, GCaPS);
        bookCloset2.addBooks(AHS, WK, SChA);
        bookCloset2.addBooks(AHS, WK, SChA);
        System.out.println(bookCloset1);
        System.out.println(bookCloset2);

        LibraryStorage libraryStorage = new LibraryStorage("Библиотека имени А. С. Пушкина");
        libraryStorage.addBook(GCaPoG);
        libraryStorage.addBook(GCaPS);
        libraryStorage.addBook(GK);
        libraryStorage.addBook(AHS);
        libraryStorage.addBook(GCaSmoA);
        libraryStorage.addBook(GCaSmoA);
        libraryStorage.addBook(GCaSmoA);
        libraryStorage.addBook(GCaSmoA);
        libraryStorage.addBook(GCaSmoA);
        System.out.println(libraryStorage);
    }
}
