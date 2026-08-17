class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 1;

        for(int i=0; i<sentences.length; i++){
            int currentWords = 1;
            for(int j=0; j<sentences[i].length(); j++){
                char ch = sentences[i].charAt(j);
                if(ch == ' ')
                    currentWords++;
            }

            if(currentWords > maxWords)
                maxWords = currentWords;
        }

        return maxWords;
    }
}