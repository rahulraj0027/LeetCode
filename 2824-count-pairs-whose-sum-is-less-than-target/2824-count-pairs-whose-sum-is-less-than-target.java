class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        int low = 0;
        int high = nums.size()-1;

        while(low < high){
            if(nums.get(low) + nums.get(high) >= target){
                high--;
            }
            else{
                count += (high - low);
                low++;
            }
        }


        return count;
        
    }
}