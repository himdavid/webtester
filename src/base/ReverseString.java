package base;

public class ReverseString {
	
	public ReverseString(){
		
	}
	
	public String reverseStr(String str){
		String reverse = null;
		for(int i = str.length() - 1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		return reverse;
	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseStr("etam olleh"));

	}

}
