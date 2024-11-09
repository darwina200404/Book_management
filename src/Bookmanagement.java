public class Bookmanagement {
    public static void main(String[] args) {
        Library library=new Library();
        Book book1 = new Book("Java Fundamentals", "John Doe", (float) 29.99);
        EBook ebook = new EBook("Effective Java", "Joshua Bloch", (float) 19.99, 2.5);
        AudioBook audiobook = new AudioBook("Clean Code", "Robert C. Martin", (float)24.99, 6.5);
        library.addBook(book1);
        library.addBook(ebook);
        library.addBook(audiobook);
        System.out.println("\nAll Books in Library:");
        library. DisplyAllBook();


    }
}
