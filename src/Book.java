//1.Создайте класс Book, который содержит в себе данные о названии,
//авторе и годе публикации книги.
//Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    //3.Напишите конструкторы для обоих классов, заполняющие все поля.
    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    //4.Создайте геттеры для всех полей автора и всех полей книги.
    public String getName() {
        return (name);
    }
    public Author getAuthor() {
        return (author);
    }
    public int getPublicationYear() {
        return (publicationYear);
    }
    //5. Создайте сеттер для поля «Год публикации» у книги.
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

//2.Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
class Author {
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


