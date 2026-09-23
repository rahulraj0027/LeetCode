class Solution {
public:
    bool isPalindrome(int x) 
    {
        if(x<0 || x > INT32_MAX)
            return 0;
        
        int sum=0, rem;
        for(int i=x; i>0; i/=10)
        {
            rem = i%10;
            if(sum>=INT_MAX/10)
                return 0;
            sum = sum*10+rem;
        }
        if(sum==x)
            return 1;
        else 
            return 0;
    }
};