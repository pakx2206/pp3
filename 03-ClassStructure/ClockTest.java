public class ClockTest {
    public static void main(String[] args) {
        Clock clock1 = new Clock(12, 47);
        clock1.displayTime();
        clock1.setClock(18,47);
        clock1.displayTime();
        clock1.setClock(9,3);
        clock1.displayTime();
        clock1.setClock(23,58);
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
    }
}
