/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (33.07%)
 * Total Accepted:    419K
 * Total Submissions: 1.3M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * 
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Note:
 * 
 * All given inputs are in lowercase letters a-z.
 * 
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {    
        if(strs.length == 0)
        return "";  
        if(strs.length == 1){
            return strs[0];
        }          
        String res = strs[0];
        int i, j;
        for(i = 1; i < strs.length; i++){
            for(j = 0; j < res.length(); j++){
                if(j >= strs[i].length() || res.charAt(j) != strs[i].charAt(j)){
                    if(j == 0){
                        return "";
                    }
                    res = res.substring(0,j);
                    break;
                }
            }
        }        
        return res;
    }
}

