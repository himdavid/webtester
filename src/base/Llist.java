package base;

import java.util.Collections;
import java.util.LinkedList;

public class Llist {
	
	public Llist(){
		
		
	}
	
	public LinkedList<Integer> addIntToList(LinkedList<Integer> list, int number) {
		
		if(!list.isEmpty()) {
			Collections.sort(list);
		}
		
		list.add(number);
		return list;
	}
	
	public void printList(LinkedList<Integer> list){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
