class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = n * (n+1) / 2;
        int divisibleCount = n / m;
        int divisibleSum = m * divisibleCount * (divisibleCount + 1) / 2;
        
        return sum - 2 * divisibleSum;
    }
}