public class Main {
    public static void main(String[] args) {
        //6. В методе main создайте несколько объектов «Книга» (достаточно двух) и
        //несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их.
        //Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
        Book book1 = new Book("Headless Horseman",new Author("Mayne","Reid"),1865);
        Book book2 = new Book("Hearts of Three",new Author("Jack","London"),1919);

        //7.В том же методе main измените год публикации одной из книг с помощью сеттера.
        book2.setPublicationYear(1920);

        System.out.println("book2.getName() = " + book2.getName());
        System.out.println("book2.getAuthor() = " + book2.getAuthor());
        System.out.println("book2.getAuthor().getFirstName() = " + book2.getAuthor().getFirstName());
        System.out.println("book2.getAuthor().getSecondName() = " + book2.getAuthor().getSecondName());
        System.out.println("book2.getPublicationYear() = " + book2.getPublicationYear());
    }
}