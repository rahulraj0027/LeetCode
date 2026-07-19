class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;

        StringBuilder sb = new StringBuilder();
        int first = 0;
        int second = 0;
        int carry = 0;

        while(i >= 0 || j >= 0){
            first = (i >= 0) ? num1.charAt(i) -'0' : 0;
            second = (j >= 0) ? num2.charAt(j) -'0' : 0;

            int sum = first + second + carry;
            sb.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        if(carry > 0)
            sb.append(carry);
        
        return sb.reverse().toString();
    }
}