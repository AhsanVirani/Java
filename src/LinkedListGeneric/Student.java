package LinkedListGeneric;

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


public class Student {

	private String	name;
	private int	age;

	public Student(String name, int age) {
		this.name	= name;
		this.age	= age;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Name: " + this.name.toString() + "\t Age: " + this.age;
	}

/**
	public static void main(String[] args) {
		Student ahsan = new Student("Ahsan", 22);
		System.out.println(ahsan.getName());
	}
**/
}




