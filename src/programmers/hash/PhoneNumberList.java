package programmers.hash;

import java.util.Arrays;
import java.util.HashSet;

public class PhoneNumberList {

}

class Solution {

    public boolean solution(String[] phoneBook) {

        HashSet<String> phoneSet = new HashSet<>(Arrays.asList(phoneBook));

        for (String s : phoneBook) {
            for (int i = 0; i < s.length(); i++) {
                if (phoneSet.contains((s.substring(0, i)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
