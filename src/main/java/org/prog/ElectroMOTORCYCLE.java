package org.prog;

public class ElectroMOTORCYCLE extends ElectricCar implements IMovable, ITurnable {
    @Override
    public void turnLeft() {
        System.out.println("ElectroMOTORCYCLE turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("ElectroMOTORCYCLE turning right");
    }
    @Override
    public void moveForward() {System.out.println("ElectroMOTORCYCLE moveForward");}
    @Override
    public void moveBackward() {System.out.println("ElectroMOTORCYCLE moveBackward");
    }
}
