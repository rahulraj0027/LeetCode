class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = 1;
        if(nums.length <= 2)
            return nums.length;

        while(n <= nums.length){
            n = n*2;
        }

        return n;
    }
}