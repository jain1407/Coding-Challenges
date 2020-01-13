A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time. 
The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
Now consider if some obstacles are added to the grids. How many unique paths would there be?

Example 1:
Input:
[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
Output: 2
Explanation:
There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0][0] == 1){
            return 0;
        }
        
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        dp[0][0] = 1;
        
        for(int i = 0; i < obstacleGrid.length; i++){
            for(int j = 0; j < obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j] == 0){
                    if(i == 0 && j > 0){
                        dp[0][j] = (dp[0][j] == 0 && dp[0][j-1] == 1) ? 1 : 0;
                    }
                    if(j == 0 && i > 0){
                        dp[i][0] = (dp[i][0] == 0 && dp[i-1][0] == 1) ? 1 : 0;
                    }
                    if(i > 0 && j > 0){
                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    } 
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
