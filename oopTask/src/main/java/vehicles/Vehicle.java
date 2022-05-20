package main.java.vehicles;

public abstract class Vehicle implements Actions{
    protected int passengerCapacity;
    protected String engineType;
    @Override
    public void startEngine(){
        System.out.println("Engine's started!");
    }

    public Vehicle(int passengerCapacity, String engineType) {
        this.passengerCapacity = passengerCapacity;
        this.engineType = engineType;
    }

    @Override
    public void stopEngine(){
        System.out.println("Engine's stopped!");
    }
}
