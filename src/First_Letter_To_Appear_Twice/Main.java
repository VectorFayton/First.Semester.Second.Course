package First_Letter_To_Appear_Twice;
// https://leetcode.com/problems/first-letter-to-appear-twice/solutions/4076705/220103036/

import java.util.HashSet;

class Solution {
    public char repeatedCharacter(String s) {
        HashSet<String> hash_string = new HashSet<>();
        char[] string_by_alphabet = s.toCharArray();
        char charming = s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            hash_string.add(String.valueOf(string_by_alphabet[i]));
//            System.out.printf("HashSize: %s, Index: %s\n", hash_string.size(), (i + 1));
            if(hash_string.size() != (i + 1)){
                charming = String.valueOf(string_by_alphabet[i]).charAt(0);
                break;
            }
        }
        return charming;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().repeatedCharacter("abcdd"));
    }
}

