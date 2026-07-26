class Solution {
    public int largestInteger(int n, int s) {
        if(9 * n < s)
            return -1;

        int ans = 0;
        while(n != 0){
            if(s < 9){
                ans = ans * 10 + s;
                s = 0;
            }
            else{
                ans = ans * 10 + 9;
                s = s - 9;
            }

            n--;
        }

        return ans;
    }
}