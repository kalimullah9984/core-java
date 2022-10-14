
public class Employee implements Comparable<Employee> {
	public String name;

	public Employee(String name) {
		this.name = name;
	}

	public int compareTo(Employee person) {
		return name.compareTo(person.name);

	}

}
