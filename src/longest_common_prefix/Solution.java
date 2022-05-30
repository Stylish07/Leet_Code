package longest_common_prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int length = 200;

        for (String str : strs) {
            if (str.length() < length) {
                length = str.length();
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    return prefix.toString();
                }
            }
            prefix.append(strs[0].charAt(i));
        }
        return prefix.toString();
    }
}