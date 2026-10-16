class Solution {    
    public String longestCommonPrefix(String[] str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str[0]);

        for(int i=1; i<str.length; i++){
            String s = str[i];
        
            int j=0;
            while(j < Math.min(sb.length(), s.length())){
                if(s.charAt(j) != sb.charAt(j))
                    break;
                j++;
            }

            sb.delete(j, sb.length());
        }

        return sb.toString();
    }
}