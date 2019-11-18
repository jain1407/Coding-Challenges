// X is a good number if after rotating each digit individually by 180 degrees, we get a valid number that is different from X.  
// Each digit must be rotated - we cannot choose to leave it alone.
// A number is valid if each digit remains a digit after rotation. 
// 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 
// 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number and become invalid.

// Now given a positive number N, how many numbers X from 1 to N are good?

class Solution {
    public int rotatedDigits(int N) {
        int good = 0;
        int i = 0;
        while(i++ < N){
            boolean flag = false;
            int t = i;
            while(t > 0){
                int d = t%10;
                if(d == 2 || d == 5 || d == 6 || d == 9){
                    flag = true;
                }
                if(d == 3 || d == 4 || d == 7){
                   flag = false;
                   break;
                }
                t /= 10;
            }
            if(flag) good++;
        }
        
        return good;
    }
}
