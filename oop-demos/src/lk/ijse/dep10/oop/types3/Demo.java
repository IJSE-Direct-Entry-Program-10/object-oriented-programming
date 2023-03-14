package lk.ijse.dep10.oop.types3;

public class Demo {

    class RegularInnerClass {

        {
            class LocalInnerClass {}
        }
    }

    public static void main(String[] args) {

        class LocalInnerClass {

        }
    }
}

class TopLevelClass {
    static class NestedClass {
        class RegularInnerClass {
            {
                {
                    {
                        {
                            class LocalInnerClass {
                                class RegularInnerClass2 {

                                    public RegularInnerClass2() {
                                        class LocalInnerClass2 {

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
