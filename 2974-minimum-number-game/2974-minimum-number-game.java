class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }

        int[] arr = new int[nums.length];

        int i = 0;
        while(i < arr.length){
            int temp = pq.poll();
            arr[i] = pq.poll();
            i++;
            arr[i] = temp;
            i++;
        }

        return arr;
    }
}