class Solution {
    public int[] twoSum(int[] numbers, int target) {
 /*       if ((numbers == null) || (target == null)){
            return [];
        }
*/
        int posBegin = 0;
        int posEnd = numbers.length - 1;

        while(posEnd > posBegin){
            int sum = numbers[posBegin] + numbers[posEnd];
            if (sum == target){
                break;
            }
            else if (target > sum){
                posBegin+=1;
            }
            else{
                posEnd-=1;
            }

        }
        return new int[] {posBegin+1,posEnd+1};

    }
}