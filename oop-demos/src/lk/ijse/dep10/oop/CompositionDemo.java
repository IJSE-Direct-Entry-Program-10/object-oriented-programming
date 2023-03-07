package lk.ijse.dep10.oop;

public class CompositionDemo {

    public static void main(String[] args) {
        Institute ijse = new Institute();
        Program program1 = ijse.getProgramList().get(0);
        System.out.println(program1.name);

        ijse = null;

        Program program = ijse.getProgramList().get(0);
        System.out.println(program.name);
    }

    private static void anotherContext(Institute institute){

    }
}