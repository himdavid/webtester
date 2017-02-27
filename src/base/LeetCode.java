package base;

import java.util.*;

/**
 * Created by Dave on 2/16/2017.
 */
public class LeetCode {

    public LeetCode() {

    }

        public String[] findWords(String[] words) {

            String tempString = "";
            for(int i=0; i<words.length; i++) {
                boolean compareKeyboard = words[i].replace("\"", "").toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*");
                if(compareKeyboard) {
                    tempString = tempString + words[i] + " ";
                }
            }
            return tempString.split("\\s");
        }

        public int[] nextGreaterElement(int[] findNums, int[] nums) {
            int[] list = new int[0];
            Stack<Integer> stack = new Stack<Integer>();
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            for(int num: nums) {
                while (!stack.isEmpty() && stack.peek() < num) {
                    map.put(stack.pop(), num);
                }
                stack.push(num);
            }

            for(int i=0; i<findNums.length; i++) {
                findNums[i] = map.getOrDefault(findNums[i], -1);
            }

            return findNums;
        }

    public List<String> fizzBuzz(int n) {

        List<String> numList = new ArrayList<String>();

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for(int i=1; i<=n; i++) {
            if(i%3 == 0 && i%5 == 0) {
                map.put(i, "FizzBuzz");
            }
            else if(i%3 == 0) {
                map.put(i, "Fizz");
            }
            else if(i%5 == 0) {
                map.put(i, "Buzz");
            } else {
                map.put(i, Integer.toString(i));
            }
        }

        for(int i=1; i<=n; i++) {
            String number = map.get(i);
            numList.add("\"" + number + "\"" );
        }

        return numList;
    }

    public static void main(String[] args) {
        //String[] input = {"Hello", "Alaska", "Dad", "Peace"};

        LeetCode leet = new LeetCode();

        List<String> stringList = leet.fizzBuzz(15);

        for(int i=0; i<stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

    }

}
