public class Book {
    private final Author author;
    private final String nameBook;
    private int year;

    public Book(Author author, int year, String nameBook) {
        this.author = author;
        this.year = year;
        this.nameBook = nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
