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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists ==null || lists.length ==0){
            return null;
        }
        ListNode head = lists[0];

        for(int i=1;i<lists.length;i++){
            head = mergeTwoLists(head,lists[i]);
        }
        return head;

    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = list1;
        ListNode sec = list2;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        while(first != null && sec!=null){
            if(first.val <sec.val){
                curr.next = first;
                first = first.next;
            }else{
                curr.next = sec;
                sec = sec.next;
            }
            curr = curr.next;
        }

        while(first!=null){
            curr.next = first;
            first = first.next;
            curr = curr.next;
        }

        while(sec!=null){
            curr.next = sec;
            sec = sec.next;
            curr = curr.next;
        }
        
        return dummy.next;
    }
}
