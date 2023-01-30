package lk.ijse.dep10.oop;

public class TemplateLoader {

    static {
        System.out.println("Template Loader Static Initializer");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Template Loader main()");
        //System.out.println(MyTemplate.y);
        System.out.println("-----------------");
        new MyTemplate();

//        Class.forName("lk.ijse.dep10.oop.MyTemplate");
//        Class.forName("lk.ijse.dep10.oop.MyTemplate");
//        Class.forName("lk.ijse.dep10.oop.MyTemplate");
//        Class.forName("lk.ijse.dep10.oop.MyTemplate");
//        Class.forName("lk.ijse.dep10.oop.MyTemplate");

//        new MyTemplate();
//        System.out.println("=======================");
//        new MyTemplate();
//        new MyTemplate();
//        new MyTemplate();
//        new MyTemplate();


    }
}

class MyTemplate{

    int x = 10;
    static int y = 20;

    public MyTemplate() {
        System.out.println("My Template Constructor()");
    }

    static {
        System.out.println("My Template Static Initializer");
    }

    public static void main(String[] args) {
        System.out.println("My Template Main()");
    }

    static void doSomething(){
        System.out.println("My Template doSomething()");
    }

}
