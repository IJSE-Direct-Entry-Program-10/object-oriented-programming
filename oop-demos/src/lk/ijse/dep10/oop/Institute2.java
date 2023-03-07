package lk.ijse.dep10.oop;

import java.util.ArrayList;

class Institute2 {
    private final ArrayList<Program> programList;

    public Institute2(ArrayList<Program> programList) {
        this.programList = programList;
    }

    public ArrayList<Program> getProgramList() {
        return programList;
    }
}
