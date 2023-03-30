import java.util.Objects;

public class Book {
    private final String author;
    private final String nameBook;
    private int year;

    public Book(String author, int year, String nameBook) {
        this.author = author;
        this.year = year;
        this.nameBook = nameBook;
    }

    public String getAuthor() {
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

    public String toString() {
        return "Автор " + this.author + " Название " + this.nameBook + " Год " + this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYear() == book.getYear() && getAuthor().equals(book.getAuthor()) && getNameBook().equals(book.getNameBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getNameBook(), getYear());
    }
}
