package lk.ijse.dep10.oop;

public class AppInitializer {

    int a = 10;
    static int x = 10;

    public AppInitializer() {
        System.out.println("Constructor()");
    }

    static {
        System.out.println("Static Initializer 1");
        System.out.println("x=" + x);
//        System.out.println(a);
//        System.out.println("y=" + y);
    }


    public static void main(String[] args) {
        System.out.println("Inside the main method");
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("Just about to exit the main method");
    }

    static int y = 20;

    static {
        System.out.println("Static Initializer 2");
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
