package base;

import java.util.HashSet;

public class UniqueChar {
	
	public UniqueChar(){
		
	}
	
	/**
	 * Problem 1.1 - Use HashSet when calling the .add function that will return a boolean.
	 * Will not add a duplicate value
	 * @param str
	 * @return
	 */
	public boolean isUnique(String str){
		
		HashSet<Character> charSet = new HashSet<Character>();
		boolean uniqueChar = false;
		for(char c: str.toCharArray()){
			if(charSet.add(c)){
				uniqueChar = true;
			} else {
				return uniqueChar = false;
			}
		}
		return uniqueChar;
	}
}