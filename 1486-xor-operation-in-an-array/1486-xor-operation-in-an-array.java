class Solution {
    public int xorOperation(int n, int start) {
        int incr = start;
        while(n != 1){
            incr = incr + 2;
            start = start ^ incr;

            n--;
        }

        return start;
    }
}