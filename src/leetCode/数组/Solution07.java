package leetCode.数组;

import java.util.HashMap;
import java.util.Map;


/*
描述输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]

 */
public class Solution07 {
    int [] po ;
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder,int[] inorder){
        po = preorder;
        for(int i =0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);

    }

    private TreeNode recur(int pre_root,int in_left,int in_right) {
        if(in_left>in_right) return null;
        //先找根节点改动
        TreeNode root = new TreeNode(po[pre_root]);
        //根节点索引
        int i = map.get(po[pre_root]);

        root.left = recur(pre_root+1,in_left,i-1);
        root.right = recur(pre_root + i - in_left + 1,i+1,in_right);
        return  root;
    }


}

class TreeNode{
    int val;
    TreeNode root;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }


/*    public static void main(String args[]){
        int []preorder = {3,9,8,5,2,20,15,7};
        int []inorder = {5,8,9,2,3,15,20,7};
        Solution07 s = new Solution07();
        s.buildTree(preorder,inorder);
    }*/

}