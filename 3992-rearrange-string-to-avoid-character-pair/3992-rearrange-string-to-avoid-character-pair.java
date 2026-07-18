class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb = new StringBuilder();
        int countX = 0;
        int countY = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == x)
                countX++;
            else if(ch == y)
                countY++;
        }

        for(int i=0; i<countY; i++)
            sb.append(y);
        for(int i=0; i<countX; i++)
            sb.append(x);

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch != x && ch != y)
                sb.append(ch);
        }

        return new String(sb);
    }
}