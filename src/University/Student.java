package University;

/**
access_modifier = {
	public,
	private,
	protected
}

<access_modifier> class <Class_Name> {

	// instance
	variable1;
	variable2;
	...

	// constructor
	<access_modifier> <Class_Name>(param1, param2) {
		variable1 = param1;
		variable2 = param2;
	}

	// method1


}
 
**/


public class Student extends Person {

	private int	year;

	public Student(String name, int age, String contactDetail, int year) {
		super(name, age, contactDetail);
		this.year	= year;
	}
/**
	public static void main(String[] args) {
		Student ahsan = new Student("Ahsan", 22);
		System.out.println(ahsan.getName());
	}
*
 * @return*/
	public int getYear() { return this.year; }

	@Override
	public String toString() { return super.toString() + " Year: " + getYear(); }
}




