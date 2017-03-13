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

	public boolean isPalindrom2(String str) {
		int stringLength = str.length() - 1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(stringLength) != str.charAt(i)) {
				return false;
			} else {
				stringLength--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Palindrom pal = new Palindrom();
		System.out.println(pal.isPalindrom("RotoR"));
		System.out.println(pal.isPalindrom2("RotoR"));
	}

}
