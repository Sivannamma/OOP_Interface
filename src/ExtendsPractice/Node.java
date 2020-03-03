package ExtendsPractice;

public class Node<T> {
	T data;
	Node<T> next;
	Node<T> prev;

	Node(T data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	Node(T data, Node<T> prev) {
		this.data = data;
		this.prev = prev;
		this.next = null;
	}
}
