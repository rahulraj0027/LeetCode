class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] strAns = new String[str.length];

        for(int i=0; i<str.length; i++){
            String temp = str[i];

            StringBuilder sb = new StringBuilder();
            char check = temp.charAt(temp.length()-1);

            strAns[check-'1'] = sb.append(temp).deleteCharAt(sb.length()-1).toString();
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strAns.length; i++){
            sb.append(strAns[i]);
            if(i != strAns.length-1)
                sb.append(" ");
        }

        return sb.toString();
    }
}