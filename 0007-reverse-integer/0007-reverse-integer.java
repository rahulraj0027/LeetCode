class Solution {
    public int reverse(int x) {
        int rem;
        long rev =0;
            for(int i=x; i>0 || i<0; i/=10)   
                {
                    rem = i%10;
                    rev = rev*10 + rem;
                }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;
        //else if(x < 0)
            //return (int)-rev;
        return (int)rev;
    }
}