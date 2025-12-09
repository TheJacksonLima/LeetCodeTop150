class Solution {
    public int jump(int[] nums) {
        int max_size = nums.length;

        if ((max_size == 0) || (max_size == 1)) return 0;

        int j = 0;
        int edge = 0;
        int max_reach = 0;

        for(int i=0;i<nums.length -1;i++){
            max_reach = Math.max(max_reach,i+nums[i]);
            if(i == edge){
                j++;
                edge = max_reach;
            }

        }
        return j;
    }
}