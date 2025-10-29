interface Engine {
    void start();
}

abstract class Vehicle {
    abstract void drive();
    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle implements Engine {
    public void start() {
        System.out.println("Car engine started");
    }
    void drive() {
        System.out.println("Car is driving");
    }
}

public class abstract_and_interferenc {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();
        c.stop();
    }
}
