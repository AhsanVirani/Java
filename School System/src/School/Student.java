package School;

/**
 * This class is responsible for keeping
 * track of students
 * fees, name, grade, & fees paid
 * **/

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /*
     * Our constructor to initialize a School.Student object
     * @param id -> ID of the student
     * @param name -> Name of the student
     * @param grade -> Grade of the student
     * */

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /*
     * Usd to update the student's grade
     * @param grade new grade of the student*/
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /* Keep adding fees to feesPaid Field */

    public void payFees(int fees) {
        feesPaid += fees;
    }

    /* List of getter functions down below*/

    /* @Return ID of the student*/
    public int getId() {
        return id;
    }
    /* @Return name of the student*/
    public String getName() {
        return name;
    }

    /* @Return grade of the student*/
    public int getGrade() {
        return grade;
    }

    /* @Return fees paid by the student*/
    public int getFeesPaid() {
        return feesPaid;
    }

    /* @Return totalFees paid by the student*/
    public int getFeesTotal() {
        return feesTotal;
    }

    /*
    * @return the remaining fees
    * */
    public int getRemainingFrees() {
        return feesTotal - feesPaid;
    }

}


