package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareObject implements Comparator<Balls> {

	@Override
	public int compare(Balls b1, Balls b2) {
		return b1.getColor().compareTo(b2.getColor());
	}
	
	public static void main(String[] args) {
		List<Balls> list = new ArrayList<Balls>();
		
		list.add(new Balls("red"));
		list.add(new Balls("red"));
		list.add(new Balls("blue"));
		list.add(new Balls("red"));
		list.add(new Balls("red"));
		list.add(new Balls("blue"));
		list.add(new Balls("Orange"));
		list.add(new Balls("Red"));
		
		Collections.sort(list, new CompareObject());
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getColor());
		}

	}
	
}
