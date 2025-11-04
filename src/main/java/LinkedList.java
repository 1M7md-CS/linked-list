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

	public void removeFirst() {
		if (checkEmpty()) return;
		head = head.next;
		
		if (head == null) tail = null;
		length--;
	}

	public void removeLast() {
		if (checkEmpty()) return;

		if (head == tail) {
			removeFirst();
			return;
		}

		Node curr = head;
		while (curr.next != tail){
			curr = curr.next;
		}
		tail = curr;
		tail.next = null;
		length--;
	}
	
	public void deleteElement(int item) {
		if (checkEmpty()) return;
		
		if (head.item == item) {
			removeFirst();
			return;
		}
		
		if (tail.item == item) {
			removeLast();
			return;
		}
		
		Node prev = null, curr = head;
		
		while (curr != null && curr.item != item){
			prev = curr;
			curr = curr.next;
		}

		if (curr == null) {
			System.out.println("Element not found.");
			return;
		}
		
		prev.next = curr.next;
		length--;
		
	}

	public boolean isEmpty() {
		return head == null;
	}

	private boolean checkEmpty() {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return true;
		}
		return false;
	}
	
	public int getLength(){
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