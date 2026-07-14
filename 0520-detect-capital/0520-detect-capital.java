class Solution {
    public boolean detectCapitalUse(String word) {
        int countUpper = 0;
        int countLower = 0;

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
                countUpper++;
            else
                countLower++;
        }

        if(countUpper == word.length() || countLower == word.length())
            return true;
        
        if(Character.isUpperCase(word.charAt(0)) && countUpper == 1)
            return true;
        
        return false;
    }
}