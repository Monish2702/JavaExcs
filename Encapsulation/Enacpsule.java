//Encapsulation, copying objects,Copy Constructor

public class Enacpsule {
    public static void main(String[] args) {
        Car car1 = new Car(135, 5);
        Car car2 = new Car(200, 8);
        System.out.println(car1.getSpeed());
        System.out.println(car2.getSpeed());
        car2.copy(car1);
        System.out.println("After copy:");
        System.out.println(car1.getSpeed());
        System.out.println(car2.getSpeed());
        System.out.println("Changing the speed of car1");
        car1.setSpeed(100);
        System.out.println(car1.getSpeed());
    }
}

class Car {
    private int speed;
    private int gear;

    Car(int speed, int gear) {
        this.setSpeed(speed);
        this.setGear(gear);
    }
    //copy constructor but uses copy method itself
    Car(Car carToCopy) {
        // this.setSpeed(car.getSpeed()); //commented since we have the implementation of copy method
        // this.setGear(car.getGear());
        this.copy(carToCopy);
    }

    //getters and setters to access the private variables
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }
    public int getSpeed() {
        return speed;
    }
    public int getGear() {
        return gear;
    }

    //copy method to copy the values of the object
    public void copy(Car carToCopy) {
        this.speed = carToCopy.speed;
        this.gear = carToCopy.gear;
    }
}