package vcnhan.example.sqliteexample;

public class Book {
    String title;
    int pages;
    String author;
    String id;

    public Book(String id, String title, int pages, String author) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.author = author;
    }
}
