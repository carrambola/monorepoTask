package main.java.vehicles;

public class Plane extends Vehicle{
    private int wingLength;

    public Plane(int passengerCapacity, String engineType, int wingLength) {
        super(passengerCapacity, engineType);
        this.wingLength = wingLength;
    }


    @Override
    public void travel(String destination) {
        startEngine();
        System.out.println("The plane's just flown to " + destination + "!");
        stopEngine();
    }
}
