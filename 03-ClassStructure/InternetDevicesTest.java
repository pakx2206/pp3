public class InternetDevicesTest {
    public static void main(String[] args) {
        InternetDevice d1 = new InternetDevice("Phone");
        InternetDevice d2 = new InternetDevice("PC");
        InternetDevice d3 = new InternetDevice("Laptop");
        InternetDevice d4 = new InternetDevice("TV");
        InternetDevice d5 = new InternetDevice("Iphone");

        d1.connect();
        d2.connect();
        d2.disconnect();

        System.out.println(d3.displayStatus());
        InternetDevice.displayConnection();
    }
    }

