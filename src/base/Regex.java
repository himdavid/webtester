package base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dave on 2/22/2017.
 */
public class Regex {

    public Regex(){

    }

    public void findPhoneNumber(String str) {
        String regexMatchPattern = "\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})";
        Pattern pattern = Pattern.compile(regexMatchPattern);

        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group(0));
        }

    }

    public static void main(String[] args) {
        Regex regex = new Regex();
        regex.findPhoneNumber("Here is a list of phone numbers that you might like 2061231456. if that one doesn't work how about 2061231456");
    }
}
