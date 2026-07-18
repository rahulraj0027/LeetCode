class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1)
            return s;
        
        return (long) s + (long) m * (n / 2) - (n / 2 - 1);

        
    }
}