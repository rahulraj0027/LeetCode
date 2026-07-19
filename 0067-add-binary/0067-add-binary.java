class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;

        int carry = 0;
        while(i >= 0 && j >= 0){
            int first = a.charAt(i) - '0';
            int second = b.charAt(j) - '0';

            int sum = first + second + carry;
            if(sum >= 2){
                carry = 1;
                sum = sum-2;
            }
            else
                carry = 0;

            sb.append((char)(sum + '0'));

            i--;
            j--;
        }

        while(i>=0){
            int num = a.charAt(i) - '0';

            int sum = num + carry;
            if(sum >= 2){
                carry = 1;
                sum = sum-2;
            }
            else
                carry = 0;

            sb.append((char)(sum + '0'));

            i--;
        }

        while(j>=0){
            int num = b.charAt(j) - '0';

            int sum = num + carry;
            if(sum >= 2){
                carry = 1;
                sum = sum-2;
            }
            else
                carry = 0;

            sb.append((char)(sum + '0'));

            j--;
        }

        if(carry == 1)
            sb.append((char)(carry + '0'));
        
        return sb.reverse().toString();
    }
}