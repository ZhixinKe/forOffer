package leetCode.数组;

/**
 * 使用BTS的思路，从右上角，想象为一个二叉树。target比root小，root向左移动。target比root大，root向下移动
 */
public class Solution2 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length==0||matrix[0].length == 0){
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols -1;
        while(row < rows && col >= 0){
            int root = matrix[row][col];
            if(target == root){
                return true;
            }else if(target>root){
                row++;
            }else if(target<root){
                col--;
            }
        }
        return false;
    }



}
