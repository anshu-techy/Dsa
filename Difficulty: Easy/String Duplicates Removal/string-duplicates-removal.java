
class Solution {
    String removeDuplicates(String s) {
        // boolean array to mark visited characters (52 possible if case-sensitive)
        boolean[] seen = new boolean[256]; // covers ASCII characters
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;    // mark as seen
                result.append(ch);  // keep first occurrence
            }
        }

        return result.toString();
    }
}
