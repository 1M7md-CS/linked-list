public class LinkedList<T> {
	private class Node {
		T item;
		Node next;

		Node(T item) {
			this.item = item;
			next = null;
		}

		Node() {
			next = null;
		}

	}

	private int length;
	private Node head, tail;

	LinkedList() {
		length = 0;
		tail = head = null;
	}


	public void addFirst(T item) {
		Node newNode = new Node(item);
		if (isEmpty()) {
			tail = head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public void addLast(T item) {
		Node newNode = new Node(item);
		if (isEmpty()) {
			tail = head = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public String printList() {
		if (isEmpty()) return "[]";

		Node ptr = head;
		StringBuilder sb = new StringBuilder("[");

		while (ptr != null) {
			sb.append(ptr.item);

			if (ptr.next != null) {
				sb.append(", ");
			}
			ptr = ptr.next;
		}
		sb.append("]");
		return sb.toString();
	}
}
