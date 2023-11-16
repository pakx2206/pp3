public class TemperatureTest {
    public static void main(String[] args) {
       Temperature t1 = new Temperature();
       t1.celsius = 25;
       System.out.println(t1.CelsiusToKelvin());
       System.out.println(t1.CelsiusToFrahrenheit());
       Temperature t2 = new Temperature();
       t2.fahrenheit = 100;
       System.out.println(t2.FahrenheitToKelvin());
       System.out.println(t2.FahrenheitToCelsius());
       Temperature t3 = new Temperature();
       t3.kelvin = 0;
       System.out.println(t3.KelvinToCelsius());
       System.out.println(t3.KelvinToFahrenheit());

        
    }
}
