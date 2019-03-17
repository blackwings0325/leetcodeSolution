/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.18%)
 * Total Accepted:    625.5K
 * Total Submissions: 2.5M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 123
 * Output: 321
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -123
 * Output: -321
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 120
 * Output: 21
 * 
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
 * of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 * 
 */
class Solution {
    public int reverse(int x) {
        if(x == -2147483648){
            return 0;
        }
        int res = 0;
        int temp = x;
        int addin;
        int flag = 1;
        int test = 2147483647;
        if(x <  0){
            flag = -1;
            temp = -x;
        }
        
        int times = 0;
        while(temp != 0){
            addin = temp % 10;
            if(times >= 9){
                if(test / res < 10){
                    return 0;
                }else{
                    if(addin > test - res * 10){
                        return 0;
                    }
                }
            }
            res = res*10 + addin;
            temp = temp / 10;
            times++;
        }
        return res * flag;      
    }
}

