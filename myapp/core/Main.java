package myapp.core;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // Instantiate a car
        Car myCar = new Car();
        myCar.setColor("Red");
        myCar.setMake("Honda");
        myCar.setEngineCapacity(2000);
        myCar.start();

        // Instantiate another car
        Car myOtherCar = new Car();
        myOtherCar.setColor("Green");
        myOtherCar.setMake("Mustang");
        myOtherCar.setEngineCapacity(4000);
        myOtherCar.stop();
    }
}