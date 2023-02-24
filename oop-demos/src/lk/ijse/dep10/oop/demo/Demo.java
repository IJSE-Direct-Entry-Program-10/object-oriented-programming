package lk.ijse.dep10.oop.demo;

import java.lang.reflect.Field;

class Demo {

    public static void main(String args[]) throws NoSuchFieldException, IllegalAccessException {
        C c = new C();
        c.myMethod();
        System.out.println(c);
//        Field x = A.class.getDeclaredField("x");
//        x.setAccessible(true);
//        Object o = x.get(c);
//        System.out.println(o);
    }
}

class A {
    int x = 10;
    void myMethod() throws Exception{
        System.out.println(x);
    }
}

class B extends A {
    static int x = 20;
    void myMethod(){
        System.out.println(x);
    }
}

class C extends B {
    void myMethod(){
        System.out.println(x);
    }
}