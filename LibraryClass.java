class Book {
    String title, author;
    Book(String title) {
        this.title = title;
    }
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
public class LibraryClass {
    public static void main(String[] args) {
        Book b1 = new Book("statistic");
        Book b2 = new Book("statistic", "K.C Bhuiya");
        System.out.println(" Book 1 ");
        System.out.println("title " + b1.title);
        System.out.println("author " + b1.author);
        System.out.println(" Book 2");
        System.out.println("title " + b2.title);
        System.out.println("author " + b2.author);
    }
}
