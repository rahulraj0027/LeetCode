class Solution {
    public int commonFactors(int a, int b) {
        int min = (a < b) ? a : b;

        int count = 0;
        int i = 1;
        while(i <= min){
            if(a % i == 0 && b % i == 0)
                count++;
            
            i++;
        }

        return count;
    }
}