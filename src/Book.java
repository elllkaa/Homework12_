public class Book {
    private final Author author;
    private final Book book;
    private int year;

    public Book(Author author, int year, Book book) {
        this.author = author;
        this.year = year;
        this.book = book;
    }

    public Author getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }

    public Book getBook() {
        return this.book;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
