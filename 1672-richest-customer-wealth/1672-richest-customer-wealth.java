class Solution {
    public int maximumWealth(int[][] accounts) {
        int currMax = 0;
        int max = 0;

        for(int i=0; i<accounts.length; i++){
            currMax = 0;
            for(int j=0; j<accounts[i].length; j++){
                currMax += accounts[i][j];
            }

            if(currMax > max)
                max = currMax;
        }

        return max;
    }
}