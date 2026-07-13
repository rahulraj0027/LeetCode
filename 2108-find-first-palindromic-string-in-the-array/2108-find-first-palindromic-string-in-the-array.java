class Solution {
    public boolean isPalindrome(String s){
        int low = 0;
        int high = s.length()-1;
        
        while(low < high){
            if(s.charAt(low) != s.charAt(high))
                return false;
            
            low++;
            high--;
        }

        return true;
    }

    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            if(isPalindrome(words[i]) == true)
                return words[i];
        }

        return "";
    }
}