package leetCode.数组;

import java.util.HashMap;
import java.util.Map;

/*


 */
public class Solution1 {
    //哈希表
    public int[] twoSum(int []nums,int target){
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            map.put(nums[i],i);

        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //暴力破解
    public int[] twoSum2(int[]nums,int target){

        for (int i=0;i<nums.length;i++){
            int temp = target - nums[i];
            for(int y=i+1;y<nums.length;y++){
                if(temp == nums[y]){
                    return new int[]{i,y};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
