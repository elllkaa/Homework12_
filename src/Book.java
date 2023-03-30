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

    public int hashCode() {
        return java.util.Objects.hash(author);
    }


}
