class Solution {
    public String reverseWords(String s) {
        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                temp.append(s.charAt(i));
            }
            else{
                ans.append(temp.reverse());
                ans.append(' ');
                temp.delete(0, temp.length());
            }
        }

        ans.append(temp.reverse());

        return ans.toString();
    }
}