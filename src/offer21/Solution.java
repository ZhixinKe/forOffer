package offer21;
/*
调整数组顺序使奇数位于偶数之前
 */
public class Solution {

    public int[] exchange(int[] nums) {
        int pre = 0;
        int height = nums.length -1 ;
        while(pre < height){
            while(pre<height && (nums[pre] & 1) == 1){
                pre++;
            }
            while(pre<height && (nums[height] & 1) == 0){
                height--;
            }

            int tem = nums[pre];
            nums[pre] = nums[height];
            nums[height] = tem;
        }
        return nums;
    }

}
