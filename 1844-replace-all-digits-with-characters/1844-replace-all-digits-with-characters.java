class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i+=2){
            char ch = s.charAt(i);
            sb.append(ch);

            if(i != s.length()-1){
                char chNext = s.charAt(i+1);
                int next = chNext - '0';
                sb.append((char)(ch + next));
            }
        }

        return sb.toString();
    }
}