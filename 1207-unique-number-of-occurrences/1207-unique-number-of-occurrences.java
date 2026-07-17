class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int freq[] = new int[2001];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0)
                freq[Math.abs(arr[i]) + 1000]++;
            else
                freq[arr[i]]++;
        }

        Arrays.sort(freq);
        for(int i=0; i<freq.length-1; i++){
            if(freq[i] == 0)
                continue;
            if(freq[i] == freq[i+1])
                return false;
        }

        return true;
    }
}