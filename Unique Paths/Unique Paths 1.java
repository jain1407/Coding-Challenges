A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time. 
The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
How many possible unique paths are there?

Example 1:
Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right

Example 2:
Input: m = 7, n = 3
Output: 28

class Solution {
    public int uniquePaths(int m, int n) {
        // m is cols and n is rows. so n x m matrix
        int[][] dp = new int[n][m];
        dp[0][0] = 1;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i ==0 && j ==0)
                    continue;
                if(i == 0 && j > 0){
                    dp[0][j] = 1; // Since we can only go right and down, we are sure that there is only one way to get to any right hand block
                }
                if(j == 0 && i > 0){
                    dp[i][0] = 1;
                }
                if(i > 0 && j > 0)
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
    }
}
