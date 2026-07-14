class Solution {
    public boolean fun(HashSet<Character> set, String str){
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(!set.contains(ch))
                return false;
        }

        return true;
    }

    public String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();

        String topRow = "qwertyuiop";
        String middleRow = "asdfghjkl";
        String bottomRow = "zxcvbnm";

        HashSet<Character> topRows = new HashSet<>();
        HashSet<Character> middleRows = new HashSet<>();
        HashSet<Character> bottomRows = new HashSet<>();

        for(int i=0; i<topRow.length(); i++){
            char ch = topRow.charAt(i);
            topRows.add(ch);
            topRows.add(Character.toUpperCase(ch));
        }

        for(int i=0; i<middleRow.length(); i++){
            char ch = middleRow.charAt(i);
            middleRows.add(ch);
            middleRows.add(Character.toUpperCase(ch));
        }

        for(int i=0; i<bottomRow.length(); i++){
            char ch = bottomRow.charAt(i);
            bottomRows.add(ch);
            bottomRows.add(Character.toUpperCase(ch));
        }

        for(int i=0; i<words.length; i++){
            String str = words[i];

            char ch = str.charAt(0);
            if(topRows.contains(ch)){
                if(fun(topRows, str))
                    ans.add(str);
            }
            else if(middleRows.contains(ch)){
                if(fun(middleRows, str))
                    ans.add(str);
            }
            else{
                if(fun(bottomRows, str))
                    ans.add(str);
            }
        }

        return ans.toArray(new String[0]);
    }
}