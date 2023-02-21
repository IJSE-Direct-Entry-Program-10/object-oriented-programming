package lk.ijse.dep10.oop;

public class Overloading2 {

    public static void main(String[] args) {
        B.myMethod(10);
        B.myMethod("ijse");
        new B().myMethod(10);
        new B().myMethod("ijse");
        new B().myMethod("ijse", 10);
    }
}

class A{
    public static void myMethod(String something){
        System.out.println("myMethod(String)");
    }
    public static void myMethod(int something){
        System.out.println("myMethod(int)");
    }
    public void myMethod(String something, int x){
        System.out.println("myMethod(something, x)");
    }
}

class B extends A{
    public static void myMethod(long something){
        System.out.println("myMethod(long)");
    }
}