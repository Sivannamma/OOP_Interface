package ExtendsPractice;

public class Worker {
	private String name;
	private int id;
	private int salary;

	public Worker(String name, int id) { // constructor
		this.name = name;
		this.id = id;
	}

	public Worker(String name, int id, int salary) { // constructor
		this(name, id);
		this.salary = salary;
	}

	public Worker(Worker other) { // copy constructor
		this(other.getName(), other.getId(), other.getSalary());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Worker name : " + this.name + " id: " + this.id + " salary : " + this.salary;
	}

}
