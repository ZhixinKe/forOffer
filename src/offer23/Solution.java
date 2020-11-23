package offer23;


class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

/*
定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
 */

public class Solution {

    //递归
    public ListNode reverseList(ListNode head) {
        //终止条件
        if(head == null || head.next == null){
            return head;
        }
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next  = null;
        return reverse;
    }

    //双指针
    public ListNode reverseList2(ListNode head){
        ListNode cur = head,pre = null;
        while(cur !=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

}
