package base;

public class Test {

	public int[] testFunction(String str) {

		int[] intList = new int[99];

		intList['b'] ++;
		intList['b'] ++;

		return intList;

	}

	public static void main(String[] args) {

		Test test = new Test();
		test.testFunction("abcd");

	}

}
