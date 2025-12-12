class Solution {
    int[] sumRec(int [] d, int size){
        
        if (size < 0){
            int [] res = new int[d.length +1];
            res[0] = 1;
            return res;
        }

        int sum = d[size] + 1;

        if (sum > 9){
            d[size] = 0;
            return sumRec(d,size-1);

        }   

        d[size] = sum;
        
        return d;

    }
    public int[] plusOne(int[] digits) {
       return sumRec(digits,digits.length-1);
    }
}