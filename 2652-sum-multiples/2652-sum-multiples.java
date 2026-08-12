class Solution {
    public int sum(int n, int factor){
        int terms = n/factor;
        int sum = terms * (terms + 1) / 2;
        return factor * sum;
    }

    public int sumOfMultiples(int n) {
        int num3 = sum(n, 3);
        int num5 = sum(n, 5);
        int num7 = sum(n, 7);
        int num35 = sum(n, 15);
        int num57 = sum(n, 35);
        int num37 = sum(n, 21);
        int num357 = sum(n, 105);

        return (num3 + num5 + num7) - (num35 + num57 + num37) + (num357);

        
    }
}