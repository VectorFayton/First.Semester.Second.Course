package First_Letter_To_Appear_Twice;
// https://leetcode.com/problems/first-letter-to-appear-twice/solutions/4076705/220103036/
// https://leetcode.com/problems/first-letter-to-appear-twice/solutions/4076985/220103036-hash-map/

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Integer, String> hash_map_string = new HashMap<>();
        char[] string_by_character = s.toCharArray();
        char answer = s.charAt(0);
        for (int i = 0; i < string_by_character.length; i++) {
            String character = String.valueOf(string_by_character[i]);
            if (!hash_map_string.containsValue(character)){
                hash_map_string.put(i, character);
            } else {
                hash_map_string.put(i, character);
                answer = character.charAt(0);
                break;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().repeatedCharacter("abcdd"));
    }
}

