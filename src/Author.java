public class Author {

    private final String name;
    private final String surname;

    public Author( String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return "Имя " + this.name + "Фамилия " + this.surname;
    }

    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
