class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            boolean isPresent = false;
            int j;
            for(j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j])
                    isPresent = true;
                
                if(isPresent){
                    if(nums2[j] > nums1[i]){
                        list.add(nums2[j]);
                        break;
                    }
                }
            }

            if(j == nums2.length){
                list.add(-1);
            }
        }

        int[] arr = new int[list.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}