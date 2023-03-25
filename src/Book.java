public class Book {
    private String Author;
    private int year;

    public Book(String Author, int year) {
        this.Author = Author;
        this.year = year;
    }
    public String getAuthor() {
        return this.Author;
    }
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
