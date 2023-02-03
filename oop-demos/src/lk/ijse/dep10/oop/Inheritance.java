package lk.ijse.dep10.oop;

public class Inheritance {

    public static void main(String[] args) {
        // new Car - Done!
        // Vehicle();
        Car car = new Car();
        car.printRegistrationNumber();
//        System.out.println("-------------");
//        Van van = new Van();
    }
}

class Vehicle {

    static {
        System.out.println("Vehicle class is being initialized");
    }

    String registrationNumber;

    {
        System.out.println("Vehicle object is being initialized");
    }

    public Vehicle() {
        super();
        System.out.println("Vehicle Constructor");
        System.out.println("Vehicle: " + this);
    }

    void printRegistrationNumber() {
        printInternal();
    }

    private void printInternal() {
        System.out.println(registrationNumber);
    }
}

class Car extends Vehicle {  // Car is a Vehicle

    static {
        System.out.println("Car class is being initialized");
    }

    {
        System.out.println("Car object is being initialized");
    }

    public Car() {
        super();
        System.out.println("Car Constructor");
        System.out.println("Car: " + this);
    }
}

//class Van extends Vehicle { // Van is a Vehicle
//
//    static {
//        System.out.println("Van class is being initialized");
//    }
//
//    {
//        System.out.println("Van object is being initialized");
//    }
//
//    public Van() {
//        System.out.println("Van Constructor");
//    }
//}
