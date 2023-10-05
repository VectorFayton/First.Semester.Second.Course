package Check_If_All_Characters_Have_Equal_Number_Of_Occurrences;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().areOccurrencesEqual("havkaoxlnwuupdwkzeuwshymficktljworbqgdunhwxmkveakywgohayjjrhqtvt"));
    }
}

class Solution {
    public boolean areOccurrencesEqual(String s) {
//        HashSet<String> hash_string = new HashSet<>();
//        TreeMap<String, Integer, String> hash_map_string = new HashMap<>();
//        boolean are_occurrence = false;
//        int counter = 0;
//        char[] string_by_character = s.toCharArray();
//        for (int i = 0; i < string_by_character.length; i++) {
//            String character = String.valueOf(string_by_character[i]);
//            hash_string.add(String.valueOf(string_by_character[i]));
//            hash_string.add(character);
//            if (!hash_map_string.containsValue(character)){
//                hash_map_string.put(character, i);
//            } else if(hash_map_string.containsValue(character)) {
//                hash_map_string.put(character, 0);
//            }
//        }
//        Set<String> keys = hash_map_string.keySet();
//        List<Integer> values = new ArrayList<>(hash_map_string.values());
//        System.out.println(hash_string);
//        System.out.println(keys);
//        System.out.println(values);
//        System.out.println(hash_map_string);
//        System.out.println(s.length());
//        System.out.println(counter);
//        System.out.println(hash_string.size());
//        return false;
        char[] string_by_character = s.toCharArray();
        Map<String, Integer> string_map = new HashMap<>();


        for (int i = 0; i < string_by_character.length; i++) {
            String character = String.valueOf(string_by_character[i]);
            string_map.put(character, string_map.getOrDefault(character, 0) + 1);
        }
        System.out.println(string_map);
        Set<Integer> unique_frequency = new HashSet<>(string_map.values());
        System.out.println(unique_frequency);
        System.out.println(string_map.getOrDefault("y", 0));

        return unique_frequency.size() == 1;
    }
}