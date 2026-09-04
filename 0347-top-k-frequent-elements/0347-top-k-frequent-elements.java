class Solution {
    public class Pair{
        int element;
        int count;

        Pair(int element, int count){
            this.element = element;
            this.count = count;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.count - b.count);
        int[] ans = new int[k];

        for(int i=0; i<nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        
        for(int key : map.keySet()){
            int count = map.get(key);

            pq.add(new Pair(key, count));
            if(pq.size() > k){
                pq.poll();
            }
        }

        while(!pq.isEmpty()){
            ans[--k] = pq.poll().element;
        }
        
        return ans;
    }
}