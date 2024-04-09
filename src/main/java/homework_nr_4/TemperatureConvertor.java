package homework_nr_4;

public class TemperatureConvertor {

    public static void main(String[] args) {

toCelsius();
toFahrenheit();

TemperatureConvertor convertCelsius = new TemperatureConvertor(0.0, 200);
TemperatureConvertor convertFahrenheit = new TemperatureConvertor ( 200, 0.0);

        toCelsius();
        toFahrenheit();
    }
    static double fahrenheit = 100.0;

        static void toCelsius(){
         double result;
         result = (fahrenheit - 32) / 1.8;
         System.out.println("fahrenheit to celsius the value is :" + result);
        }

        static double celsius = 100;

        static void toFahrenheit() {
            double result = (celsius * 9 / 5) + 32;
            System.out.println("celsius to fahrenheit the value is " + result);
        }

    public TemperatureConvertor(double celsius , double fahrenheit) {
            this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }
}
