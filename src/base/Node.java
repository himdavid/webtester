package base;

public class Node {
	
	private String data;
	private Node next;

	public Node(String str){
		this.data = str;
		next = null;
	}
	
	public Node getNext(){
		return next;
	}
	
	public Node setNext(Node nextValue){
		return next = nextValue;
	}
	
	public String getData(){
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
