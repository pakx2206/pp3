public class MyCalendar {
    static int year = 2023;
    static int month = 12;
    static int day = 12;
    static int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    static String months[] = {"sty","lu","ma","kw","ma","cz","li","si","wr","pa","li","gr"};
    public static void main(String[] args) {
        System.out.println(myDate());
        System.out.println(days());
        System.out.println(monthName());
    }



    static String myDate(){
        return String.format("%04d-%02d-%02d", year, month, day);
    }
    static int days(){
        int sum = 0;
        for(int i = 0; i < month-1; i++){
            sum = sum + days[i];
        }
        return sum+day;
    }
    static String monthName(){
        return months[month-1];
    }
}
