//        Given a string s, find the length of the longest
//        substring
//        without repeating characters.
//
//
//
//        Example 1:
//
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: s = "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//        Constraints:
//
//        0 <= s.length <= 5 * 10^4
//        s consists of English letters, digits, symbols and spaces.

import java.util.ArrayList;

public class _3_LongestSubstringWithoutCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    static int lengthOfLongestSubstring(String s) {
        ArrayList<Character> m = new ArrayList<>();
        int len = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (m.contains(s.charAt(i))) {
                len -= m.indexOf(s.charAt(i)) + 1;
                m.subList(0, m.indexOf(s.charAt(i)) + 1).clear();
            }
            m.add(s.charAt(i));
            len++;
            if (len > max) {
                max = len;
            }
        }
        return max;
    }
}
