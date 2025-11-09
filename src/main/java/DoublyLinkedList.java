public class DoublyLinkedList {

	private static class Node {
		int item;
		Node next, prev;

		Node(int item) {
			this.item = item;
			next = prev = null;
		}

	}

	private int length;
	private Node head, tail;

	DoublyLinkedList() {
		length = 0;
		tail = head = null;
	}

	public void addFirst(int item) {
		Node newNode = new Node(item);
		
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		
		length++;
	}

	public void addLast(int item) {
		Node newNode = new Node(item);
		
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
		
		length++;
	}

	public void addAtPos(int pos, int item) {

	}

	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return;
		}

		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
			head.prev = null;
		}

		length--;
	}

	public void removeLast() {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return;
		}

		if (head == tail) {
			head = tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
		}

		length--;
	}

	public void removeElement(int item) {

	}

	public void removeAtPos(int pos) {

	}

	public void reverse() {

	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int getLength() {
		return length;
	}

	public String toString() {
		return "";
	}

}
