import java.util.ArrayList;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (35.98%)
 * Total Accepted:    529.3K
 * Total Submissions: 1.5M
 * Testcase Example:  '"()"'
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 
 * 
 * Input: "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "{[]}"
 * Output: true
 * 
 * 
 */
class Solution {
    public boolean isValid(String s) {
        if(s.equals("")){
            return true;
        }
        ArrayList<Character>list = new ArrayList<Character>();
        int length = s.length();
        int i;
        for(i = 0; i < length; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                list.add(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                if(list.isEmpty() || list.get(list.size() - 1) != '('){
                    return false;
                }else{
                    list.remove(list.size() - 1);                 
                }
            }
            if(s.charAt(i) == ']'){
                if(list.isEmpty() || list.get(list.size() - 1) != '['){
                    return false;
                }else{
                    list.remove(list.size() - 1);
                }
            }
            if(s.charAt(i) == '}'){
                if(list.isEmpty() || list.get(list.size() - 1) != '{'){
                    return false;
                }else{
                    list.remove(list.size() - 1);
                }
            }
        }
        if(list.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

