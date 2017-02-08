package base;

import java.util.Arrays;

/**
 * Created by Dave on 2/7/2017.
 */
public class Anagrams {

    public Anagrams() {

    }

    public boolean isAnagram(String str1, String str2) {
        boolean anagram = false;

        str1 = str1.toLowerCase().replace("\\s", "");
        str2 = str2.toLowerCase().replace("\\s", "");

        char[] str1List = str1.toCharArray();
        char[] str2List = str2.toCharArray();

        Arrays.sort(str1List);
        Arrays.sort(str2List);

        if(Arrays.equals(str1List, str2List)) {
            anagram = true;
        } else {
            return false;
        }

        return anagram;

    }

    public static void main(String[] args) {

        Anagrams ana = new Anagrams();
        boolean anagram = ana.isAnagram("your", "rouY");

        System.out.println(anagram);



    }


}
