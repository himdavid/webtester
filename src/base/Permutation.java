package base;

import java.util.Arrays;

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
	
	public static void main(String[] args) {
		Permutation perm = new Permutation();
		System.out.println(perm.isPermutaton("dog","OGD "));
	}

}
