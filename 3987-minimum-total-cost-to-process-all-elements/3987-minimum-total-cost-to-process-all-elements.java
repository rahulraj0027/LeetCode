class Solution {
    public int minimumCost(int[] nums, int k) {
        long avl = k;
        long cost = 0;
        long MOD = 1000000007;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] > avl){
                long unit = (long)(Math.ceil((nums[i] - avl)*1.0 / k));
                cost+=unit;
                avl = avl + unit*k;
            }

            avl = avl - nums[i];
        }

        cost = cost % MOD;
        if(cost%2 == 0){
            cost = (cost/2)*(cost+1);
        }
        else{
            cost = ((cost+1)/2)*(cost);
        }
        
        return (int)(cost%MOD);
    }
}