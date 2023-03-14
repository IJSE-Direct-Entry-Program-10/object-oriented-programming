package lk.ijse.dep10.oop.types;

public class Demo {

    int x = 20; // Property, Field, State, Attribute

    public static void main(String[] args) {
        TopLevelClass instance1 = new TopLevelClass();
        AnotherTopLevelClass instance2 = new AnotherTopLevelClass();
        new TopLevelClass.StaticNestedClass();

        new TopLevelClass().new RegularInnerClass();
        instance1.new RegularInnerClass();

        int x = 10; // Local Variable
        //new LocalInnerClass();

        class LocalInnerClass {

        }

        new LocalInnerClass();
    }
}

class TopLevelClass {
    class RegularInnerClass{
        int x = 10;
        {
            int x = 10;
            class LocalInnerClass{

            }
        }
        class RegularInner2Class{

        }
    }

    static class StaticNestedClass{

    }
}

class AnotherTopLevelClass{

}
