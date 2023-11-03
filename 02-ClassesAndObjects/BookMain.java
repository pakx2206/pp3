public class BookMain 
{
    public static void main(String[] args) 
    {
        Books b = new Books(); 
        b.Pages = 400;
        b.Title = "Beyonders";
        b.Author = "Brandon Mull";
        b.displayInfo();
        b.read(57);
        b.PagesLeft();
        

    }
}
