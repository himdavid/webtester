package base;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

	public Main(){

	}

	public String[] missing(String s, String t) {

		String[] missingList = new String[7];

		String found = null;

		String[] mainString = s.split("\\s");
		String[] subString = t.split("\\s");

		int count = 0;

		for(int i=0; i<mainString.length; i++) {
			for(int j=0; j<subString.length; j++) {
				if(mainString[i].equals(subString[j])) {
					found = found+mainString[i];
				}
			}
		}

		System.out.print(found);

		return missingList;

	}


	public String[] missing2(String s, String t) {

		HashSet<String> set = new HashSet<String>();
		String missingString = "";

		int count = 0;

		String[] mainString = s.split("\\s");
		String[] subString = t.split("\\s");

		for(int i=0; i<subString.length; i++){
			set.add(subString[i]);
		}

		for(int j=0; j<mainString.length; j++){
			if(set.add(mainString[j])){
				missingString = missingString + mainString[j] + " ";
				count++;
			}
		}

		String[] missingList = missingString.split("\\s");

		return missingList;

	}

	public void customSort(int[] arr) {

		//Arrays.sort(arr, Collections.reverseOrder());

		for(int i=1; i<arr.length; i++) {
			if(!(arr[i] == arr[i-1])){

			}
		}


	}

	public void listTest(int numb) {
		List<String> listTest = null;
		
		listTest.add("\"");
	}

	public long productOfNumber(int number1, int number2) {
		return number1 % number2;
	}

	public static void main(String[] args) {
		Main main = new Main();

		System.out.println(main.productOfNumber(2, 3));

	}

}
