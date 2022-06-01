package myapp.core;

public class Honda extends Car {

    public Honda() {
        this.setMake("Honda\n");
    }

    public void accelerate() {
        System.out.println("Super Vrooms\n");
    }

    // You could check if you are overriding by doing this:
    @Override
    public void stop() {
        System.out.println("Stopping.... Stopped!");
    }
}
