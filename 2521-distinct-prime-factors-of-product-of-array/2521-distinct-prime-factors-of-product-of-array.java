class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 2 || nums[i] == 3)
                ans.add(nums[i]);
            else{
                int j = 2;
                while(j <= nums[i]){
                    if(nums[i] % j == 0){
                        ans.add(j);
                        nums[i] /= j;
                    }
                    else
                        j++;
                }
            }
        }

        return ans.size();
    }
}