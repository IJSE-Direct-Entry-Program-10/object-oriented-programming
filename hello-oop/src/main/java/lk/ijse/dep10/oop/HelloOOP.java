package lk.ijse.dep10.oop;

import javax.swing.*;
import java.util.Scanner;

public class HelloOOP {

    public static void main(String[] args) throws ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);       // Java SE
        MyClass myClass = new MyClass();                // Mine
        MyClass myClass2 = new MyClass();                // Mine

        System.out.println(myClass instanceof MyClass);

        String myStr = new String();                    // Java SE

        JFrame myFrame = new JFrame("My Frame");    // Java SE

        myFrame.setSize(500,500);
        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
