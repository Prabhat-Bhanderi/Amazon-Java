package amazon.learn.week1.Object;

public class Car {
    double enginePower;
    double speed;

    static void main(String[] args) {
        Car BMW = new Car();
        BMW.enginePower = 2.5;
        BMW.speed = 300;

        Car Audi = new Car();
        Audi.enginePower = 2.5;
        Audi.speed = 280;

        if(BMW.speed < Audi.speed){
            System.out.println("Audi is faster than BMW");
        } else if(BMW.speed > Audi.speed){
            System.out.println("BMW is faster than Audi");
        } else {
            System.out.println("Both cars have the same speed");
        }
    }
}
