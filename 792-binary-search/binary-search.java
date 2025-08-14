class Solution {

    private int searchBinary(int[] nums,  int elem, int init, int end) {
        if (init > end) 
            return -1;

        int mid = (init+end)/2;

        if (nums[mid]==elem)
            return mid;
        else if (nums[mid] > elem)
            return searchBinary(nums,elem,init,mid-1);
        else 
            return searchBinary(nums,elem,mid+1,end);

    }
    public int search(int[] nums, int target) {
        return searchBinary(nums,target,0,nums.length-1);

        
    }
}