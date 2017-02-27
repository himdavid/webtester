package base;

public class ReverseString {


	
	public ReverseString(){
		
	}
	
	public String reverseStr(String str){
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		String reverse = "";
		for(int i = str.length() - 1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println("1: Took "+(endTime - startTime) + " ns");
		return reverse;
	}

	public String reverseStringV2(String s) {
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println("2: Took "+(endTime - startTime) + " ns");

		return sb.toString();

	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseStr("easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh"));

		System.out.println(rs.reverseStringV2("easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh" +
				"easdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeheasdfsadfdstam ollasdfdsafasdf " +
				"asdfsdafeheasdfsadfdstam ollasdfdsafasdf asdfsdafeh"));

	}

}
