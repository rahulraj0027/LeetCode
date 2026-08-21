class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = 0;
        boolean flag = false;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int val : map.values()){
            if(val%2 != 0){
                flag = true;
                len = len + (val - 1);
            }
            else{
                len = len + val;
            }
        }

        if(flag)
            return len+1;
        
        return len;
    }
}