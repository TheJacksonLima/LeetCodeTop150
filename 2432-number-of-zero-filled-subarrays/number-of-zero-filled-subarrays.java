class Solution {
    private long calculateSubArrays(long n){
        return (n*(n+1)/2);
    }

    public long zeroFilledSubarray(int[] nums) {
        long size = nums.length;
        long seqSize = 0;
        long count = 0;

        for(int i=0; i<size;i++){
            //System.out.println("Percorrendo : "+i);
            if(nums[i] == 0){
                seqSize=seqSize+1;

                if(i==size-1){
                    count = count + calculateSubArrays(seqSize);
                }
            }
            else if (seqSize>0){
                count = count + calculateSubArrays(seqSize);
                seqSize=0;
            }
        }

        return count;
    }
}