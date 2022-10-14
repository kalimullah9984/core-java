import java.util.ArrayList;
import java.util.Collections;

public class TestCollection11 {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Viru"));
		al.add(new Employee("Saurav"));
		al.add(new Employee("Mukesh"));
		al.add(new Employee("Tahir"));

		Collections.sort(al);
		for (Employee s : al) {
			System.out.println(s.name);
		}
	}
}
