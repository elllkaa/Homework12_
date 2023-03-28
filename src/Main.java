public class Main {
    public static void main(String[] args) {
        System.out.println("Книга 1");
        Book theShining =  new Book ("С. Кинг",  1997, "Cияние");
        System.out.println("theShining.author = " + theShining.getAuthor());
        System.out.println("theShining.nameBook = " + theShining.getYear());
        Author shining = new Author("Стивен ","Кинг" );
        System.out.println("shining.name = " + shining.getName());
        System.out.println("shining.year = " + shining.getSurname());
        System.out.println();

        System.out.println("Книга 2");
        Book theTintenhers = new Book("К. Фукне", 2003, "Чернильное сердце");
        System.out.println("theTintenhers.Author = " + theTintenhers.getAuthor());
        System.out.println("theTintenhers.nameBook = " + theTintenhers.getYear());
        theTintenhers.setYear(2000);
        Author tintenhers = new Author("Корнелия ", "Фукне");
        System.out.println("tintenhers.name = " + tintenhers.getName());
        System.out.println("tintenhers.year = " + tintenhers.getSurname());
        System.out.println("tintenhers.getYear() = " + tintenhers.getSurname());
    }
}