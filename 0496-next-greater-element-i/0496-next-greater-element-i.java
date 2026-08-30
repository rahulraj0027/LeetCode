class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums2.length];

        for(int i=nums2.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            
            if(st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = st.peek();

            map.put(nums2[i], ans[i]);
            st.push(nums2[i]);
        }

        int[] finalAns = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            finalAns[i] = map.get(nums1[i]);
        }

        return finalAns;
    }
}