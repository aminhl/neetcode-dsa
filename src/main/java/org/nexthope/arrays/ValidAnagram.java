package org.nexthope.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean isAnagramBf(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }

    public static boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) return false;
       Map<Character, Integer> mapS = new HashMap<>();
       Map<Character, Integer> mapT = new HashMap<>();
        for (Character c : s.toCharArray())
            mapS.put(c, mapS.getOrDefault(c, 0)+1);
        for (Character c : t.toCharArray())
            mapT.put(c, mapT.getOrDefault(c, 0)+1);
        return mapS.equals(mapT);
    }

}
