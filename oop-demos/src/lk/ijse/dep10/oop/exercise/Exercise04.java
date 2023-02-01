package lk.ijse.dep10.oop.exercise;

public class Exercise04 {

    public static void main(String[] args) {
//        String s1;                              // Reference s1 = new Teacher()
//        //Scanner s = (Scanner) new String();     // Reference s  = (Scanner) new String();
//        Teacher t1;                             // Reference t1 = new Scanner(System.in);

        // new Teacher  - Done!
        // Teacher()

        Teacher t1 = new Teacher();
        t1.printDetails();
    }
}

class Teacher {
    String nic;
    String name;
    String contact;

    public Teacher() {
    }

    public Teacher(String nic, String name, String contact) {
        super();
        this.nic = nic;
        this.name = name;
        this.contact = contact;
    }

    void printDetails() {
        String name = "Nuwan";
        System.out.printf("nic=%s, name=%s, contact=%s %n",
                nic, name, contact);
    }
}
