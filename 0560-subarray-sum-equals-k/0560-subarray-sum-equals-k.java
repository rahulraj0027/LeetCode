class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        freq.put(0, 1);

        int sum = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            int rem = sum - k;

            if(freq.containsKey(rem))
                count += freq.get(rem);
            
            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }


        return count;
    }
}