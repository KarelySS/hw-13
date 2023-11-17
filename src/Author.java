import java.util.Objects;

public class Author {
    private final String firstName;
    private final String middleName;

    public Author(String firstName, String middleName) {
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return firstName+" "+middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(middleName, author.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName);
    }

    public String getMiddleName() {
        return middleName;

    }
}
