package lk.ijse.dep10.oop;

public class Overriding {

    public static void main(String[] args) {
        Sub sub = new Sub();
//        sub.myStaticMethod();
//        Super mySuper = sub;
//        mySuper.myStaticMethod();
//        System.out.println(mySuper);
//        System.out.println(sub);
//        System.out.println(sub == mySuper);
    }
}

class Super{
    public static void myStaticMethod(){
        System.out.println("Super:myStaticMethod()");
    }
}

class Mediator extends Super {

}

class Sub extends Mediator{
    public static void myStaticMethod(){
        System.out.println("Sub:myStaticMethod()");
    }
}
