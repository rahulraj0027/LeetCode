class Solution {
    HashMap<Integer, Integer> dp = new HashMap<>();
    public int fibonacci(int n){
        if(dp.containsKey(n))
            return dp.get(n);

        if(n==1)
            return 1;
        if(n==2)
            return 2;

        int first_way = fibonacci(n-1);
        int second_way = fibonacci(n-2);

        int result = first_way + second_way;
        dp.put(n, result);

        return result;
    }
    public int climbStairs(int n) {
        return fibonacci(n);
    }
}