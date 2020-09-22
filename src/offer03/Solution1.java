package offer03;

import java.util.HashSet;

import java.util.Set;

/*
    set查重
 */
public class Solution1 {
    public int findRepeatNumber(int[] nums) {
        int length = nums.length;
        Set set = new HashSet();
        for(int i=0;i<length;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        throw new IllegalArgumentException("没有重复的数字");


    }

    /*
        原地置换，思路：每次交换完（相当于排序），必须重头（重头）开始遍历，判断交换之后每个位置是否在正确的位置上

     */
    public int findRepeatNumber2(int[] nums){
        for(int i=0;i<nums.length;i++){
            //元素与下标相同，处于正确位置，不需要做处理
            if(nums[i]==i){
                continue;
            }
            //出现重复，直接返回
            if(nums[i] == nums[nums[i]]){
                return nums[i];
            }

            //交换
            int temp = nums[nums[i]];
            nums[nums[i]] = nums[i];
            nums[i] = temp;
            //i--是要将索引回到头部，进行重头遍历
            i--;
        }
        return -1;
    }

    /*
        使用辅助数组，利用hash思想
        hash:它采用了函数映射的思想将记录的存储位置与记录的关键字关联起来,空间换时间
    */

    public int findRepeatNumber3(int[] nums){
        int [] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            if(arr[nums[i]]>1){
                return nums[i];
            }
        }
        return -1;
    }
}

