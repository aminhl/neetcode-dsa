package org.nexthope.neetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EncodeAndDecodeStrings {

    public static String encodeBf(List<String> strs) {
        if (strs == null || strs.isEmpty())
            return "∅";
        return String.join("¶", strs);
    }

    public static List<String> decodeBf(String str) {
        if (str == null || "∅".equals(str))
            return new ArrayList<>();
        return Arrays.stream(str.split("¶", -1)).toList();
    }

    public static String encode(List<String> strs) {
      return strs.stream()
              .map(s -> s.length() + "#" + s)
              .collect(Collectors.joining());
    }

    public static List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;
            int length = Integer.parseInt(str.substring(i, j));
            j++;
            decoded.add(str.substring(j, j+length));
            i = j+length;
        }
        return decoded;
    }

}
