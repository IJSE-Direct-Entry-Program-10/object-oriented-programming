package lk.ijse.dep10.oop;

import java.util.ArrayList;

public class AggregationDemo {

    public static void main(String[] args) {
        ArrayList<Program> programList = new ArrayList<>();
        programList.add(new Program("DEP", "5 Months"));
        programList.add(new Program("CMJD", "6 Months"));
        programList.add(new Program("GDSE", "2 Years"));

        Institute2 ijse = new Institute2(programList);
        System.out.println(ijse.getProgramList().get(0).name);

        ijse = null;

        /* Still I can access any program, because I have the reference to the program list */
        System.out.println(programList.get(0).name);
    }
}
