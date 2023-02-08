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
    //Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
    @Override
    public String toString() {
        return firstName + " " +secondName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author2 = (Author) other;
        return firstName.equals(author2.firstName) &
                secondName.equals(author2.secondName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, secondName);
    }
}

