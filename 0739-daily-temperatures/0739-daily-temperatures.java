class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        Stack<Integer> st = new Stack<>();

        int j = len-1;
        for(int i=len-1; i>=0; i--){
            while(!st.isEmpty() && temperatures[st.peek()]<= temperatures[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[j] = 0;
            }
            else{
                ans[j] = st.peek() - i;
            }

            st.push(i);
            j--;
        }

        return ans;
    }
}