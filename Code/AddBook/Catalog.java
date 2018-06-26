import java.util.ArrayList;
public class Catalog
{
    ArrayList<Book> books = new ArrayList<Book>();


    public Catalog()
    {
    }

    public boolean insertBook(Book book)
    {
        boolean result = books.add(book);
        return result; // true eller false
    } 
}
