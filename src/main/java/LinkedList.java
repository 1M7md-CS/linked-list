public class LinkedList {
	private class Node {
		int item;
		Node next;

		Node(int item) {
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


	public void addFirst(int item) {
		Node newNode = new Node(item);
		if (isEmpty()) {
			tail = head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public void addLast(int item) {
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

	public void printList() {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.item);
			curr = curr.next;
		}
	}
}