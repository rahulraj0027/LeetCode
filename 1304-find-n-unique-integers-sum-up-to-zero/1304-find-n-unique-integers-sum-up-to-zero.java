class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        boolean isOdd = false;
        if(n%2 != 0)
            isOdd = true;

        int low = 0; 
        int high = n-1;

        while(low < high){
            ans[low] = n;
            ans[high] = -n;

            n--;
            low++;
            high--;
        }

        if(isOdd)
            ans[low] = 0;
        
        return ans;


    }
}