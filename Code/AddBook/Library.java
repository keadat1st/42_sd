public class Library
{
    Catalog cat = new Catalog();

    public Book addBook(String title, String author, int id)
    {
        Book book = new Book(title, author, id);
        cat.insertBook(book);
        return book;
    }
}
