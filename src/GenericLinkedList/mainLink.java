package GenericLinkedList;

public class mainLink {

	public static <T, U> boolean eq(T data, U val) {
		if (data.equals(val))
			return true;
		return false;
	}

	public static <T> void arrPrint(T[] data) {
		System.out.print("[");
		for (int i = 0; i < data.length; i++) {
			if (i + 1 == data.length)
				System.out.print(data[i] + "]");
			else
				System.out.print(data[i] + ", ");
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		System.out.println(list);
		list.delete(7);
		System.out.println(list);
		System.out.println(eq(1, 1.0));
		Integer[] arr = { 2, 5, 8, 9 };
		// String[] arr = { "sivan", "shai", "mom" };
		arrPrint(arr);
	}

}
