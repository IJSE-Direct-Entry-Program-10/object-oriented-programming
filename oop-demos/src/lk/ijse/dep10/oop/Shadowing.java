package lk.ijse.dep10.oop;

public class Shadowing {

    static int x = 10;

    public static void main(String[] args) {
        String x = "Something";

        new Object(){
            {
                int x = 20;
                System.out.println(x);
                System.out.println(Shadowing.x);
            }
        };
    }
}
