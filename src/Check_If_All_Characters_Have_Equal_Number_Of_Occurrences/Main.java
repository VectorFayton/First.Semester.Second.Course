package Check_If_All_Characters_Have_Equal_Number_Of_Occurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().areOccurrencesEqual("havkaoxlnwuupdwkzeuwshymficktljworbqgdunhwxmkveakywgohayjjrhqtvt"));
    }
}

class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashSet<String> hash_string = new HashSet<>();
        HashMap<Integer, String> hash_map_string = new HashMap<>();
        boolean are_occurrence = false;
        int counter = 0;
        char[] string_by_character = s.toCharArray();
        for (int i = 0; i < string_by_character.length; i++) {
            String character = String.valueOf(string_by_character[i]);
            hash_string.add(String.valueOf(string_by_character[i]));
            if (!hash_map_string.containsValue(character)){
                hash_map_string.put(1, character);
            } else {
//                hash_map_string();
            }
        }
        System.out.println(s.length());
        System.out.println(counter);
        System.out.println(hash_string.size());
        return false;
    }
}