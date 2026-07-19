class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;

        int carry = 0;
        int first = 0;
        int second = 0;
        
        while(i >= 0 || j >= 0){
            first = (i >= 0) ? a.charAt(i) - '0' : 0;
            second = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = first + second + carry;
            sb.append(sum % 2);
            
            carry = sum / 2;

            i--;
            j--;
        }

        if(carry == 1)
            sb.append(1);
        
        return sb.reverse().toString();
    }
}