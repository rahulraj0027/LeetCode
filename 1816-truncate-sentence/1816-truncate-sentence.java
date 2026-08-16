class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();

        int spaceCount = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == ' ')
                spaceCount++;

            if(spaceCount == k)
                break;
            else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}