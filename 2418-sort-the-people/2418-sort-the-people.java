class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] ans = new String[names.length];

        for(int i=0; i<heights.length; i++){
            map.put(heights[i], i);
        }

        Arrays.sort(heights);

        int i = 0;
        int j = heights.length-1;

        while(i < j){
            int temp = heights[i];
            heights[i] = heights[j];
            heights[j] = temp;

            i++;
            j--;
        }

        for(i=0; i<heights.length; i++){
            int idx = map.get(heights[i]);
            ans[i] = names[idx];
        }

        return ans;
    }
}