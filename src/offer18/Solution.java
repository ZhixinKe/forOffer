package offer18;

public class Solution {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x ){val = x;}
    }

    //单指针
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null) return null;
        if(head.val == val){
            head = head.next;
            return head;
        }

        //返回头结点，结点不能变化
        ListNode temp  = head;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
                return  head;
            }
            temp = temp.next;
        }

        throw new RuntimeException("未找到该元素");
    }

    //双指针
    public ListNode deleteNode2 (ListNode head,int val){
        if(head == null) return null;
        if(head.val == val) return head.next;
        ListNode pre = head,cur = head.next;

        while(cur != null && cur.val != val){
            pre = cur;
            cur = cur.next;
        }

        if(cur != null) pre.next = cur.next;
        return head;

    }


}
