// Given the head of a linked list, remove the nth node from the end of the list and return its head.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        if(head == null){return head;}
        ListNode counter = head;
        while(counter != null){
            count++;
            counter = counter.next;
        }
        ListNode temp = head;
        ListNode prev = null;
        int pos = count - n;
        for(int i=0;i<pos;i++){
            prev = temp;
            temp = temp.next;
        }
        if(temp == head){head = head.next;}
        else {prev.next = temp.next;}
        return head;
    }
}
