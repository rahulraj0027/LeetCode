class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ca = s.toCharArray();

        int low = 0;
        int high = ca.length-1;

        while(low < high){
            if(ca[low] < 'A' || (ca[low] > 'Z' && ca[low] < 'a') || ca[low] > 'z')
                low++;
            else if(ca[high] < 'A' || (ca[high] > 'Z' && ca[high] < 'a') || ca[high] > 'z')
                high--;
            else{
                char temp = ca[low];
                ca[low] = ca[high];
                ca[high] = temp;

                low++;
                high--;
            }
        }

        return new String(ca);
    }
}