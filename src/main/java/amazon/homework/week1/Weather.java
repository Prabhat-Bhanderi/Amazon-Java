package amazon.homework.week1;

public class Weather {
    double temperature;

    static void main(String[] args) {
        Weather weather = new Weather();
        weather.temperature = 31;

        if(weather.temperature < 20){
            System.out.println("Weather is cold");
            System.out.println("Please wear jacket");
        }
        if(weather.temperature >= 20 && weather.temperature <= 30){
            System.out.println("Weather is good");
            System.out.println("Enjoy your day in a good weather");
        }
        if (weather.temperature > 30 ){
            System.out.println("Weather is hot");
            System.out.println("Stay hydrated");
        }
    }
}
