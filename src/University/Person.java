package University;

public class Person implements PersonMethods {

    private String	name;
    private int	age;
    private String contactDetail;

    public Person(String name, int age, String contactDetail) {
        this.name	= name;
        this.age	= age;
        this.contactDetail	= contactDetail;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() { return this.age; }

    public String getContactDetail() {
        return this.contactDetail;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Age: " + getAge() + " Contact Detail: " + getContactDetail();
    }
}
