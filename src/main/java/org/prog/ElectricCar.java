package org.prog;


//TODO: add another class that extends electric car
public class ElectricCar extends Car implements ITurnable {

    public void driveElectric() {
        System.out.println("electric drive");
    }
    @Override
    public void turnLeft() {
        System.out.println("ElectricCar turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("ElectricCar turning right");
    }
}

