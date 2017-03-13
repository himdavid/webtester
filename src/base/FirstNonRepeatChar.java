package base;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by david_him on 3/7/2017.
 */
public class FirstNonRepeatChar {

    public FirstNonRepeatChar() {

    }

    public String findFirstNonRepeatingChar(String str) {

        String firstNonRepeatChar = "";
        char[] str1List = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str1List.length; i++) {
            if(map.get(str1List[i]) != null) {
                map.put(str1List[i], -1);
            } else {
                map.put(str1List[i], i);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() != -1) {
                return entry.getKey().toString() + " index:" + entry.getValue();
            } else {
                firstNonRepeatChar = "Everything was a dupe";
            }
        }

        return firstNonRepeatChar;
    }

    public static void main(String[] args) {

        FirstNonRepeatChar fnrc = new FirstNonRepeatChar();

        System.out.println(fnrc.findFirstNonRepeatingChar("wwpppaca"));
    }
}
