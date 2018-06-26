public class Book
{
    private String title;
    private String author;
    private int id;

    public Book(String title, String author, int id)
    {
        this.title = title;
        this.author = author;
        this.id = id;   
    }

    public String toString()
    {
        return title + " " + author + " " + id;
    }
}
