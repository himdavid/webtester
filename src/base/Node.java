package base;

public class Node {
	
	private int number;
	Node next;
	
	public Node(){
		
	}

	public Node(int number){
		this.number = number;
		next = null;
	}
	
	public Node getNext(){
		return next;
	}
	
	public Node setNext(Node nextValue){
		return next = nextValue;
	}
	
	public int getData(){
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
