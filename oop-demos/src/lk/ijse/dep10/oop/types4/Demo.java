package lk.ijse.dep10.oop.types4;

import java.io.Serializable;

public class Demo {

    public static void main(String[] args) {
        class LocalInnerClass {

        }

        new LocalInnerClass();

        new Object(){

            class RegularInnerClass {

            }

        }; // Anonymous Inner Class

        new Serializable(){

        };

        new Object();
        new Object(){};
    }
}
