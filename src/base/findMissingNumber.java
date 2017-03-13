package base;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dave on 2/9/2017.
 */
public class findMissingNumber {

    public findMissingNumber() {

    }

    public void printMissingNumbers(int[] list, int maxLength) {
        for(int i=0; i<list.length; i++) {
            if(list[i] == i+1) {

            } else {
                if(!(list[i] + list[i+1] == list[i] + 2)) {
                    
                }
                int missingNumber = i+1;
                System.out.print("Missing: " + missingNumber);
            }
        }
    }

    public void printMissingNumbers2(int[] list, int maxLength) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=1; i<=maxLength; i++) {
            map.put(i, 0);
        }

        for(int i=0; i<list.length; i++) {
            map.put(list[i], 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() !=1){
                System.out.println(entry.getKey().toString());
            }
        }

    }


    public static void main(String[] args) {

        findMissingNumber missingNumber = new findMissingNumber();
        int[] list = {1, 2, 3, 5, 6, 7, 8};

        //missingNumber.printMissingNumbers(list, 10);
        missingNumber.printMissingNumbers2(list, 10);


    }

}

