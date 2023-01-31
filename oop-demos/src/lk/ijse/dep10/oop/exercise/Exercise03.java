package lk.ijse.dep10.oop.exercise;

public class Exercise03 {

    public static void main(String[] args) {

    }
}

class Employee {
    int id;
    String name;
    Spouse spouse;

    {
        System.out.println("Employee Instance Initializer");
    }

    public Employee(int id, String name, String spouseName, String spouseContact) {
        this(id, name, new Spouse(spouseName, spouseContact));
        System.out.println("Employee Constructor 1");
    }

    public Employee(int id, String name, Spouse spouse) {   // All Args Constructor
        this.id = id;
        this.name = name;
        this.spouse = spouse;
        System.out.println("Employee Constructor 2");
    }

    static{
        System.out.println("Employee Template is being initialized");
    }
}

class Spouse{
    String name;
    String contact;

    public Spouse(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    static {
        System.out.println("Spouse Template is being initialized");
    }
}
