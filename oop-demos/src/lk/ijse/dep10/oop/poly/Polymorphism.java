package lk.ijse.dep10.oop.poly;

public class Polymorphism {

    public static void main(String[] args) {
        Car prius = new Prius();
        prius.advancedBrakingSystem();
        Car bugati = new Bugati();
        bugati.advancedBrakingSystem();

//        Car myCar = prius;
//        System.out.println(myCar);
//        myCar = bugati;
//        System.out.println(myCar);

//        System.out.println(prius);
//        System.out.println(myCar);
//        System.out.println(myCar == prius);
//        Vehicle vehicle = prius;
//        System.out.println(vehicle == prius);
    }
}

class Vehicle{
    public void horn(){}
    public void accelerate(){}
    public void pushBreak(){}
}

class Car extends Vehicle{
    public void advancedBrakingSystem() {
        System.out.println("Car Advanced Braking System");
    }
}

class Prius extends Car {
    public void hybrid(){}
    public void advancedBrakingSystem(){
        System.out.println("Prius Advanced Braking System");
    }
}

class Bugati extends Car {
    public void turboAcceleration(){}
    public void advancedBrakingSystem(){
        System.out.println("Bugati Advanced Braking System");
    }
}

