import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
        System.out.println("Книга 1");
        Book theShining =  new Book ("С. Кинг",  1997, "Cияние");
        System.out.println("theShining.author = " + theShining.getAuthor());
        System.out.println("theShining.year = " + theShining.getYear());
        System.out.println("theShining.book = " + theShining.getNameBook());
        System.out.println(theShining);
        Author shining = new Author("Стивен ","Кинг" );
        Author shining2 = shining;
        System.out.println("shining.equals(shining2)?" + true);
        System.out.println("shining.name = " + shining.getName());
        System.out.println("shining.year = " + shining.getSurname());
        System.out.println(shining);
        System.out.println();

        System.out.println("Книга 2");
        Book theTintenhers = new Book("К. Фукне", 2003, "Чернильное сердце");
        Book theTintenhers2 = new Book("М.Булгаков", 1940, "Мастер и Маргарита");
        System.out.println("theTintenhers.equals(theTintenhers2)?" + (theTintenhers.equals(theTintenhers2)));
        System.out.println("theShining.equals(theTintenhers)?" + (theShining == theTintenhers));
        System.out.println("theTintenhers.Author = " + theTintenhers.getAuthor());
        System.out.println("theTintenhers.year = " + theTintenhers.getYear());
        System.out.println("theTintenhers.book = " +theTintenhers.getNameBook());
        System.out.println(theTintenhers);
        theTintenhers.setYear(2000);
        Author tintenhers = new Author("Корнелия ", "Фукне");
        System.out.println("shining.equals(tintenhers) " + (shining.equals(tintenhers)));
        System.out.println("tintenhers.name = " + tintenhers.getName());
        System.out.println("tintenhers.surname = " + tintenhers.getSurname());
        System.out.println(tintenhers);

    }



}


