package main.java;

import main.java.vehicles.Car;
import main.java.vehicles.Plane;
import main.java.vehicles.Vehicle;

public class Main {
    public static void main(String[] args){
        Vehicle car = new Car(5, "Disel", 100);
        Vehicle plane = new Plane(100, "Electric", 100);
        car.travel("Colorado");
        plane.travel("Warsaw");
    }
}
