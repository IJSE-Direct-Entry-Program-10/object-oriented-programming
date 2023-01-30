package lk.ijse.dep10.oop;

public class InstanceCreation {

    public static void main(String[] args) {
        Customer c001 = new Customer();
        System.out.println("=========");
        Customer c002 = new Customer();

        System.out.println(c001.id);
        c001.id=3;
        System.out.println(c002.id);
        System.out.println(Customer.id);
        Customer.id= 5;
        System.out.println(c001.id);
        System.out.println(c002.id);

        c001.name = "Kasun";
        System.out.println(c001.name);
        c002.name = c001.name;
        System.out.println(c002.name);
        c001.name = "Nuwan";
        System.out.println(c001.name);
        System.out.println(c002.name);
    }
}

class Customer {
    static int id;
    static {
        System.out.println("Customer: Static Initializer 1");
    }
    {
        System.out.println("Customer: Instance Initializer 1");
    }
    String name;
    public Customer() {
        super();
        System.out.println("Customer: Constructor");
    }
    static {
        System.out.println("Customer: Static Initializer 2");
    }
    String address = "Panadura";
    {
        System.out.println("Customer: Instance Initializer 2");
//        System.out.println(name);
//        System.out.println(address);
    }
}
