/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (46.05%)
 * Total Accepted:    523.1K
 * Total Submissions: 1.1M
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 * 
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * 
 * 
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode res;
        if(temp1.val < temp2.val){
            res = new ListNode(temp1.val);
            temp1 = temp1.next;
        }else{
            res = new ListNode(temp2.val);
            temp2 = temp2.next;
        }
        while(temp1 != null || temp2 != null){
            if(temp1 == null || temp1.val > temp2.val){
                res.next = new ListNode(temp2.val);
                temp2 = temp2.next;
            }
            if(temp2 == null || temp2.val > temp1.val){
                res.next = new ListNode(temp1.val);
                temp1 = temp1.next;
            }
        }
        return res;
    }
}

