package lk.ijse.dep10.oop.types2;

public class Demo {

    public static void main(String[] args) {
        int x = 10;
    }
}

class A {   // Top-level

    class B {   // Regular Inner

        class C {   // Regular Inner

            {
                class LocalInnerClass {

                    {
                        //System.out.println(x);
                        int x = 10;
                        //new RegularInnerClass();
                        class RegularInnerClass {
                        }
                        new RegularInnerClass();
                    }

                }

                //new LocalInnerClass().new RegularInnerClass();

            }

            class D {   // Regular Inner

                class E {   // Regular Inner

                }

                {
                    class E {   // Local Inner

                    }
                }

            }

        }
    }
}