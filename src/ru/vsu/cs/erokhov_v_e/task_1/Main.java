package ru.vsu.cs.erokhov_v_e.task_1;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Гарри Чпокер и узник Гулага", "Джоан Боулинг", 500, "Фэнтези", 600);
        Book book2 = new Book("Зеленый километр", "Стивен Квин", 350, "Фэнтези", 550);
        Book book3 = new Book("Весь Холм Шерлокс (разборник)", "Андрей Каноэ Дойл", 700, "Детектив", 1150);
        Book book4 = new Book("Ходячий ключ", "Хеллоу Митыдзаки", 200, "Аниме", 350);
        Book book5 = new Book("Приключения матроса Честнягагеля", "Андрей Красов", 178, "Приключения", 123);
        Book book6 = new Book("Гарри Чпокер и физматовский камэнь", "Джоан Боулинг", 10, "Фэнтези", 520);

        Category bestseller = new Category("bestseller");
        Category forKids = new Category("forKids");
        Category magic = new Category("magic");
        Category forAdults = new Category("forAdults");
        Category discount = new Category("discount");
        bestseller.addBooks(book1, book2, book3, book6);
        forKids.addBooks(book1, book3, book4, book5, book6);
        magic.addBooks(book1, book6);
        forAdults.addBooks(book2);
        discount.addBooks(book4, book6);
        System.out.println("Книги категории bestseller: " + bestseller.getBooks().toString() + " | " + bestseller.getBooksAmount());
        System.out.println("Книги категории forKids: " + forKids.getBooks().toString() + " | " + forKids.getBooksAmount());
        System.out.println("Книги категории magic: " + magic.getBooks().toString() + " | " + magic.getBooksAmount());
        System.out.println("Книги категории forAdults: " + forAdults.getBooks().toString() + " | " + forAdults.getBooksAmount());
        System.out.println("Книги категории discount: " + discount.getBooks().toString() + " | " + discount.getBooksAmount());
        System.out.println("\n");
        System.out.println("Категории книги book1: " + book1.getCategories().toString());
        System.out.println("Категории книги book2: " + book2.getCategories().toString());
        System.out.println("Категории книги book3: " + book3.getCategories().toString());
        System.out.println("Категории книги book4: " + book4.getCategories().toString());
        System.out.println("Категории книги book5: " + book5.getCategories().toString());
        System.out.println("Категории книги book6: " + book6.getCategories().toString());
        System.out.println("\n");

        Stack stackN1 = new Stack(1,3);
        stackN1.addBooks(book1, book2, book3, book4);
        System.out.println("Список книг в первом шкафу: " + stackN1.getBooks().toString());
        stackN1.addBook(book5);
        System.out.println("Список книг в первом шкафу: " + stackN1.getBooks().toString());
        System.out.println("Книги одного автора в первом шкафу: " + stackN1.findBookByAuthor("Джоан Боулинг").toString());
        System.out.println("Книги одного жанра в первом шкафу: " + stackN1.findBookByGenre("Фэнтези").toString());
        System.out.println("\n");

        Stack stackN2 = new Stack(2, 3);
        stackN2.addBooks(book1, book5);
        System.out.println("Есть ли book1 во втором шкафу: " + stackN2.hasExactBook(book1));
        System.out.println("Книги одного автора во втором шкафу: " + stackN2.findBookByAuthor("Джоан Боулинг").toString());
        stackN2.addBook(book6);
        System.out.println("Книги одного автора во втором шкафу: " + stackN2.findBookByAuthor("Джоан Боулинг").toString());
        System.out.println("\n");

//        System.out.println("Список книг в первом шкафу: " + stackN1.getBooks().toString());
//        System.out.println("Список книг во втором шкафу: " + stackN2.getBooks().toString());
        System.out.printf("Номера шкафов, где лежит книга " + "\"" + "%1s" + "\" " + ": " + book1.getStackNumbers().toString() + "\n", book1.getName());
        System.out.printf("Номера шкафов, где лежит книга " + "\"" + "%1s" + "\" " + ": " + book2.getStackNumbers().toString() + "\n", book2.getName());
        System.out.printf("Номера шкафов, где лежит книга " + "\"" + "%1s" + "\" " + ": " + book3.getStackNumbers().toString() + "\n", book3.getName());
        System.out.printf("Номера шкафов, где лежит книга " + "\"" + "%1s" + "\" " + ": " + book4.getStackNumbers().toString() + "\n", book4.getName());
        System.out.printf("Номера шкафов, где лежит книга " + "\"" + "%1s" + "\" " + ": " + book5.getStackNumbers().toString() + "\n", book5.getName());
        System.out.printf("Номера шкафов, где лежит книга " + "\"" + "%1s" + "\" " + ": " + book6.getStackNumbers().toString() + "\n", book6.getName());
        System.out.println("\n");

        System.out.println("Список книг в первом шкафу: " + stackN1.getBooks().toString());
        System.out.println("Список книг во втором шкафу: " + stackN2.getBooks().toString());
        System.out.printf("Количество экземпляров книги " + "\"" + "%1s" + "\" " + ": " + book1.getCopiesNumber() + "\n", book1.getName());
        System.out.printf("Количество экземпляров книги " + "\"" + "%1s" + "\" " + ": " + book2.getCopiesNumber() + "\n", book2.getName());
        System.out.printf("Количество экземпляров книги " + "\"" + "%1s" + "\" " + ": " + book3.getCopiesNumber() + "\n", book3.getName());
        System.out.printf("Количество экземпляров книги " + "\"" + "%1s" + "\" " + ": " + book4.getCopiesNumber() + "\n", book4.getName());
        System.out.printf("Количество экземпляров книги " + "\"" + "%1s" + "\" " + ": " + book5.getCopiesNumber() + "\n", book5.getName());
        System.out.printf("Количество экземпляров книги " + "\"" + "%1s" + "\" " + ": " + book6.getCopiesNumber() + "\n", book6.getName());
        System.out.println("\n");
    }
}
