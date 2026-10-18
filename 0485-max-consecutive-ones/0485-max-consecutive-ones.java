class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1 = 0;
        int count1Max = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
                count1 = 0;
            else if(nums[i] == 1)
                count1++;

            count1Max = Math.max(count1, count1Max);
        }

        return count1Max;
    }
}