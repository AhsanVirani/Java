package School;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher lizz = new Teacher(1, "Lizz", 500);
        Teacher melisa = new Teacher(2, "Melisa", 700);
        Teacher bryan = new Teacher(3, "Bryan", 600);

        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizz);
        teacherList.add(melisa);
        teacherList.add(bryan);

        Student faiz = new Student(1, "FaizBherwa", 10);
        Student alice = new Student(2, "Alice", 4);
        Student grace = new Student(3, "Grace", 12);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(faiz);
        studentList.add(alice);
        studentList.add(grace);

        School hhps = new School(teacherList, studentList);
        System.out.println("Hornsby Heights Public School.School has earned $" + hhps.getTotalMoneyEarned());

        faiz.payFees(5000);

    }
}
