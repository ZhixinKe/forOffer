package leetCode.数组;
/*
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
输入：head = [1,3,2]
输出：[2,3,1]

 */

import java.util.ArrayList;
import java.util.Stack;
//利用栈
public class Solution6 {
    public int[] reversePrint(ListNode head) {

        Stack<Integer> stack = new Stack<Integer>();
        while(head!=null){
            stack.add(head.val);
            head = head.next;
        }
        int length = stack.size();
        int []result  = new int[length];
        for (int i=0;i<length;i++){
            result[i] = stack.pop();
        }
        return result;
    }



    /*
    利用递归： 先走至链表末端，回溯时依次将节点值加入列表 ，这样就可以实现链表值的倒序输出。
     */
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    public int[] reversePrint2(ListNode head){
        rever(head);
        int []result = new int[arrayList.size()];
        for (int i=0;i<result.length;i++){
            result[i] = arrayList.get(i);
        }
        return result;

    }

        void rever(ListNode head){
            if(head==null){
               return;
            }
            rever(head.next);
            arrayList.add(head.val);
        }
    }

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
