class Solution {
    public int[] productExceptSelf(int[] nums) {
        int list_size = nums.length;
        int[] result = new int[list_size];

        result[0]=1;
        for (int i=1; i < list_size;i++){
            result[i] = result[i-1] * nums[i-1];
        }

        int right = 1;
        for (int j=list_size -1; j>=0; j--){
            result[j] = result[j] * right;
            right = right * nums[j];
        }
        
        return result;
        
    }
}