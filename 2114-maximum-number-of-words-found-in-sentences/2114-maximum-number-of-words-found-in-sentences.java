class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 1;

        for(int i=0; i<sentences.length; i++){

            String currSent = sentences[i];
            int currentWords = currSent.split(" ").length;    

            if(currentWords > maxWords)
                maxWords = currentWords;
        }

        return maxWords;
    }
}