import java. util.ArrayList;
import java.util.List;
public class Library
 {
    private List<Book>books;
    public Library()
    {
        books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println(book.getTitle()+"the book is added");
    }
    public void DisplyAllBook(){
        for(Book book:books){
            book.DisplyDetails();
        }
    }


}
