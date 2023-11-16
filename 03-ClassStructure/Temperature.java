public class Temperature {
    double celsius;
    double kelvin;
    double fahrenheit;

    public double CelsiusToKelvin(){
        kelvin = celsius + 273;
        return kelvin;
    }
    public double CelsiusToFrahrenheit(){
        fahrenheit = (celsius*9/5)+32;
        return fahrenheit;
    }
    public double KelvinToFahrenheit(){
        fahrenheit = ((kelvin - 273)*1.8f)+32;
        return fahrenheit;
    }
    public double KelvinToCelsius(){
        celsius = kelvin - 273;
        return celsius;
    }
    public double FahrenheitToKelvin(){
        kelvin = ((fahrenheit - 32)/1.8f)-273;
        return kelvin;
    }
    public double FahrenheitToCelsius(){
        celsius = (fahrenheit - 32)/1.8f;
        return celsius;
    }

}
