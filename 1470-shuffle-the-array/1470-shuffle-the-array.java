class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];

        int first = 0;
        int second = n;

        int i=0;
        while(i < ans.length){
            ans[i] = nums[first];
            ans[i+1] = nums[second];

            first++;
            second++;
            i = i+2;
        }

        return ans;
    }
}