package base;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

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


    public static void main(String[] args) {

        findMissingNumber missingNumber = new findMissingNumber();


        int[] list = {1, 2, 3, 5, 6, 7, 8};


    }

}

