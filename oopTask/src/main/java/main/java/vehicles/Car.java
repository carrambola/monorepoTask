package main.java.vehicles;

public class Car extends main.java.vehicles.Vehicle {
    private int trunkSize;

    public Car(int passengerCapacity, String engineType, int trunkSize) {
        super(passengerCapacity, engineType);
        this.trunkSize = trunkSize;
    }

    @Override
    public void travel(String destination) {
        startEngine();
        System.out.println("The car's just driven to " + destination + "!");
        stopEngine();
    }
}
