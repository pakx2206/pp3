public class CinemaTicketTest {
    public static void main(String[] args) {
        firstOrder();
        secondOrder();
    }
    static void firstOrder(){
        CinemaTicket t1 = new CinemaTicket("Freedy", 2, 3, 20);
        System.out.println(t1.toString());
    }
    static void secondOrder(){
        CinemaTicket.cinemaName = "Multikino";
        CinemaTicket t1 = new CinemaTicket("Fasbear", 5, 8);
        System.out.println(t1.toString());
    }
}
