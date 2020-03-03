package ExtendsPractice;

public class Person {
	private String name;
	private String id;

	public Person(String name, String id) { // constructor
		setName(name);
		setId(id);
	}

	public Person(Person other) { // copy constructor
		this(other.getName(), other.getId());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id.length() == 9)
			this.id = id;
		else
			System.out.println("ID must be 9 digits");
	}

	public String toString() {
		return "Worker name : " + this.name + " id: " + this.id;
	}

}
