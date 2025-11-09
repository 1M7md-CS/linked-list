public class LinkedList {

	private static class Node {
		int item;
		Node next;

		Node(int item) {
			this.item = item;
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

	public void addAtPos(int pos, int item) {
		if (pos < 0 || pos > length) {
			System.out.println("Invalid position: " + pos + ". Valid range: 0 to " + length);
			return;
		}

		if (pos == 0) {
			addFirst(item);
			return;
		}

		if (pos == length) {
			addLast(item);
			return;
		}

		Node curr = head, newNode = new Node(item);

		for (int i = 0; i < pos - 1; i++){
			curr = curr.next;
		}

		newNode.next = curr.next;
		curr.next = newNode;
		length++;

	}
	
	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return;
		}
		
		head = head.next;
		if (head == null) tail = null;
		length--;
	}

	public void removeLast() {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return;
		}
		
		if (head == tail) {
			removeFirst();
			return;
		}

		Node curr = head;
		while (curr.next != tail) {
			curr = curr.next;
		}
		tail = curr;
		tail.next = null;
		length--;
	}

	public void removeElement(int item) {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return;
		}
		
		if (head.item == item) {
			removeFirst();
			return;
		}
		
		if (tail.item == item) {
			removeLast();
			return;
		}

		Node prev = null, curr = head;
		while (curr != null && curr.item != item) {
			prev = curr;
			curr = curr.next;
		}

		if (curr == null) {
			System.out.println("Element " + item + " not found.");
			return;
		}

		prev.next = curr.next;
		length--;

	}

	public void removeAtPos(int pos) {
		if (pos < 0 || pos >= length) {
			System.out.println("Invalid position: " + pos + ". Valid range: 0 to " + (length - 1));
			return;
		}

		if (pos == 0) {
			removeFirst();
			return;
		}

		if (pos == length - 1) {
			removeLast();
			return;
		}


		Node prev = null, curr = head;

		for (int i = 0; i < pos; i++) {
			prev = curr;
			curr = curr.next;
		}
		if (curr.next != null){
		prev.next = curr.next;
		length--;}
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int getLength() {
		return length;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node curr = head;
		
		while (curr != null) {
			sb.append(curr.item);
			if (curr.next != null) sb.append(", ");
			curr = curr.next;
		}
		sb.append("]");
		return sb.toString();
	}

}