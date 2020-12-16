package University;

public class Professor extends Person implements ProfessorMethods {

	private int	experience;

	public Professor(String name, int age, String contactDetails, int experience) {
		super(name, age, contactDetails);
		this.experience = experience;
	}

	public int getExperience() { return this.experience; }

	@Override
	public String toString() { return super.toString() + " Experience: " + getExperience(); }
}
