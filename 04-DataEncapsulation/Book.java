public class Book {
    
    private String title;
    private int pages;
    
    public Book(String title, int pages){
        if (pages>0){
        this.title = title;
        this.pages = pages;
        }else{
            System.out.println("ERROR(pages must be >0)");
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        if(pages>0){
            this.pages = pages;
        }else{
            System.out.println("ERROR(pages must be >0)");
        }
    }
    public static void main(String[] args) {
        Book b = new Book("Beyonders", 350);

        System.out.println(b.getPages());
        System.out.println(b.getTitle());
        b.setPages(30);
        b.setTitle("Beyonders 2");
        System.out.println(b.getPages());
        System.out.println(b.getTitle());
    }

    

}
