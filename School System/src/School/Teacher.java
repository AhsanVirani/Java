package School;

/*This class is responsible for keeping the track of teachers name, id and salary*/
public class Teacher {

    private int id;
    private String name;
    private int salary;

    /*Creates a new School.Teacher object
    * @param id id for the teacher
    * @param name name for the teacher
    * @param salary salary for the teacher
    * */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /* @return the name*/
    public String getName() {
        return this.name;
    }

    /* @return the id*/
    public int getId() {
        return this.id;
    }

    /* @return the salary*/
    public int getSalary() {
        return this.salary;
    }

    /* Set the salary
    * @param salary*/
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
