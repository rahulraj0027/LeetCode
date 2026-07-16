class Solution {
    public int gcd(int a, int b){
        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }

        return a;
    }

    public long gcdSum(int[] nums) {
        int[] prefixGCD = new int[nums.length];
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max)
                max = nums[i];
            prefixGCD[i] = gcd(max, nums[i]);
        }

        Arrays.sort(prefixGCD);
        long ans = 0;

        int low = 0;
        int high = prefixGCD.length-1;

        while(low < high){
            ans = ans + gcd(prefixGCD[low], prefixGCD[high]);

            low++;
            high--;
        }

        return ans;
    }
}