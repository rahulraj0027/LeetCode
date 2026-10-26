class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num = x;

        int digSum = 0;
        while(num != 0){
            digSum = digSum + num%10;
            num /= 10;
        }

        return (x%digSum == 0) ? digSum : -1;
    }
}