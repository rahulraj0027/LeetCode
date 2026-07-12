class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int hrDiff = Integer.parseInt(endTime.substring(0,2)) - Integer.parseInt(startTime.substring(0,2));
        int minDiff = Integer.parseInt(endTime.substring(3,5)) - Integer.parseInt(startTime.substring(3,5));
        int secDiff = Integer.parseInt(endTime.substring(6)) - Integer.parseInt(startTime.substring(6));

        
        return (hrDiff*3600 + minDiff*60 + secDiff);
    }
}