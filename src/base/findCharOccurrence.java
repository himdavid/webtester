package base;

import java.util.Arrays;

/**
 * Created by Dave on 2/7/2017.
 */
public class findCharOccurrence {

    public findCharOccurrence() {

    }

    public int occurance(String str, String character) {
        int count = 0;
        char[] list = str.toCharArray();
        Arrays.sort(list);

        for(int i=0; i < list.length; i++) {
            String currentValue = String.valueOf(list[i]);
            if(currentValue.equals(character)) {
                count++;
            }
        }

        return count;
    }

    public int occurance2(String str, String character) {
        int[] intList = new int[256];

        for(char c : str.toCharArray()) {
            intList[c] ++;
        }

        return intList[character.charAt(0)];
    }

    public static void main(String[] args) {
        findCharOccurrence find = new findCharOccurrence();

        System.out.println(find.occurance("abfde ffgh if f", "f"));
        System.out.println(find.occurance2("abfde ffgh if f", "f"));
    }
}
