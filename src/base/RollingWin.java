package base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

/**
 * This class contains a main function to process an integer stream through
 * a sliding window. It calls two additional functions, getMax and getAvg
 * @author David Him
 *
 */
public class RollingWin {
	
	public RollingWin() {
		
	}
	
	/**
	 * Process an integer steam and provide the avg and max based on the sliding window size specified
	 * @param stream, the integer array to process
	 * @param windowSize the window size to process
	 */
	
	public void rollingWindowMaxAvg(int[] stream, int windowSize) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int a=0; a<stream.length; a++) {
			for(int i=0; i<windowSize; i++){
				if(a+i>=stream.length){
					//don't add to list
				} else{
				list.add(stream[a+i]);
				}
			}
			System.out.println("Max is " + getMax(list));
			System.out.println("Average is: " + getAvg(list));
			
			list.clear();
		}
	}
	
	/**
	 * Get the maximum value in an ArrayList
	 * @param list, the ArrayList of integer
	 * @return the max value in the list
	 */
	public int getMax(ArrayList<Integer> list){
		return Collections.max(list);
	}
	
	/**
	 * Get the avg value in an ArrayList
	 * @param list
	 * @return
	 */
	public double getAvg(ArrayList<Integer> list) {
		double sum = 0;
		for (int i: list) {
			sum+= i;
		}
		return sum / list.size();
	}
	

	public static void main(String[] args) throws IOException, NoSuchElementException {
		RollingWin roll = new RollingWin();
		
		// Happy path
		System.out.println("************** Happy Path **************");
		int[] stream1 = {1,6,8,11,14};
		roll.rollingWindowMaxAvg(stream1, 3);
		
		// Happy path
		System.out.println("************** Happy Path **************");
		int[] stream2 = {1,6,8,11,14,15,20,30,40,50,60,70,80,90,100,1,2,3,4,5,6,7,8,9,1,2,3,4,5};
		roll.rollingWindowMaxAvg(stream2, 20);
		
		// Negative Path
		System.out.println("************** Negative Path **************");
		int[] stream3 = {1,-6,8,11, };
		roll.rollingWindowMaxAvg(stream3, -3);
		
		// Negative Path
		System.out.println("************** Negative Path **************");
		int[] stream4 = {1,6};
		roll.rollingWindowMaxAvg(stream4, 3);
		
	}

}
