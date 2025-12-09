package org.nexthope.arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (Character c : s.toCharArray())
            sMap.put(c, sMap.getOrDefault(c,0)+1);
        for (Character c : t.toCharArray())
            tMap.put(c, tMap.getOrDefault(c,0)+1);
        return sMap.equals(tMap);
    }

}
