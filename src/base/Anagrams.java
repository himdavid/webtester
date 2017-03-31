package base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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

    public boolean isAnagram2(String str1, String str2) {
        //boolean anagram = false;

        if(str1.length() != str2.length()) {
            return false;
        } else {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            int[] letters = new int[256];

            for(char c: str1.toCharArray()) {
                letters[c] = letters[c] + 1;
            }
            for(char c: str2.toCharArray()) {
                letters[c] = letters[c] - 1;
            }
            for(int i : letters){
                if(i != 0) {
                    return false;
                }
            }
        }

        return true;
    }


    public void anagramList(String[] words) {

        for(int i=0; i<words.length - 1; i++) {
            String word1 = words[i].toLowerCase();
            String anagramList = "";

            for(int j=i+1; j<words.length; j++){
                String word2 = words[j].toLowerCase();
                if(isAnagram2(word1, word2) == true && !anagramList.equals("") && !word1.equals(word2)) {
                    anagramList = anagramList + "," + word2;
                } else if(isAnagram2(word1, word2) == true && !word1.equals(word2)) {
                    anagramList = word1 + "," + word2;
                }
            }
            System.out.println(anagramList);
        }
    }

    public static void main(String[] args) {

        Anagrams ana = new Anagrams();
        System.out.println(ana.isAnagram2("1354", "1435"));
        String[] stringList = {"geeksquiz", "geeksforgeeks", "abcd",
                "forgeeksgeeks", "zuiqkeegs"};
        ana.anagramList(stringList);

    }


}
