class Solution {
    public boolean canJump(int[] nums) {
        int max_size = nums.length;
        int max_reach = 0;

        for(int i=0;i<max_size;i++){
            if (i > max_reach){
                return false;
            }
            
            max_reach = Math.max(max_reach,i+nums[i]);

            if (max_reach >= max_size -1){
                return true;
            }

        }
        return true;


        
    }
}