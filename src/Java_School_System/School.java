package Java_School_System;

import LinkedListGeneric.List;

import java.util.ArrayList;

public class School {

    private List<Teacher>  teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /*New school object is created
    * @param teachers list of teachers in the school
    * @param students list of students in the school*/
    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /*
    * @Returns the list of teachers in the school
    * */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /*
    * Adds a teacher to the school
    * @param teacher the teacher to be added
    * */
    public void addTeachers(Teacher teacher) {
        teachers.append(teacher);
    }

    /*
     * @Returns the list of Students in the school
     * */
    public List<Student> getStudents() {
        return students;
    }

    /*
    * Adds a student to the school
    * @param student the student to be added*/
    public void addStudents(Student student) {
        students.append(student);
    }

    /*
    * Returns the total money earned by the school
    * */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /*
    * Adds the total money earned by the school
    * @param MoneyEarned money earned by school that is supposed to be added*/
    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /*
    * @return the total money spent by the school
    * */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /*
    * Update the money that is spent by the school
    * @param MoneySpent the money
    * The salary given by the school to teachers
    * */
    public void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
