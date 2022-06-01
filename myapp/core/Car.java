package myapp.core;

/**
 * Car
 */
public class Car {

    // Properties of the class
    private String color;
    private String make;
    private Integer engineCapacity;
    private Boolean started = false;

    // Need to define a method to 1) Get the properties and 2) Set the properties
    // Also commonly known as "getters" & "setters"

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void isStarted(Boolean started) {
        this.started = started;
    }

    // Behavior a.k.a Methods
    public void start() {
        if (this.started) {
            System.out.println("You car is running\n");
        } else {
            this.started = true;
            System.out.println("Vrooommmmmmm\n");
        }
    }

    public void stop() {
        if (!this.started) {
            System.out.println("Your car wasn't running\n");
        } else {
            this.started = false;
            System.out.println("Car has stopped\n");

        }
    }
}