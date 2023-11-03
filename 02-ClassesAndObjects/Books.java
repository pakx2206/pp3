public class Books 
{
    int Pages;
    String Title;
    String Author;
    int PagesRead = 0;
    int PagesLeft = Pages;


    void displayInfo()
    {
        System.out.println("Title: " + Title + "\nAuthor: " + Author);
    }
    void read(int PagesAreRead)
    {
        PagesRead = PagesRead + PagesAreRead;
        System.out.println("Already read: "+PagesRead);
    }
    void PagesLeft()
    {
        PagesLeft = Pages - PagesRead;
        System.out.println("Pages left: "+PagesLeft );
    }
}
