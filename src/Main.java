public class Main {
    public static void main(String[] args) {
        Author tolstoi = new Author("Лев", "Толстой");
        Book book = new Book("Война и мир", tolstoi, 1869);
        Author gogol = new Author("Николай", "Гоголь");
        Book book1 = new Book("Мертвые души", gogol, 1842);
        book.setPublishingYear(1880);
        System.out.println(tolstoi);
        System.out.println(book);
        System.out.println(gogol);
        System.out.println(book1);
    }
}
