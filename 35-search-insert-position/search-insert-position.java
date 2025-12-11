class Solution {
    private int search(int [] nums,int target,int left, int rigth){
        if(left > rigth){
            return left;
        }

        int m = left + (rigth-left)/2;
        if(nums[m] == target){
            return m;
        }

        if(nums[m] > target){
            return search(nums,target,left,m-1);
        }
        else{
            return search(nums,target,m+1,rigth);
        }

    }
    
    public int searchInsert(int[] nums, int target) {
         return search(nums,target,0,nums.length-1);
    }
}