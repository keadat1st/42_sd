import java.util.Scanner;

public class UserInterface
{
    public static void main(String[] args)
    {
        boolean more = true;

        while(more)
        {
             Scanner scan = new Scanner(System.in);

            // Vælg at tilføje en bog
            
            System.out.print("Title: ");
            String title = scan.nextLine();

            System.out.print("Author: ");
            String author = scan.nextLine();

            System.out.print("ID: ");
            int id = scan.nextInt();

            Library lib = new Library();

             System.out.println(lib.addBook(title,author, id));

            System.out.print("Add more books? ");
            String morestring = scan.next();
            if(morestring.equals("yes"))
            {
                more = true;
            } else {
                more = false;
            }
            
        }
       

    }
}
