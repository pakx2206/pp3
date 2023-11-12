public class CinemaTicket {
    static String cinemaName = "Kino Marzenie";

    String filmName;
    int row;
    int seat;
    double price;

    public CinemaTicket(String filmName, int row, int seat, float price){
        this.filmName = filmName;
        this.row = row;
        this.seat = seat;
        this.price = price;
    }

    public CinemaTicket(String filmName, int row, int seat){
        this.filmName = filmName;
        this.row = row;
        this.seat = seat;
        if (row <= 2) {
            price = 10f;
        }else{
            price = 25f;
        }
    }
    public String toString(){
        return String.format("Cinema name:\t%s\nFilm name::\t%s\nRow:\t%s\nSeat:\t%s\nPrice:\t%s",cinemaName,filmName,row,seat,price);
    }
}
