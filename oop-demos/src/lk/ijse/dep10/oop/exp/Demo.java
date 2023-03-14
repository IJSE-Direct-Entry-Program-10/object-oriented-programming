package lk.ijse.dep10.oop.exp;

public class Demo {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.engine);
        Engine e = car.engine;
        car = null;
        System.out.println(e);
    }
}

class Car{
   Engine engine;

    public Car() {
        this.engine = new Engine();
    }

}

class Car2{
    Engine engine;

    public Car2(Engine engine) {
        this.engine = engine;
    }
}

class Engine{}

