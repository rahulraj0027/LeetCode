class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int len = nums.length;

        if(len <= 2)
            return len;

        int num = (int)(Math.log(len) / Math.log(2));
        return (int)(Math.pow(2, num+1));
    }
}