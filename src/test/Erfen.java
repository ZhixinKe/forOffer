package test;
/*
    二分查询改
 */
public class Erfen {

        public static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            int mid = 0;
            while(left<=right){
                mid = left + (right - left)/2;
                if(target==nums[mid]) return mid;
                else if(target<nums[mid]) right = mid-1;
                else left = mid+1;
            }
            return -1;
        }


    public static void main(String[] args) {
        int []numes = new int[]{-1,0,3,8,9,12};
        System.out.println(search(numes,9)) ;
    }
}
