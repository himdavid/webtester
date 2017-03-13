package base;

import java.util.Arrays;
import java.util.HashMap;

public class Permutation {
	
	public Permutation(){
		
	}
	
	public boolean isPermutaton(String a, String b){
		boolean permutation = false;
		
		char[] c1 = a.toUpperCase().toCharArray();
		char[] c2 = b.toUpperCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);

		String newC1 = c1.toString();
		String newC2 = c1.toString();
		
		if(newC1.equals(newC2)){
			return true;
		}

		return permutation;
	}

	public boolean isPermutation2(String a, String b) {

		if(a.length() != b.length()) {
			return false;
		}

		int[] listA = new int[256];
		int[] listB = new int[256];

		for(char c: a.toCharArray()) {
			listA[c]++;
		}

		for(char c: b.toCharArray()) {
			listB[c]++;
		}

//		if(Arrays.equals(listA, listB)) {
//			return true;
//		} else {
//			return false;
//		}

		return isEqual(listA, listB);

	}

	public boolean isEqual(int[] a, int[] b) {

		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	
	public static void main(String[] args) {
		Permutation perm = new Permutation();
		System.out.println(perm.isPermutaton("dog is a book","ogd ai s koob"));
		System.out.println(perm.isPermutation2("dog is a book","ogd ai s koob"));
	}

}
