package GenericLinkedList;

public class LinkedList<T> {
	private Node<T> head;
	private int size;

	public LinkedList() {
		this.head = null;
		this.size = 0;
	}

	public void add(T data) {
		if (head == null) {
			this.head = new Node<T>(data);
			size++;
			return;
		}

		// else (because theres is return we dont need to do else after, it will come
		// here if not true)
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Node<T>(data, temp);
		size++;
	}

	public void delete(T data) {
		if (head == null)
			return;
		boolean flag = true;
		Node<T> temp = head;
		while (temp.next != null && flag) {
			if (temp.data == data)
				flag = false;
			else
				temp = temp.next;
		}
		if (flag && temp.data == data) {
			temp.prev.next = null;
		} else {
			if (temp.prev == null) {
				head = temp.next;
				head.prev = null;
			} else {
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
			}
		}
		size--;
	}

	public String toString() {
		Node<T> temp = head;
		String ans = "";
		while (temp.next != null) {
			ans += (temp.data + " -> ");
			temp = temp.next;
		}
		ans += temp.data;
		return ans;
	}
}
