package lk.ijse.dep10.oop.exercise;

public class Exercise02 {
    public static void main(String[] args) {
        Student s001;
        System.out.println(s001 = new Student(1,"Kasun", "077-111"));
        // new Student + Student(1, "Kasun", "077-1234567")
        // 1, Kasun, 077-111

        Student s002 = new Student();
        // new Student + Student()

        s002.name = s001.name;
        System.out.println(s002);
    }
}

class Student{
    int id;
    String name;
    String contactNumber;

    public Student() {  // No arg constructor
        this(5, "Ruwan", "022-111");
        System.out.println("No Arg Constructor()");
    }

    public Student(int id, String name, String contactNumber) { // Full args constructor (All-args constructor)
        super();
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        System.out.println("All Args Constructor");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
