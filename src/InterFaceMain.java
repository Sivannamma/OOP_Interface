
public class InterFaceMain {

	/**
	 * employee class is used to have an interface of compare that we have to
	 * implement employee going through casting of sortable to its used
	 */

	/**
	 * Airplane class is an implement of IAirplane, IAirPlane is an extend of
	 * Vehicle class. so AirPlace has to implements the 4 function overall.
	 */

	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		arr[0] = new Employee(123, " Sivan", "Azari", 50000);
		arr[1] = new Employee(5, " Hen", "Azari", 50000);
		arr[2] = new Employee(7, " Ben", "Azari", 50000);
		arr[3] = new Employee(253, " Shai", "Azari", 50000);
		arr[4] = new Employee(76, " Tamar", "Azari", 50000);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println(" after sorting the array : \n");
		Sort.bubbleSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		/////////////////// *****//////////////////

		AirPlane[] a = new AirPlane[3];
		a[0] = new AirPlane(2345, "yellow");
		a[1] = new AirPlane(6789, "red");
		a[2] = new AirPlane(1357, " purple");

		System.out.println("before losing fuel:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		a[0].moveBack(7);
		a[0].moveForward(20);

		a[1].moveUp(50);
		
		System.out.println("\nafter losing fuel in some of the planes:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
