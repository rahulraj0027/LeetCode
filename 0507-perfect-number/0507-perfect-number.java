class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        if(num == 1)
            return false;

        for(int i=1; i<=Math.sqrt(num); i++){
            if(i==1 || i == Math.sqrt(num))
                sum = sum + i;
            else if(num % i == 0)
                sum = sum + i + (num/i);
        }

        if(sum == num)
            return true;
        
        return false;
    }
}