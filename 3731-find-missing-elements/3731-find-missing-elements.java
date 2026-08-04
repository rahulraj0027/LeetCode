class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length-1];

        int i = min;
        int ptr = 0;
        while(i <= max){
            if(nums[ptr] != i)
                list.add(i);
            else
                ptr++;

            i++;
        }

        return list;
    }
}