package ExtendsPractice;

/*
 * in this main we check when and where we can use generic and inheiritance
 * we know manager extends from worker, therefore we can use the same link of workers to add a manager
 * but in a list of manager we cant add worker to it.
 */

public class mainLink {

	public static void main(String[] args) {
		Worker A = new Worker("Sivan", 208479311, 250);
		Worker B = new Worker("shai", 203050121, 100);
		Manager C = new Manager("mom", 58632068, 3000);

		LinkedList<Worker> list = new LinkedList<Worker>();
		list.add(A);
		list.add(B);
		list.add(C);

		System.out.println(list);

		LinkedList<Manager> list1 = new LinkedList<Manager>();

		list1.add(C);
		// list1.add(A);
		System.out.println(list1);

	}

}
