class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<allowed.length(); i++){
            char ch = allowed.charAt(i);
            set.add(ch);
        }

        int count = 0;
        for(int i=0; i<words.length; i++){
            String str = words[i];

            boolean isPresent = true;
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                
                if(!set.contains(ch)){
                    isPresent = false;
                    break;
                }
            }

            if(isPresent)
                count++;
        }

        return count;
    }
}