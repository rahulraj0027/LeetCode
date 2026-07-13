class Solution {
    public boolean isVowel(char ch){
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;

        return false;
    }
    public String reverseVowels(String s) {
        char[] ca = s.toCharArray();

        int low = 0;
        int high = ca.length-1;

        while(low < high){
            if(isVowel(ca[low]) && isVowel(ca[high])){
                char temp = ca[low];
                ca[low] = ca[high];
                ca[high] = temp;

                low++;
                high--;
            }
            else if(isVowel(ca[low]))
                high--;
            else
                low++;
        }

        return new String(ca);
    }
}