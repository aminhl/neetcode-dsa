package org.nexthope.arrays;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            result.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return result.values().stream().toList();
    }

}
