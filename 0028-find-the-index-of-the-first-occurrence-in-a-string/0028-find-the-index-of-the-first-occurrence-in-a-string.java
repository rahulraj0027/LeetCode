class Solution {
    public int strStr(String haystack, String needle) {
        int lengthOfHaystack = haystack.length();
        int lengthOfNeedle = needle.length();

        if (lengthOfNeedle > lengthOfHaystack)
            return -1;

        if (lengthOfNeedle == 0)
            return 0;

        int i = 0;
        int j = 0;
        int ans = -1;

        while (i < lengthOfHaystack) {

            if (haystack.charAt(i) == needle.charAt(j)) {

                if (ans == -1)
                    ans = i;

                i++;
                j++;

                if (j == lengthOfNeedle)
                    return ans;
            }
            else {

                if (ans != -1) {
                    i = ans + 1;   // restart from next index
                } else {
                    i++;
                }

                j = 0;
                ans = -1;
            }
        }

        return -1;
    }
}