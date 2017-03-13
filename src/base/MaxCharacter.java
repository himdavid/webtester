package base;

public class MaxCharacter {
	
	public MaxCharacter(){
		
	}
	
	public void getMaxRepeatingCharacter(String str){
		char[] list = str.toCharArray();
		
		int count = 1;
		int maxCount = 0;
		char maxChar = 0;
		
		for(int i=1; i<list.length; i++){
			if(list[i] == list[i-1]){
				count++;
			} else{
				if(count > maxCount) {
			
				maxCount = count;
				maxChar = list[i-1];
				}
				count = 1;
			}
		}
		System.out.println(maxCount + " " + maxChar);
	}

	public static void main(String[] args) {
		MaxCharacter m = new MaxCharacter();
		m.getMaxRepeatingCharacter("aabbbbbbcbbdddddddbbbeeee");

	}

}
