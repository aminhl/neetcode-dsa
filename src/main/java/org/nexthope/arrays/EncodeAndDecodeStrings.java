package org.nexthope.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

}
