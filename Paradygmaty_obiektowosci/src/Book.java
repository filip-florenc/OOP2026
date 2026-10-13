public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author)
    {
        this.title=title;
        this.author=author;
        this.available=true;
    }

    public void borrow()
    {
        if(available)
        {
            available=false;
            System.out.println("Książka \""+title+"\" została wypożyczona");
        }
        else
        {
            System.out.println("Książka jest niedostępna");
        }
    };
    public void returnBook()
    {
        if(available==true)
        {
            System.out.println("Książka \""+title+"\" nie była wypożyczona");
        }
        else
        {
            available = true;
            System.out.println("Książka została oddana!");
        }
    };

    public void pokazStatus()
    {
        if(available==true)
        {
            System.out.println("Książka \""+title+"\" jest dostępna");
        }
        else
        {
            System.out.println("Książka \""+title+"\" jest niedostępna");
        }
    }



    public static void main(String[] args) {
        Book ksiazka1 = new Book("Pan Tadeusz","Adam Mickiewicz");
        Book ksiazka2 = new Book("Harry Potter","J.K. Rowling");
        Book ksiazka3 = new Book("Rok 1984","George Orwell");

        ksiazka1.pokazStatus();
        ksiazka1.borrow();
        ksiazka1.pokazStatus();
        ksiazka1.borrow();
        ksiazka1.returnBook();
        ksiazka1.pokazStatus();

    }
};