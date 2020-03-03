import java.util.Arrays;


/**
 * point class is used to have an interface of comparable that java wrote
 */
public class TestPointInterFace {
	public static void main(String[] args) {

		Point[] arr = new Point[5];

		arr[0] = new Point(2, 2);
		arr[1] = new Point(7, 7);
		arr[2] = new Point(1, 1);
		arr[3] = new Point(9, 9);
		arr[4] = new Point(0, 0);

		System.out.println("before the sort: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Arrays.sort(arr);

		System.out.println("\nafter the sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
