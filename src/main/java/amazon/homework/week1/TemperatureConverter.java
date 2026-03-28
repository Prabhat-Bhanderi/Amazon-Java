package amazon.homework.week1;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 37.0;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("%.1f°C = %.1f°F%n", celsius, fahrenheit);

        if (celsius >= 35)   {
            System.out.println("Scorching hot! Stay hydrated!");
        } else if (celsius >= 25) {
             System.out.println("Hot summer day! Great for the beach!");
        } else if (celsius >= 10) {
             System.out.println("A bit cool — bring a light jacket!");
        } else if (celsius >= 0)  {
             System.out.println("It's cold — bundle up!");
        }else {
            System.out.println("Freezing! Stay indoors!");
        }
    }
}