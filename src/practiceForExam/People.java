package practiceForExam;

public class People {
	private String Name;
	private String Last_Name;
	private int age;

	public People() {
		System.out.println("People");
	}
	public People(int x, int y) {
		System.out.println("People");
	}

	public People(String Name, String lName, int age) {
		this.Name = Name;
		this.Last_Name = lName;
		this.age = age;
	}

	private void printName() {
		System.out.println("name: " + Last_Name);
	}

}
