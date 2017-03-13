package base;

import java.util.Arrays;

/**
 * Created by david_him on 3/6/2017.
 */
public class SubStringSearch {

    public SubStringSearch(){

    }

    public int[] findSubString(String str1, String str2) {

        char[] str1List = str1.toCharArray();
        char[] str2List = str2.toCharArray();
        char firstLetter = str2List[0];
        int countMatch = 0;

        int[] index = new int[str2.length()];

        for(int i=0; i<str1.length(); i++){
            if(str1List[i] == firstLetter) {
                for(int j=0; j<str2.length(); j++) {
                    if(str1List[i+j] == str2List[j]) {
                        countMatch++;
                        index[j] = i+j;
                        if(countMatch == str2.length()){
                            return index;
                        }
                    } else{
                        countMatch = 0;
                        break;
                    }
                }
            }
        }
        return index;
    }

    public int[] findSubString2(String str1, String str2) {

        char[] str1List = str1.toCharArray();
        char[] str2List = str2.toCharArray();
        char firstLetter = str2List[0];
        int countMatch = 0;

        int[] index = new int[str2.length()];

        for(int i=0; i<str1.length(); i++){
            if(str1List[i] == firstLetter) {
                for(int j=0; j<str2.length(); j++) {
                    if(str1List[i+j] == str2List[j]) {
                        countMatch++;
                        index[j] = i+j;
                        if(countMatch == str2.length()){
                            return index;
                        }
                    } else{
                        countMatch = 0;
                        break;
                    }
                }
            }
        }
        return index;
    }

    public static void main(String[] arg) {

        String mainString = "Having a baby is fun until you have to go to sleep";
        String subString = "baby";

        SubStringSearch sss = new SubStringSearch();
        System.out.println(Arrays.toString(sss.findSubString(mainString, subString)));

    }
}