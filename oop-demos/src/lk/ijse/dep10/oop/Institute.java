package lk.ijse.dep10.oop;

import java.util.ArrayList;

class Institute {
    private final ArrayList<Program> programList = new ArrayList<>();

    public Institute() {
        programList.add(new Program("DEP", "5 Months"));
        programList.add(new Program("CMJD", "6 Months"));
        programList.add(new Program("GDSE", "2 Years"));
    }

    public ArrayList<Program> getProgramList() {
        return programList;
    }
}