class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if(n==2)
            return true;
        
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];

        for(int i=1; i<n; i++){
            int currentDx = coordinates[i][0] - coordinates[0][0];
            int currentDy = coordinates[i][1] - coordinates[0][1];
            
            int p1 = dx * currentDy;
            int p2 = dy * currentDx;

            if(p1 != p2)
                return false;
        }

        return true;
    }
}