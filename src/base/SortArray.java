package base;

import java.util.Arrays;

/**
 * Created by david_him on 3/7/2017.
 */
public class SortArray {

    public SortArray() {

    }

    public char[] arraySort(char[] charArray){

        char temp;

        for(int i=0; i<charArray.length - 1; i++) {
            for(int j=0; j<charArray.length - 1; j++) {
                if(charArray[j] > charArray[j+1]) {
                    temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = temp;
                }
            }
        }

        return charArray;
    }

    public static void main(String[] args) {

        SortArray sort = new SortArray();

        String str = "hello this is david";

        System.out.println(Arrays.toString(sort.arraySort(str.toCharArray())));

    }
}
