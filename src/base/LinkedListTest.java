package base;

public class LinkedListTest {
	
	private Node head;
	
	public LinkedListTest(){
		head = new Node();
	}
	
	public void add(Node n){
		
		Node newNode = head;
		
		while(newNode.next != null) {
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
		while(head.next != null){
			System.out.println("Head: "+head.getData());
			//System.out.println("next: "+head.getNext().getData());
			
			head = head.next;
		}
		System.out.println("Head: "+head.getData());
	}
	
	public void addSortedList(Node n){

		Node current = head;
		while(current.next != null){
			if(current.getData() < n.getData() && current.next.getData() > n.getData()
					|| current.getData() == n.getData()) {
				Node next = current.next;
				current.setNext(n);
				current.next.setNext(next);
				break;
			}
			else {
				current = current.next;
			}
		}
	current.next = current.setNext(n);
	}

	public static void main(String[] args) throws InterruptedException {
		LinkedListTest list = new LinkedListTest();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(8);
		Node n5 = new Node(4);
		Node n6 = new Node(7);
		Node n7 = new Node(6);
		Node n8 = new Node(10);
		Node n9 = new Node(11);
		Node n10 = new Node(4);
		Node n11 = new Node(1);
		
		list.addSortedList(n1);
		list.addSortedList(n2);
		list.addSortedList(n3);
		list.addSortedList(n4);
		list.addSortedList(n5);
		list.addSortedList(n6);
		list.addSortedList(n7);
		list.addSortedList(n8);
		list.addSortedList(n9);
		list.addSortedList(n10);
		list.addSortedList(n11);
		
		//list.reverseList();
		list.printLinkedList();
		
	}
}
