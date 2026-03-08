package org.nexthope.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValidBf(String s) {
        if (s.length() == 1) return false;
        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }

    public static boolean isValid(String s) {
        if (s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closedToOpen = new HashMap<>();
        closedToOpen.put(')','(');
        closedToOpen.put(']','[');
        closedToOpen.put('}','{');
        for (char c : s.toCharArray()) {
            if (closedToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closedToOpen.get(c))
                    stack.pop();
                else return false;
            } else stack.push(c);
        }
        return stack.isEmpty();
    }

}
