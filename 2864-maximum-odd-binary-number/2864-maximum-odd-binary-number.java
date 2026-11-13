class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1 = 0;
        int count0 = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '0')
                count0++;
            else
                count1++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append('1');
        count1--;

        while(count0 != 0){
            sb.append('0');
            count0--;
        }
    
        while(count1 != 0){
            sb.append('1');
            count1--;
        }

        return sb.reverse().toString();
    }
}