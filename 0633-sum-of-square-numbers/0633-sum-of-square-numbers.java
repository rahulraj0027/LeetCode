class Solution {
    public boolean judgeSquareSum(int c) {
        long low = 0;
        long high = (long)Math.sqrt(c);

        while(low <= high){
            long temp = low*low + high*high;

            if(temp == c)
                return true;
            else if(temp > c)
                high--;
            else
                low++;
        }

        return false;
    }
}