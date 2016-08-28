package base;

public class LinkedListTest {
	
	private Node head;
	
	public LinkedListTest(){
		head = new Node(null);
	}
	
	public void add(Node n){
		
		Node newNode = head;
		
		while(newNode.getNext() != null) {
			newNode = newNode.getNext();
		}
		newNode = newNode.setNext(n);
	}
	
	public void printLinkedList(){
		while(head.getNext()!= null){
			System.out.println("Head: "+head.getData());
			System.out.println("next: "+head.getNext().getData());
			
			head = head.getNext();
		
		}
	}

	public static void main(String[] args) {
		LinkedListTest list = new LinkedListTest();
		Node n1 = new Node("The Jungle Book");
		Node n2 = new Node("The Lion King");
		Node n3 = new Node("Aladin");
		
		list.add(n1);
		list.add(n2);
		list.add(n3);
		
		list.printLinkedList();

	}
}
