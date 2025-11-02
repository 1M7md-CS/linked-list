public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.addFirst(5);
		linkedList.addLast(10);
		linkedList.addFirst(12);
		linkedList.addFirst(9);
		linkedList.addLast(4);

		System.out.println(linkedList.printList());

	}
}
