package offer22;

class ListNode{
    int val;
    ListNode next;
    ListNode (int x){ val = x;}
}

/**
 * 输入一个链表，输出该链表中倒数第k个节点。
 * 为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有6个节点，从头节点开始，
 * 它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 */
public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head,latter = head;
        //先让former前进k步
        for(int i = 0;i < k;i++) {
            former = former.next;
        }
        //latter距离former k个距离，当former为null，latter就处于倒数第k的位置
        while(former!=null){
            former = former.next;
            latter  = latter.next;
        }
        return latter;
    }
}
