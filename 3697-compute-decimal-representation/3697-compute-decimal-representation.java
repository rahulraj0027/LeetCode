class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();

        int i = 1;
        while(n > 0){
            int lastDig = n%10;

            if(lastDig != 0)
                list.add(lastDig * i);

            i*=10;
            n/=10;
        }
        
        Collections.reverse(list);

        int[] arr = new int[list.size()];
        
        i=0;
        for(int num : list){
            arr[i] = num;
            i++;
        }

        return arr;
    }
}