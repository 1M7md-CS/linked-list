import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.sql.SQLOutput;

public class LinkedList {

	private static class Node {
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

	public void removeFirst() {
		if (checkEmpty()) return;
		head = head.next;
		
		if (head == null) tail = null;
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

	public void printList() {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.item);
			curr = curr.next;
		}
	}
}