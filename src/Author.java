//2.Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public String getFirstName() {
        return (firstName);
    }
    public String getSecondName() {
        return (secondName);
    }
}

