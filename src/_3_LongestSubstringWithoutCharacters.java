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
