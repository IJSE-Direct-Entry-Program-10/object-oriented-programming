package lk.ijse.dep10.oop;

public class Overriding2 {

    public static void main(String[] args) {
        S s = new S();
        //System.out.println(t.x);
        s.myMethod2();
    }
}

class MySuper extends Object{}
class MySub extends MySuper{}

class K{
    public int x = 10;
    public void myMethod(){                     // <- Override (Non-static method)
        System.out.println("K:x=" + x);
    }
}

class T extends K{
    public int x = 20;
    public static void myStaticMethod(){        // <- Hide
        System.out.println("T's static Method()");
    }
    public void myMethod(){                     // <- Override (Non-static method)
        System.out.println("T:x=" + x);
    }
    public void myMethod2(){
        System.out.println(x);
    }
}

class S extends T{
    public int x = 30;
    public static void myStaticMethod(){
        System.out.println("S's static Method()");
    }
    public void myMethod(){
        System.out.println("S:x=" + x);
    }
}
