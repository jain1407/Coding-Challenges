// Given an array, your task is to find the one continuous subarray that if you only sort this subarray in ascending order,
// then the whole array will be sorted in ascending order, too.

// You need to find the shortest such subarray and output its length.

// Example 1:
// Input: [2, 6, 4, 8, 10, 9, 15]
// Output: 5
// Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.


public class Solution {
    public int findUnsortedSubarray(int[] nums) {
    
        // First we make a stack
        Stack <Integer> stack = new Stack <Integer>();
        int l = nums.length, r = 0;
        
        for (int i = 0; i < nums.length; i++) {
        
            System.out.println("i is" + i);
          
            // In the first loop, the second part of the expression is not evaluated due to short-circuiting
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i])
                l = Math.min(l, stack.pop());
                System.out.println("Value of l is" + l);
            stack.push(i);
            
            // The approach is to constantly keep on pushing the values of i on the stack and check if the number at that position
            // is bigger than the next number. If that is the case, then l is made to be that index. 
        }
        stack.clear();
        
        // This loop also employs the same strategy as it finds the rightmost value where the pattern breaks
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i])
                r = Math.max(r, stack.pop());
            stack.push(i);
        }
        return r - l > 0 ? r - l + 1 : 0;
    }
}
