class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = n * (n+1) / 2;
        
        return (sum) - (m*(n/m)*(n/m+1));
    }
}