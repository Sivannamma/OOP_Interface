package Practice;

public class mains1 {

	public static void main(String[] args) {

		Monom m = new Monom(2, 14);
		Monom f = new Monom(6, 14);
		Function_Comperator mono = new Function_Comperator(5);
		System.out.println(mono.compare(m, f));

	}

}
