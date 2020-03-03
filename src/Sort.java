
public class Sort {
	public static void bubbleSort(Sortable[] arr) {
		boolean flag = true;
		for (int i = arr.length - 1; i >= 0 && flag; i--) {
			flag = false;
			for (int j = 0; j < i; j++) {
				if (arr[j].compare(arr[j + 1]) > 0) {
					Sortable temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
		}
	}
}
