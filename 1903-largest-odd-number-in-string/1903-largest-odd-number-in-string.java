class Solution {
    public String largestOddNumber(String num) {
        int idx = -1;
        for(int i=num.length()-1; i>=0; i--){
            char ch = num.charAt(i);

            int n = ch + 0;

            if(n%2 != 0){
                idx = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=idx; i++){
            sb.append(num.charAt(i));
        }

        return sb.toString();
    }
}