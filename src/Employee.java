
public class Employee implements Sortable {
	private int SSnum;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int SSN, String first, String last, int sal) {
		SSnum = SSN;
		firstName = first;
		lastName = last;
		salary = sal;
	}

	@Override
	public int compare(Sortable other) { // comparing two social security num to define their place at the array
		return (((Employee) this).SSnum - ((Employee) other).SSnum);
	}

	public String toString() {
		String employee;
		employee = "< " + firstName + " " + lastName + " " + SSnum + " " + salary + " >";
		return employee;
	}

}
