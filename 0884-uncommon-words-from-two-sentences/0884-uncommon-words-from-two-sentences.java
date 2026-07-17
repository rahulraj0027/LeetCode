class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        for(String str : str1)
            map.put(str, map.getOrDefault(str, 0)+1);
        for(String str : str2)
            map.put(str, map.getOrDefault(str, 0)+1);

        List<String> ans = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);




    }
}