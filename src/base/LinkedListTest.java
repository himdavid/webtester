package base;

public class LinkedListTest {
	
	private Node head;
	
	public LinkedListTest(){
		head = new Node();
	}
	
	public void add(Node n){
		
		Node newNode = head;
		
		while(newNode.getNext() != null) {
			newNode = newNode.next;
		}
		newNode = newNode.setNext(n);
	}
	
	public Node reverseList(){
		Node reversedPart = null;
		Node current = head;
		Node next = null;
		while (current != null) {
		    next = current.next;
		    current.next = reversedPart;
		    reversedPart = current;
		    current = next;
		}
		head = reversedPart;
		return reversedPart;
	}
	
	public void printLinkedList(){
		while(head.getNext()!= null){
			System.out.println("Head: "+head.getData());
			System.out.println("next: "+head.getNext().getData());
			
			head = head.next;
		
		}
	}

	public static void main(String[] args) {
		LinkedListTest list = new LinkedListTest();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		
		list.add(n1);
		list.add(n2);
		list.add(n3);

		//list.reverseList();
		list.printLinkedList();
		
	}
}
