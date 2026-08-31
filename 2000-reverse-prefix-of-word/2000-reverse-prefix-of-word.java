class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = -1;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                idx = i;
                break;
            }
        }

        if(idx == -1)
            return word;
        
        StringBuilder sb = new StringBuilder();
        int i = idx;
        while(i >= 0){
            sb.append(word.charAt(i));
            i--;
        }

        idx++;
        while(idx < word.length()){
            sb.append(word.charAt(idx));
            idx++;
        }

        return sb.toString();
    }
}