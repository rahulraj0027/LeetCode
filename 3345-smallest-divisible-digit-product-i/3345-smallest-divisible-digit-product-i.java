class Solution {
    public int digitProduct(int n){
        int product = 1;

        while(n != 0){
            if(product == 0)
                return 0;
            int rem = n%10;
            product *= rem;

            n/=10;
        }

        return product;
    }
    
    public int smallestNumber(int n, int t) {
        int i = n;
        while(true){
            if(digitProduct(i) % t == 0)
                return i;
            
            i++;
        }
    }
}