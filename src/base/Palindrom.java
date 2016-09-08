package base;

public class Palindrom {
	
	public Palindrom(){
		
	}
	
	public boolean isPalindrom(String str){
		boolean pal = false;
		int first = 0;
		int last = str.length() - 1;
		char[] strArray = str.toCharArray();
		
		for(int i = 0; i < str.length(); i++){
			if(strArray[first] == strArray[last]){
				pal = true;
				first++;
				last--;
			} else{
				return false;
			}
		}
		return pal;
	}

	public static void main(String[] args) {
		Palindrom pal = new Palindrom();
		System.out.println(pal.isPalindrom("4444aaaa"));
	}

}
